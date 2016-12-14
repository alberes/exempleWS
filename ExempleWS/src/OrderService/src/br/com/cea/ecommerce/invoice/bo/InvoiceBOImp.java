package br.com.cea.ecommerce.invoice.bo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex.ArrayOfInvoiceConfirmDto;
import org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex.InvoiceConfirmDto;
import org.datacontract.schemas._2004._07.wmi_domain_business.ServiceResponse;
import org.tempuri.IWmiService;
import org.tempuri.WmiService;

import com.sun.xml.ws.client.BindingProviderProperties;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.util.EcommerceProperties;
import br.com.cea.ecommerce.common.vo.IntegrationStatus;
import br.com.cea.ecommerce.invoice.dao.InvoiceDAO;
import br.com.cea.ecommerce.invoice.dao.InvoiceDAOImp;
import br.com.cea.ecommerce.invoice.vo.CustomerVO;
import br.com.cea.ecommerce.invoice.vo.InvoiceSynchro;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;
import br.com.cea.ecommerce.order.bo.OrderBO;
import br.com.cea.ecommerce.order.bo.OrderBOImp;

public class InvoiceBOImp implements InvoiceBO{

	private Logger logger = LogManager.getLogger(getClass());
	
	private static final String WEVO_NAMESPACE = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto";
	
	@Override
	public InvoiceVO createInvoice(InvoiceVO invoiceVO) throws BusinessException, Exception{
		InvoiceDAO invoiceDAO = null;
		CustomerVO customer = null;
		br.com.cea.ecommerce.order.vo.CustomerVO customerOrder = null;
		OrderBO orderBO = new OrderBOImp();
		Date now = new Date();
		
		try {
			customer = invoiceVO.getCustomer();
			customerOrder = orderBO.getCustomer(customer.getDocument(), invoiceVO.getAddress().getStreet());
			
			if(customerOrder == null){
				throw new BusinessException("Cliente nao encontrado.");
			}
			
			customer.setSequence(customerOrder.getSequence());
			customer.setCustomerSynchroId(customerOrder.getSynchroId());
			
			invoiceDAO = new InvoiceDAOImp(null);
			invoiceVO.setRecordCreateDate(now);
			invoiceVO.setRecordUpdateDate(now);
			invoiceVO.setCreateDate(now);
			invoiceVO.setUpdateDate(now);
			invoiceVO.setIssuanceDate(now);
			invoiceVO.getOrder().setRecordCreateDate(now);
			invoiceVO.getOrder().setRecordUpdateDate(now);
			invoiceVO.getCustomer().setRecordCreateDate(now);
			invoiceVO.getCustomer().setRecordUpdateDate(now);
			invoiceVO.getAddress().setRecordCreateDate(now);
			invoiceVO.getAddress().setRecordUpdateDate(now);
			invoiceVO.getCourier().setRecordCreateDate(now);
			invoiceVO.getCourier().setRecordUpdateDate(now);
			invoiceVO.getTotals().setRecordCreateDate(now);
			invoiceVO.getTotals().setRecordUpdateDate(now);
			invoiceVO.setIntegrationStatus(IntegrationStatus.getIntegrationStatus(1));
			
			invoiceDAO.saveInvoice(invoiceVO);
			invoiceDAO.saveOrder(invoiceVO.getOrder());
			invoiceDAO.saveAllItems(invoiceVO.getOrder().getItems());
			invoiceDAO.saveAllPayments(invoiceVO.getPayments());
			//invoiceDAO.saveCustomer(invoiceVO.getCustomer());
			//invoiceDAO.saveAddress(invoiceVO.getAddress());
			invoiceDAO.saveCourier(invoiceVO.getCourier());
			invoiceDAO.saveTotals(invoiceVO.getTotals());
			
			invoiceDAO.commit();
		} catch (DAOException e) {
			logger.error("Falha no acesso ao banco de dados", e);
			invoiceDAO.rollback();
			throw new Exception(e);
		}finally{
			invoiceDAO.close();
		}
		
		return invoiceVO;
	}
	
