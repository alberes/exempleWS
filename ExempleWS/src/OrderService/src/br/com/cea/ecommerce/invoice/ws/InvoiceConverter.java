package br.com.cea.ecommerce.invoice.ws;

import java.util.Date;
import java.util.List;

import br.com.cea.ebo.cea.ecommerce.invoice.v1.Address;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.ConnectorResponses;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.Courier;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.Customer;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.Invoice;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.Item;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.ItemList;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.Order;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.Payment;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.PaymentList;
import br.com.cea.ebo.cea.ecommerce.invoice.v1.Totals;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.invoice.vo.AddressVO;
import br.com.cea.ecommerce.invoice.vo.ConnectorResponseVO;
import br.com.cea.ecommerce.invoice.vo.CourierVO;
import br.com.cea.ecommerce.invoice.vo.CustomerVO;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;
import br.com.cea.ecommerce.invoice.vo.ItemVO;
import br.com.cea.ecommerce.invoice.vo.OrderVO;
import br.com.cea.ecommerce.invoice.vo.PaymentVO;
import br.com.cea.ecommerce.invoice.vo.TotalsVO;

public class InvoiceConverter {
	
	public static synchronized void copyFromInvoiceToInvoiceVO(Invoice invoice, InvoiceVO invoiceVO){
		invoiceVO.setId(invoice.getId());
		invoiceVO.setInvoiceType(invoice.getType());
		invoiceVO.setCreateDate(DateTimeUtil.convertGregorianToDate(invoice.getCreatedAt()));
		invoiceVO.setUpdateDate(DateTimeUtil.convertGregorianToDate(invoice.getUpdatedAt()));
		invoiceVO.setIssuanceDate(DateTimeUtil.convertGregorianToDate(invoice.getIssuanceDate()));
		copyFromOrderToOrderVO(invoice.getOrder(), invoiceVO.getOrder());
		copyFromCustomerToCustomerVO(invoice.getCustomer(), invoiceVO.getCustomer());
		addAllItems(invoiceVO.getOrder(), invoice.getItems());
		addAllPayments(invoiceVO, invoice.getTransactions().getInvoiceTransaction().get(0).getPayments());
		copyFromAddressToAddressVO(invoice.getShippingAddress(), invoiceVO.getAddress());
		invoiceVO.setTotal(invoice.getTotals().getValue());
		//invoiceVO.setSalesChannel(invoice.getSalesChannel().getName());
		//invoiceVO.setCustomer(invoice.getCustomer().getId());
		copyFromCourierToCourierVO(invoice.getCourier(), invoiceVO.getCourier());
		copyFromTotalsToTotalsVO(invoice.getTotals(), invoiceVO.getTotals());
		invoiceVO.setShippingAddress(invoice.getShippingAddress().getStreet());
		//invoiceVO.setTransaction(invoice.getTransactions());
		invoiceVO.setFiscalDocument(invoice.getFiscalDocument().getId());
		invoiceVO.setCheckout(invoice.getCheckout());
    }
	
