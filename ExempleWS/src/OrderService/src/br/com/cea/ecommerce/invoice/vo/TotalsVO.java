package br.com.cea.ecommerce.invoice.vo;

import java.util.Date;

public class TotalsVO {
	
	private Double value;
	
	private Double shipping;
	
	private InvoiceVO invoice;
	
	private Double discounts;
	
	private Double tax;
	
	private Date recordCreateDate;
	
	private Date recordUpdateDate;
	
	public TotalsVO(){
		super();
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getShipping() {
		return shipping;
	}

	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	public InvoiceVO getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceVO invoice) {
		this.invoice = invoice;
	}

	public Double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Double discounts) {
		this.discounts = discounts;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
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

}
