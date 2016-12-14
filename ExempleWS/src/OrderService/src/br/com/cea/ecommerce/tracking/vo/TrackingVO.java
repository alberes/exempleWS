package br.com.cea.ecommerce.tracking.vo;

import java.util.Date;

public class TrackingVO {
	
	private Long trackingId;
	
	private Long storeOrderId;
	
	private String orderId;
	
	private Long statusId;
	
	private String statusDescription;
	
	private Date statusDate;
	
	private Date createDate;
	
	public TrackingVO(){
		
	}

	public Long getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(Long trackingId) {
		this.trackingId = trackingId;
	}

	public Long getStoreOrderId() {
		return storeOrderId;
	}

	public void setStoreOrderId(Long storeOrderId) {
		this.storeOrderId = storeOrderId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}