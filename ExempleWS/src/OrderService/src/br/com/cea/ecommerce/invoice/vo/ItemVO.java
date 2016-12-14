package br.com.cea.ecommerce.invoice.vo;

import java.util.Date;

public class ItemVO {

	private String skuId;
	
	private Integer quantity;
	
	private Double sellingPrice;
	
	private Double tax;
	
	private Double discounts;
	
	private Double shipping;
	
	private String currency;
	
	private String unitMeasure;
	
	private Date recordCreateDate;
	
	private Date recordUpdateDate;
	
	private OrderVO order;
	
	private String classCod;
	
	private Integer sequence;
	
	private String itemFNE;
	
	private String itemClass;
	
	private String itemCode;
	
	private String name;
	
	private String serial;
	
	private String ean;

	public ItemVO() {
		super();
		order = new OrderVO();
	}
	
	public ItemVO(ItemVO itemVO){
		this.skuId = itemVO.getSkuId();
		this.quantity = itemVO.getQuantity();
		this.sellingPrice = itemVO.getSellingPrice();
		this.tax = itemVO.getTax();
		this.discounts = itemVO.getDiscounts();
		this.shipping = itemVO.getShipping();
		this.currency = itemVO.getCurrency();
		this.unitMeasure = itemVO.getUnitMeasure();
		this.recordCreateDate = itemVO.getRecordCreateDate();
		this.recordUpdateDate = itemVO.getRecordUpdateDate();
		this.order = itemVO.getOrder();
		this.classCod = itemVO.getClassCod();
		this.sequence = itemVO.getSequence();
		this.itemFNE = itemVO.getItemFNE();
		this.itemClass = itemVO.getItemClass();
		this.itemCode = itemVO.getItemCode();
		this.name = itemVO.getName();
		this.serial = itemVO.getSerial();
		this.ean = itemVO.getEan();
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Double discounts) {
		this.discounts = discounts;
	}
	
	public Double getShipping() {
		return shipping;
	}

	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(String unitMeasure) {
		this.unitMeasure = unitMeasure;
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

	public OrderVO getOrder() {
		return order;
	}

	public void setOrder(OrderVO order) {
		this.order = order;
	}

	public String getClassCod() {
		return classCod;
	}

	public void setClassCod(String classCod) {
		this.classCod = classCod;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getItemFNE() {
		return itemFNE;
	}

	public void setItemFNE(String itemFNE) {
		this.itemFNE = itemFNE;
	}

	public String getItemClass() {
		return itemClass;
	}

	public void setItemClass(String itemClass) {
		this.itemClass = itemClass;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

}