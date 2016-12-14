package br.com.cea.ecommerce.order.ws;

import java.util.List;

import br.com.cea.ebo.cea.ecommerce.order.v1.Address;
import br.com.cea.ebo.cea.ecommerce.order.v1.ConnectorResponses;
import br.com.cea.ebo.cea.ecommerce.order.v1.Customer;
import br.com.cea.ebo.cea.ecommerce.order.v1.Item;
import br.com.cea.ebo.cea.ecommerce.order.v1.ItemList;
import br.com.cea.ebo.cea.ecommerce.order.v1.Order;
import br.com.cea.ebo.cea.ecommerce.order.v1.Payment;
import br.com.cea.ebo.cea.ecommerce.order.v1.PaymentList;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.order.vo.AddressVO;
import br.com.cea.ecommerce.order.vo.ConnectorResponseVO;
import br.com.cea.ecommerce.order.vo.CustomerVO;
import br.com.cea.ecommerce.order.vo.ItemVO;
import br.com.cea.ecommerce.order.vo.OrderVO;
import br.com.cea.ecommerce.order.vo.PaymentVO;

public class OrderConverter {
	
	public static synchronized void copyFromOrderToOrderVO(Order order, OrderVO orderVO){
		orderVO.setId(order.getOrderId());
		orderVO.setSequence(order.getSequence());
		orderVO.setGroup(order.getOrderGroup());
		orderVO.setStatus(order.getStatus());
		orderVO.setStatusDescription(order.getStatusDescription());
		orderVO.setValue(order.getValue());
		//orderVO.setProfileId(order.get)
		//orderVO.setAddress(order.getAddress().get)
		orderVO.setCreateDate(DateTimeUtil.convertGregorianToDate(order.getCreationDate()));
		orderVO.setUpdateDate(DateTimeUtil.convertGregorianToDate(order.getLastChange()));
		orderVO.setOrigin(order.getOrigin());
		orderVO.setFollowupEmail(order.getFollowUpEmail());
		orderVO.setHost(order.getHostname());
		orderVO.setChangeAttachment(order.getChangesAttachment());
		//orderVO.setMarketPlaceOrderId(order.getMarketingData().getId());
		//orderVO.setOperatorId(order.getCustomer().getProfileId())
		//orderVO.setMarketingDataId(marketPlaceOrderId)
		//orderVO.setRatesBenefitsId(order.getRatesAndBenefits().getRatesAndBenefits());
		//orderVO.setTransactionId(order.getTransactions());
		//orderVO.setTotals(totals)
		//TODO:
		orderVO.setChangesDataId(0L);
		orderVO.setLogisticsInfoId(0L);
		copyFromCustomerToCustomerVO(order.getCustomer(), orderVO.getCustomer());
		copyFromAddressToAddressVO(order.getAddress(), orderVO.getCustomer().getAddress());
		
		addAllItems(orderVO, order.getItems());
		addAllPayments(orderVO, order.getTransactions().getInvoiceTransaction().get(0).getPayments());
	}
	
	public static synchronized void copyFromCustomerToCustomerVO(Customer customer, CustomerVO customerVO){
		if(customer != null){
			customerVO.setId(customer.getProfileId());
			customerVO.setEmail(customer.getEmail());
			customerVO.setFirstName(customer.getFirstName());
			customerVO.setLastName(customer.getLastName());
			customerVO.setDocumentType(customer.getDocumentType());
			customerVO.setDocument(customer.getDocument());
			customerVO.setCorporate(customer.isIsCorporate());
			customerVO.setPhone(customer.getPhone());
			customerVO.setCorporateName(customer.getCorporateName());
			customerVO.setTradeName(customer.getTradeName());
			customerVO.setCorporateDocument(customer.getCorporateDocument());
			customerVO.setStateInscription(customer.getStateInscription());
			customerVO.setCorporatePhone(customer.getCorporatePhone());
		}
	}
	
	public static synchronized void copyFromAddressToAddressVO(Address address, AddressVO addressVO){
		if(address != null){
			addressVO.setStreet(address.getStreet());
			addressVO.setNumber(address.getNumber());
			addressVO.setComplement(address.getComplement());
			addressVO.setNeighborhood(address.getNeighborhood());
			addressVO.setCity(address.getCity());
			addressVO.setState(address.getState());
			addressVO.setCountry(address.getCountry());
			addressVO.setFormattedAddress(address.getFormattedAddress());
			addressVO.setPostalCode(address.getPostalCode());
			addressVO.setReference(address.getReference());
			addressVO.setReceiveName(address.getReceiverName());
		}
	}
	