	public static synchronized void copyFromItemToItemVO(Item item, ItemVO itemVO){
		if(item != null){
			itemVO.setSkuId(item.getSku().getRefId());
			itemVO.setQuantity(item.getQuantity());
			itemVO.setSellingPrice(item.getSellingPrice());
			itemVO.setTax(item.getTax());
			itemVO.setDiscounts(item.getDiscounts());
			itemVO.setShipping(item.getShipping());
			itemVO.setCurrency(item.getCurrency());
			itemVO.setUnitMeasure(item.getUnitOfMeasure());
			itemVO.setRecordCreateDate(new Date());
			itemVO.setRecordUpdateDate(new Date());
			itemVO.setName(item.getSku().getName());
			itemVO.setSerial(item.getSku().getSerial());
			itemVO.setEan(item.getSku().getEan());
			//itemVO.setOrderId(item.get);
			//itemVO.setClassCod(item.get)
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
	
	public static synchronized void copyFromAddressToAddressVO(Address address, AddressVO addressVO){
		if(address != null){
			//addressVO.setCustomerId(address.get);
			addressVO.setStreet(address.getStreet());
			addressVO.setNumber(address.getNumber());
			addressVO.setCountry(address.getCountry());
			addressVO.setState(address.getState());
			addressVO.setCity(address.getCity());
			addressVO.setNeighborhood(address.getNeighborhood());
			addressVO.setPostalCode(address.getPostalCode());
			addressVO.setAddressReference(address.getReference());
			addressVO.setReceiveName(address.getReceiverName());
			addressVO.setFormattedAddress(address.getFormattedAddress());
			//addressVO.setComponents(address.get);
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
			paymentVO.setReferenceValue(payment.getReferenceValue());
			paymentVO.setGroup(payment.getGroup());
			paymentVO.setRedemptionCode(payment.getRedemptionCode());
			//paymentVO.setBillingAddress(payment.getBillingAddress().get)
			//paymentVO.setConnectResponses(payment.getConnectorResponses().)
		}
	}
	
	public static synchronized void addAllPayments(InvoiceVO invoiceVO, PaymentList paymentList){
		if(paymentList != null){
			List<PaymentVO> payments = invoiceVO.getPayments();
			for(Payment payment : paymentList.getInvoiceTransactionPayment()){
				PaymentVO paymentVO = new PaymentVO();
				paymentVO.setInvoice(invoiceVO);
				paymentVO.setRecordCreateDate(new Date());
				paymentVO.setRecordUpdateDate(new Date());
				copyFromPaymentToPaymentVO(payment, paymentVO);
				copyFromConnectorToConnectorVO(payment.getConnectorResponses(), paymentVO.getConnetorResponse());
				payments.add(paymentVO);
			}
		}
	}
	
	public static synchronized void copyFromOrderToOrderVO(Order order, OrderVO orderVO){
		if(order != null){
			orderVO.setId(order.getId());
			orderVO.setSequence(order.getSequence());
		}
	}
	
	public static synchronized void copyFromCustomerToCustomerVO(Customer customer, CustomerVO customerVO){
		if(customer != null){
			customerVO.setId(customer.getId());
			customerVO.setEmail(customer.getEmail());
			customerVO.setFirstName(customer.getFirstName());
			customerVO.setLastName(customer.getLastName());
			customerVO.setDocumentType(customer.getDocumentType());
			customerVO.setDocument(customer.getDocument());
			customerVO.setPhone(customer.getPhone());
			customerVO.setCorporateName(customer.getCorporateName());
			customerVO.setTradeName(customer.getTradeName());
			customerVO.setCorporateDocument(customer.getCorporateDocument());
			customerVO.setStateInscription(customer.getStateInscription());
			customerVO.setCorporatePhone(customer.getCorporatePhone());
			customerVO.setCorporate(customer.isIsCorporate());
		}
	}
	
	public static synchronized void copyFromConnectorToConnectorVO(ConnectorResponses connectorResponses, ConnectorResponseVO connectorResponseVO){
		if(connectorResponses != null){
			connectorResponseVO.setTid(connectorResponses.getTid());
			connectorResponseVO.setAuthId(connectorResponses.getAuthId());
			connectorResponseVO.setReturCod(connectorResponses.getReturnCode());
			connectorResponseVO.setMessage(connectorResponses.getMessage());
			connectorResponseVO.setNsu(connectorResponses.getNsu());
			connectorResponseVO.setArp(connectorResponses.getArp());
		}
	}
	
	public static synchronized void copyFromCourierToCourierVO(Courier courier, CourierVO courierVO){
		if(courier != null){
			courierVO.setId(courier.getId());
			courierVO.setName(courier.getName());
			courierVO.setStateInscription(courier.getStateInscription());
			courierVO.setPlaque(courier.getPlaque());
			courierVO.setCargoType(courier.getCargoType());
			courierVO.setGrossWeight(courier.getGrossWeight());
			courierVO.setNetWeight(courier.getNetWeight());
			courierVO.setVolumeNumber(courier.getVolumeNumber());
		}
	}
	
	public static synchronized void copyFromTotalsToTotalsVO(Totals totals, TotalsVO totalsVO){
		if(totals != null){
			totalsVO.setValue(totals.getValue());
			totalsVO.setShipping(totals.getShipping());
			totalsVO.setDiscounts(totals.getDiscounts());
			totalsVO.setTax(totals.getTax());
		}
	}
	
}
