package br.com.cea.ecommerce.order.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderVO {
	
	private Long storeOrderId;
	
	private String id;
	
	private Integer sequence;
	
	private String group;
	
	private String status;
	
	private String statusDescription;
	
	private Double value;
	
	private Date createDate;
	
	private Date updateDate;
	
	private String origin;
	
	private String followupEmail;
	
	private String host;
	
	private String changeAttachment;
	
	private String marketPlaceOrderId;
	
	private String operatorId;
	
	private String marketingDataId;
	
	private String ratesBenefitsId;
	
	private Long changesDataId;
	
	private Long logisticsInfoId;
	
	private List<PaymentVO> payments;
	
	private CustomerVO customer;
	
	private List<ItemVO> items;
	
	private TotalsVO totals;

	public OrderVO() {
		super();
		payments = new ArrayList<PaymentVO>();
		customer = new CustomerVO();
		customer.setOrder(this);
		items = new ArrayList<ItemVO>();
		totals = new TotalsVO();		
	}

	public Long getStoreOrderId() {
		return storeOrderId;
	}

	public void setStoreOrderId(Long storeOrderId) {
		this.storeOrderId = storeOrderId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getFollowupEmail() {
		return followupEmail;
	}

	public void setFollowupEmail(String followupEmail) {
		this.followupEmail = followupEmail;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getChangeAttachment() {
		return changeAttachment;
	}

	public void setChangeAttachment(String changeAttachment) {
		this.changeAttachment = changeAttachment;
	}

	public String getMarketPlaceOrderId() {
		return marketPlaceOrderId;
	}

	public void setMarketPlaceOrderId(String marketPlaceOrderId) {
		this.marketPlaceOrderId = marketPlaceOrderId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getMarketingDataId() {
		return marketingDataId;
	}

	public void setMarketingDataId(String marketingDataId) {
		this.marketingDataId = marketingDataId;
	}

	public String getRatesBenefitsId() {
		return ratesBenefitsId;
	}

	public void setRatesBenefitsId(String ratesBenefitsId) {
		this.ratesBenefitsId = ratesBenefitsId;
	}

	public Long getChangesDataId() {
		return changesDataId;
	}

	public void setChangesDataId(Long changesDataId) {
		this.changesDataId = changesDataId;
	}

	public Long getLogisticsInfoId() {
		return logisticsInfoId;
	}

	public void setLogisticsInfoId(Long logisticsInfoId) {
		this.logisticsInfoId = logisticsInfoId;
	}

	public List<PaymentVO> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentVO> payments) {
		this.payments = payments;
	}

	public CustomerVO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerVO customer) {
		this.customer = customer;
	}

	public List<ItemVO> getItems() {
		return items;
	}

	public void setItems(List<ItemVO> items) {
		this.items = items;
	}

	public TotalsVO getTotals() {
		return totals;
	}

	public void setTotals(TotalsVO totals) {
		this.totals = totals;
	}

}
