package br.com.cea.ecommerce.order.bo;

import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.wmi_domain_business.ServiceResponse;
import org.tempuri.IWmiService;
import org.tempuri.WmiService;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.commons.util.StringUtil;
import br.com.cea.ecommerce.common.util.EcommerceProperties;
import br.com.cea.ecommerce.common.vo.IntegrationStatus;
import br.com.cea.ecommerce.order.dao.OrderDAO;
import br.com.cea.ecommerce.order.dao.OrderDAOImp;
import br.com.cea.ecommerce.order.vo.AddressVO;
import br.com.cea.ecommerce.order.vo.CustomerVO;
import br.com.cea.ecommerce.order.vo.OrderVO;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.sun.xml.ws.client.BindingProviderProperties;

public class OrderBOImp implements OrderBO {
	
	private Logger logger = LogManager.getLogger(getClass());
	
	@Override
	public OrderVO createOrder(OrderVO orderVO) throws BusinessException, Exception{
		OrderDAO orderDAO = new OrderDAOImp(null);
		try{
			
			CustomerVO customer = orderVO.getCustomer();
			customer.setIntegrationStatus(IntegrationStatus.getIntegrationStatus(1));
			AddressVO address = customer.getAddress();
			List<AddressVO> addresses = orderDAO.getAddressByCustomeDocument(customer.getDocument());
			
			for(AddressVO a : addresses){
				if(compareAddress(address, a)){
					//Cliente ja tem o pedido com mesmo endereco nao precisa gravar o cliente e o endereco
					customer.setSequence(a.getCustomer().getSequence());
					break;
				}
			}
			
			if(addresses.isEmpty()){				
				//Primeiro pedido do cliente
				customer.setSequence(1L);
				customer.setSynchroId(customer.getDocument() + StringUtil.lpad("" + customer.getSequence(), '0', 3));
				orderDAO.saveCustomer(orderVO.getCustomer());
				orderDAO.saveAddress(orderVO.getCustomer().getAddress());
			}else if(customer.getSequence() == null){
				//Cliente com novo endereco (rua)
				customer.setSequence(new Long(addresses.size() + 1));
				customer.setSynchroId(customer.getDocument() + StringUtil.lpad("" + customer.getSequence(), '0', 3));
				orderDAO.saveCustomer(orderVO.getCustomer());
				orderDAO.saveAddress(orderVO.getCustomer().getAddress());
			}
			
			orderDAO.saveOrder(orderVO);
			orderDAO.saveAllItems(orderVO.getItems());
			orderDAO.saveAllPayments(orderVO.getPayments());
			
			orderDAO.commit();
		}catch(DAOException e){
			logger.error("Falha no acesso ao banco de dados", e);
			orderDAO.rollback();
			throw new Exception(e);
		}finally{
			orderDAO.close();
		}
		return orderVO;
	}
	
	public CustomerVO getCustomerByDocument(){
		CustomerVO customer = new CustomerVO();
		
		return customer;
	}
	
	public CustomerVO getCustomer(String document, String street) throws BusinessException, Exception{
		OrderDAO orderDAO = new OrderDAOImp(null);
		CustomerVO customerVO = null;
		List<CustomerVO> list = orderDAO.getCustomersAndAddressByDocument(document);
		orderDAO.close();
		
		if(list.isEmpty()){
			throw new BusinessException("Cliente nao encontrado.");
		}
		
		//Caso nao seja passado a rua retornar o ultimo
		if(street == null){
			return list.get(list.size() - 1);
		}
		
		for(CustomerVO c: list){
			if(street.equalsIgnoreCase(c.getAddress().getStreet())){
				customerVO = c;
				break;
			}
		}
		
		if(customerVO == null){
			customerVO = list.get(list.size() - 1);
		}
		
		return customerVO;
	}
	
	public CustomerVO getCustomerByOrderId(String orderId) throws BusinessException, Exception{
		OrderDAO orderDAO = new OrderDAOImp(null);
		CustomerVO customer = orderDAO.getCustomerByOrderId(orderId);
		orderDAO.close();
		return customer;
	}
	
	public Integer sendOrderToWevo() throws BusinessException, Exception{
		OrderDAO orderDAO = null;
		List<OrderVO> orders = null;
		WmiService wmiService = null;
		IWmiService iwmiService = null;
		ArrayOfstring listOrderIdConfirmation = null;
		ServiceResponse serviceResponse = null;
		int quantity = 0;
		
		try{
			orderDAO = new OrderDAOImp(null);
			orders = orderDAO.getOrderConfirmToWevo();
			
			if(orders != null && orders.size() != 0){
				wmiService = new WmiService();
				iwmiService = wmiService.getBasicHttpBindingIWmiService();
				BindingProvider bp = (BindingProvider) iwmiService;
				EcommerceProperties env = EcommerceProperties.getInstance();
				
				Map<String, Object> c = bp.getRequestContext();
				c.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, env.getEndpoint());
				c.put(BindingProviderProperties.REQUEST_TIMEOUT, 0);
				c.put(BindingProviderProperties.CONNECT_TIMEOUT, 0);
				
				for(OrderVO order : orders){
					listOrderIdConfirmation = new ArrayOfstring();
					listOrderIdConfirmation.getString().add(order.getId());
					try{
						serviceResponse = iwmiService.orderConfirm(env.getEnvironment(), listOrderIdConfirmation);
						if(serviceResponse.isStatus() &&
								serviceResponse.getDetails() != null && 
								serviceResponse.getDetails().getValue() != null &&
								serviceResponse.getDetails().getValue().getDetail().get(0) != null &&
								serviceResponse.getDetails().getValue().getDetail().get(0).isStatus()){
							quantity += orderDAO.updateStatus(order, IntegrationStatus.getIntegrationStatus(5));
						}
					} catch (Exception e){
						logger.error("Falha ao enviar confirmação de pedidos para a Wevo", e);
					}
					orderDAO.commit();
				}

			}
		}catch (Exception e) {
			String msg = "Falha ao processar os pedidos";
			logger.error(msg, e);
			orderDAO.rollback();
			throw new BusinessException(msg, e);
		}finally{
			orderDAO.close();
		}
		
		return quantity;
	}
	
	private boolean compareAddress(AddressVO a1, AddressVO a2){
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		sb1.append(a1.getStreet());
		sb1.append(a1.getNumber());
		sb1.append(a1.getNeighborhood());
		sb1.append(a1.getCity());
		sb1.append(a1.getState());
		sb1.append(a1.getCountry());
		sb1.append(a1.getPostalCode());
		
		sb2.append(a2.getStreet());
		sb2.append(a2.getNumber());
		sb2.append(a2.getNeighborhood());
		sb2.append(a2.getCity());
		sb2.append(a2.getState());
		sb2.append(a2.getCountry());
		sb2.append(a2.getPostalCode());
		
		return sb1.toString().equalsIgnoreCase(sb2.toString());
	}
}
