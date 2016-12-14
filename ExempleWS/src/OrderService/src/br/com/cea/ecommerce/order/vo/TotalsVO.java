package br.com.cea.ecommerce.order.vo;

public class TotalsVO {

	private String id;
	
	private String name;
	
	private Double value;

	public TotalsVO() {
		super();
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

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
