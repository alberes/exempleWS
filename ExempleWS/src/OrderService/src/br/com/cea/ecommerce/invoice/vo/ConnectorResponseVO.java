package br.com.cea.ecommerce.invoice.vo;

public class ConnectorResponseVO {
	
	private PaymentVO payment;
	
	private String tid;
	
	private String authId;
	
	private String returCod;
	
	private String message;
	
	private String nsu;
	
	private String arp;

	public ConnectorResponseVO() {
		super();
	}

	public PaymentVO getPayment() {
		return payment;
	}

	public void setPayment(PaymentVO payment) {
		this.payment = payment;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getAuthId() {
		return authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getReturCod() {
		return returCod;
	}

	public void setReturCod(String returCod) {
		this.returCod = returCod;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNsu() {
		return nsu;
	}

	public void setNsu(String nsu) {
		this.nsu = nsu;
	}

	public String getArp() {
		return arp;
	}

	public void setArp(String arp) {
		this.arp = arp;
	}

}
