package br.com.cea.ecommerce.invoice.vo;

import java.util.Date;

public class CourierVO {
	
	private String id;
	
	private String name;
	
	private String stateInscription;
	
	private String plaque;
	
	private AddressVO address;
	
	private String cargoType;
	
	private Double grossWeight;
	
	private Double netWeight;
	
	private String self;
	
	private Date recordCreateDate;
	
	private Date recordUpdateDate;
	
	private Integer volumeNumber;
	
	private InvoiceVO invoice;

	public CourierVO() {
		super();
		address = new AddressVO();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateInscription() {
		return stateInscription;
	}

	public void setStateInscription(String stateInscription) {
		this.stateInscription = stateInscription;
	}

	public String getPlaque() {
		return plaque;
	}

	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

	public AddressVO getAddress() {
		return address;
	}

	public void setAddress(AddressVO address) {
		this.address = address;
	}

	public String getCargoType() {
		return cargoType;
	}

	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	public Double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(Double netWeight) {
		this.netWeight = netWeight;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
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

	public Integer getVolumeNumber() {
		return volumeNumber;
	}

	public void setVolumeNumber(Integer volumeNumber) {
		this.volumeNumber = volumeNumber;
	}

	public InvoiceVO getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceVO invoice) {
		this.invoice = invoice;
	}	

}
