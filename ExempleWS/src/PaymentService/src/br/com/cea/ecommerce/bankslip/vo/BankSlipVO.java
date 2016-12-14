package br.com.cea.ecommerce.bankslip.vo;

import java.util.Date;

public class BankSlipVO {

	private Long idBankPayback;
	
	private String dateOccurrence;
	
	private String orderId;
	
	private String sequenceOrderId;
	
	private String dueDate;
	
	private Double valueBankSlip;
	
	private Double valuePayment;
	
	private String depositDate;
	
	private String payer;
	
	private String lineDetail;
	
	private String paymentId;
	
	private Date creationDate;
	
	private String operationType;
	
	private int status;
	
	private String actionDescription;
	
	private String returnCallback;

	public BankSlipVO() {
		super();
	}

	public Long getIdBankPayback() {
		return idBankPayback;
	}

	public void setIdBankPayback(Long idBankPayback) {
		this.idBankPayback = idBankPayback;
	}

	public String getDateOccurrence() {
		return dateOccurrence;
	}

	public void setDateOccurrence(String dateOccurrence) {
		this.dateOccurrence = dateOccurrence;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSequenceOrderId() {
		return sequenceOrderId;
	}

	public void setSequenceOrderId(String sequenceOrderId) {
		this.sequenceOrderId = sequenceOrderId;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Double getValueBankSlip() {
		return valueBankSlip;
	}

	public void setValueBankSlip(Double valueBankSlip) {
		this.valueBankSlip = valueBankSlip;
	}

	public Double getValuePayment() {
		return valuePayment;
	}

	public void setValuePayment(Double valuePayment) {
		this.valuePayment = valuePayment;
	}

	public String getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(String depositDate) {
		this.depositDate = depositDate;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getLineDetail() {
		return lineDetail;
	}

	public void setLineDetail(String lineDetail) {
		this.lineDetail = lineDetail;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getActionDescription() {
		return actionDescription;
	}

	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}

	public String getReturnCallback() {
		return returnCallback;
	}

	public void setReturnCallback(String returnCallback) {
		this.returnCallback = returnCallback;
	}
	
}