	public static synchronized void copyFromPaymentToPaymentVO(Payment payment, PaymentVO paymentVO){
		if(payment != null){
			paymentVO.setId(payment.getId());
			paymentVO.setPaymentSystem(payment.getPaymentSystem());
			paymentVO.setPaymentSystemName(payment.getPaymentSystemName());
			paymentVO.setValue(payment.getValue());
			paymentVO.setInstallments(payment.getInstallments());
			paymentVO.setReferenceValue(payment.getReferenceValue());
			paymentVO.setFirstDigits(payment.getFirstDigits());
			paymentVO.setLastDigits(payment.getLastDigits());
			paymentVO.setUrl(payment.getUrl());
			paymentVO.setGiftCardId(payment.getGiftCardId());
			paymentVO.setGiftCardName(payment.getGiftCardName());
			paymentVO.setGiftCardCaption(payment.getGiftCardCaption());
			paymentVO.setRedemptionCode(payment.getRedemptionCode());
			paymentVO.setGroup(payment.getGroup());
			//paymentVO.setBillingAddress(payment.getBillingAddress());
		}
	}

	public static synchronized void addAllPayments(OrderVO orderVO, PaymentList paymentList){
		if(paymentList != null){
			List<PaymentVO> payments = orderVO.getPayments();
			for(Payment payment : paymentList.getInvoiceTransactionPayment()){
				PaymentVO paymentVO = new PaymentVO();
				paymentVO.setOrder(orderVO);
				copyFromPaymentToPaymentVO(payment, paymentVO);
				copyFromConnectorToConnectorVO(payment.getConnectorResponses(), paymentVO.getConnectorResponse());
				payments.add(paymentVO);
			}
		}
	}
	
	public static synchronized void copyFromConnectorToConnectorVO(ConnectorResponses connectorResponses, ConnectorResponseVO connectorResponseVO){
		if(connectorResponses != null){
			connectorResponseVO.setArp(connectorResponses.getArp());
			connectorResponseVO.setAuthId(connectorResponses.getAuthId());
			connectorResponseVO.setMessage(connectorResponses.getMessage());
			connectorResponseVO.setNsu(connectorResponses.getNsu());
			connectorResponseVO.setReturCod(connectorResponses.getReturnCode());			
			connectorResponseVO.setTid(connectorResponses.getTid());
			connectorResponseVO.setNumberAuthentication(connectorResponses.getNumAutent());
			connectorResponseVO.setNumberCV(connectorResponses.getNumCv());			
		}
	}
	
	public static synchronized void copyFromItemToItemVO(Item item, ItemVO itemVO){
		if(item != null){
			itemVO.setSku(item.getSku().getId());
			itemVO.setQuantity(item.getQuantity());
			itemVO.setSallingPrice(item.getSellingPrice());
			itemVO.setTax(item.getTax());
			itemVO.setShipping(item.getShipping());
			itemVO.setDiscounts(item.getDiscounts());
			itemVO.setCurrency(item.getCurrency());
			itemVO.setUnitMeasure(item.getUnitOfMeasure());
			itemVO.setPrice(item.getPrice());
			itemVO.setListPrice(item.getListPrice());
			itemVO.setImageUrl(item.getImageUrl());
			itemVO.setDetailUrl(item.getDetailUrl());
			itemVO.setGift(item.isIsGift());
			itemVO.setItemIndex(item.getIndex());
			itemVO.setLockId(item.getLockId());
		}
	}
	
	public static synchronized void addAllItems(OrderVO orderVO, ItemList itemList){
		if(itemList != null){
			List<ItemVO> items = orderVO.getItems();
			int index = 1;
			for(Item item : itemList.getItem()){
				ItemVO itemVO = new ItemVO();
				itemVO.setOrder(orderVO);
				itemVO.setSequence(index++);
				copyFromItemToItemVO(item, itemVO);
				items.add(itemVO);
			}
		}
	}
}
