package br.com.cea.ecommerce.invoice.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.cea.ecommerce.common.vo.IntegrationStatus;

public class InvoiceVO {
	
	private Long storeInvoiceId;
	
	private String id;
	
	private String invoiceType;
	
	private Date createDate;
	
	private Date updateDate;
	
	private Date issuanceDate;
	
	private Double total;
	
	private String salesChannel;
	
	private CustomerVO customer;
	
	private CourierVO courier;
	
	private String shippingAddress;
	
	private String transaction;
	
	private String fiscalDocument;
	
	private Date recordCreateDate;
	
	private Date recordUpdateDate;
	
	private List<PaymentVO> payments;
	
	private OrderVO order;
	
	private TotalsVO totals;
	
	private AddressVO address;
	
	private IntegrationStatus integrationStatus;
	
	private Integer checkout;

	public InvoiceVO() {
		super();		
		payments = new ArrayList<PaymentVO>();
		order = new OrderVO();
		order.setInvoice(this);
		totals = new TotalsVO();
		totals.setInvoice(this);
		customer = new CustomerVO();
		customer.setInvoice(this);
		address = new AddressVO();
		address.setInvoice(this);
		courier = new CourierVO();
		courier.setInvoice(this);
	}
	
	public Long getStoreInvoiceId() {
		return storeInvoiceId;
	}

	public void setStoreInvoiceId(Long storeInvoiceId) {
		this.storeInvoiceId = storeInvoiceId;
	}

	public InvoiceVO(String id) {
		this();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getIssuanceDate() {
		return issuanceDate;
	}

	public void setIssuanceDate(Date issuanceDate) {
		this.issuanceDate = issuanceDate;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public CustomerVO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerVO customer) {
		this.customer = customer;
	}

	public CourierVO getCourier() {
		return courier;
	}

	public void setCourier(CourierVO courier) {
		this.courier = courier;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public String getFiscalDocument() {
		return fiscalDocument;
	}

	public void setFiscalDocument(String fiscalDocument) {
		this.fiscalDocument = fiscalDocument;
	}

	public Date getRecordCreateDate() {
		return recordCreateDate;
	}

	public void setRecordCreateDate(Date recordCreateDate) {
		this.recordCreateDate = recordCreateDate;
	}

	public Date getRecordUpdateDate() {
		return recordUpdateDate;
	}

	public void setRecordUpdateDate(Date recordUpdateDate) {
		this.recordUpdateDate = recordUpdateDate;
	}

	public List<PaymentVO> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentVO> payments) {
		this.payments = payments;
	}

	public OrderVO getOrder() {
		return order;
	}

	public void setOrder(OrderVO order) {
		this.order = order;
	}

	public TotalsVO getTotals() {
		return totals;
	}

	public void setTotals(TotalsVO totals) {
		this.totals = totals;
	}

	public AddressVO getAddress() {
		return address;
	}

	public void setAddress(AddressVO address) {
		this.address = address;
	}

	public IntegrationStatus getIntegrationStatus() {
		return integrationStatus;
	}

	public void setIntegrationStatus(IntegrationStatus integrationStatus) {
		this.integrationStatus = integrationStatus;
	}

	public Integer getCheckout() {
		return checkout;
	}

	public void setCheckout(Integer checkout) {
		this.checkout = checkout;
	}

}