	@Override
	public Integer sendInvoiceToWevo() throws BusinessException, Exception{
		InvoiceDAO dao = null;
		List<InvoiceSynchro> invoices = null;
		WmiService wmiService = null;
		IWmiService iwmiService = null;
		ArrayOfInvoiceConfirmDto listInvoiceIdConfirmation = null;
		ServiceResponse serviceResponse = null;
		int quantity = 0;
		
		try{
			dao = new InvoiceDAOImp(null);
			invoices = dao.getSynchroInvoices();
			
			if(invoices != null && invoices.size() != 0){
				wmiService = new WmiService();
				iwmiService = wmiService.getBasicHttpBindingIWmiService();
				BindingProvider bp = (BindingProvider) iwmiService;
				EcommerceProperties env = EcommerceProperties.getInstance();
				
				Map<String, Object> c = bp.getRequestContext();
				c.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, env.getEndpoint());
				c.put(BindingProviderProperties.REQUEST_TIMEOUT, 0);
				c.put(BindingProviderProperties.CONNECT_TIMEOUT, 0);
				
				for(InvoiceSynchro invoice : invoices){
					listInvoiceIdConfirmation = new ArrayOfInvoiceConfirmDto();
					InvoiceConfirmDto dto = new InvoiceConfirmDto();
					
					String invoiceNumber = invoice.getInvoiceNumber() + "-" + invoice.getSerie();
					JAXBElement<String> documentId = new JAXBElement<String>(
							new QName(WEVO_NAMESPACE, "FiscalDocumentId"),
							String.class,
							invoiceNumber);
					dto.setFiscalDocumentId(documentId);
					
					Double doubleValue = invoice.getTotalValue() * 100;
					Long roundedValue = Math.round(doubleValue); 
					dto.setFiscalDocumentValue(roundedValue.intValue());

					String invoiceIdParse = invoice.getSynchroId().replace("VTEX", "").split("_")[0];
					if(invoiceIdParse == null || invoiceIdParse.length() == 0){
						continue;
					}
					JAXBElement<String> invoiceId = new JAXBElement<String>(
							new QName(WEVO_NAMESPACE, "Id"),
							String.class,
							invoiceIdParse);
					dto.setId(invoiceId);
					
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'");
					JAXBElement<String> issuanceDate = new JAXBElement<String>(
							new QName(WEVO_NAMESPACE, "FiscalDocumentIssuanceDate"),
							String.class,
							sdf.format(invoice.getIssuanceDate()));
					dto.setFiscalDocumentIssuanceDate(issuanceDate);
					
					JAXBElement<String> accessKey = new JAXBElement<String>(
							new QName(WEVO_NAMESPACE, "FiscalDocumentAcessKey"),
							String.class, invoice.getAccessKey());
					
					dto.setFiscalDocumentAcessKey(accessKey);
					
					JAXBElement<String> xml = new JAXBElement<String>(
							new QName(WEVO_NAMESPACE, "FiscalDocumentEmbeddedDocument"),
							String.class, invoice.getXml());
					dto.setFiscalDocumentEmbeddedDocument(xml);
					
					listInvoiceIdConfirmation.getInvoiceConfirmDto().add(dto);
					try{
						serviceResponse = iwmiService.invoiceConfirm(env.getEnvironment(), listInvoiceIdConfirmation);
						if(serviceResponse.isStatus() &&
								serviceResponse.getDetails() != null && 
								serviceResponse.getDetails().getValue() != null &&
								serviceResponse.getDetails().getValue().getDetail().get(0) != null &&
								serviceResponse.getDetails().getValue().getDetail().get(0).isStatus()){
							quantity += dao.updateStatus(invoice, IntegrationStatus.getIntegrationStatus(5));
						}
					} catch (Exception e){
						logger.error("Erro ao enviar confirma��o de invoice para a Wevo", e);
					}
					dao.commit();
				}
				
			}
		}catch (Exception e) {
			String msg = "Falha ao processas as invoices";
			logger.error(msg, e);
			dao.rollback();
			throw new BusinessException(msg, e);
		}finally{
			dao.close();
		}
		
		return quantity;
	}
	
	@Override
	public boolean existsInvoice(String id) throws BusinessException, Exception{
		InvoiceDAO invoiceDAO = new InvoiceDAOImp(null);
		 boolean exists = invoiceDAO.existsInvoiceById(id);
		 invoiceDAO.close();
		 return exists;
	}
	
	@Override
	public Long getStoreOrderIdByOrderId(String orderId) throws BusinessException, Exception{
		InvoiceDAO invoiceDAO = new InvoiceDAOImp(null);
		return invoiceDAO.getStoreOrderIdByOrderId(orderId);
	}
}