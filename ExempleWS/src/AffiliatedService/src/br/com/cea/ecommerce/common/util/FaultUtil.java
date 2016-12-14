package br.com.cea.ecommerce.common.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Date;

import br.com.cea.commons.exception.ErrorFactory;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;

public class FaultUtil {
	
	private static FaultUtil me = null;
	
	private FaultUtil() {
	}
	
	public static FaultUtil getInstance(){
		if(me == null){
			me = new FaultUtil();
		}
		return me;
	}
	
	private String hostname;
	
	protected String getLocalHostname() {

		if (hostname == null) {
			try {
				hostname = InetAddress.getLocalHost().getHostName();
			} catch (UnknownHostException ex) {
				ex.printStackTrace();
				return "unknow";
			}
		}

		return hostname;
	}
	
	protected String getHostname() {
		String hostname = getLocalHostname();

		String server = System.getProperty("server.name");
		if (server != null) {
			hostname = server + "@" + hostname;
		}

		String port = System.getProperty("server.port");
		if (port != null) {
			hostname += ":" + port;
		}

		return hostname;
	}
	
	protected Date getTimestamp() {
		return Calendar.getInstance().getTime();
	}
	
	public TechnicalFaultType createTechnicalFaultMsg(Throwable e) {
		TechnicalFaultType fault = new TechnicalFaultType();
		fault.setCodigo("30");
		fault.setMensagem(e.getMessage());
		fault.setInstrucao("");
		fault.setDetalhe(ErrorFactory.getInstance().getStackTrace(e));
		fault.setHost(getHostname());
		fault.setTimestamp("" + getTimestamp());
		return fault;
	}

}
