package br.com.cea.ecommerce.common.util;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import br.com.cea.commons.util.PropertiesConfigLoader;

public class EcommerceProperties {
	
	private static EcommerceProperties me = null; 
	
	private String wevo_endpoint = null;
	private String wevo_environment = null;
	
	private final static String ARQUIVO_PROPERTIES = "ecommerce_orders.properties";
	
	private EcommerceProperties() throws IOException{
		String property = null;
		String value = null;
		String raiz = System.getProperty("dir.app", "/app");
		String diretorioProperties = raiz + "/conf";
		File arquivoProperties = new File(diretorioProperties + "/" + ARQUIVO_PROPERTIES);
		
		Properties prop = null;
		if (arquivoProperties.exists() && arquivoProperties.canRead()) {
			prop = PropertiesConfigLoader.loadFile(arquivoProperties);
		} else {
			throw new IOException("Falha na leitura do arquivo de properties: diretorioProperties["
					+ diretorioProperties + "]" + "ARQUIVO_PROPERTIES[" + ARQUIVO_PROPERTIES + "]");
		}
		
		property = "wevo.endpoint";
		value = prop.getProperty(property);
		if (value == null) {
			throw new IOException("Falha na leitura das propriedades, verifique o arquivo [" + ARQUIVO_PROPERTIES
					+ "]. " + property+" é nulo");
		}else{
			wevo_endpoint = value;
		}
		
		property = "wevo.environment";
		value = prop.getProperty(property);
		if (value == null) {
			throw new IOException("Falha na leitura das propriedades, verifique o arquivo [" + ARQUIVO_PROPERTIES
					+ "]. " + property+" é nulo");
		}else{
			wevo_environment = value;
		}
	}
	
	public static EcommerceProperties getInstance() throws IOException {
		if (me == null) {
			me = new EcommerceProperties();
		}
		return me;
	}
	
	public String getEndpoint() {
		return wevo_endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.wevo_endpoint = endpoint;
	}
	public String getEnvironment() {
		return wevo_environment;
	}
	public void setEnvironment(String environment) {
		this.wevo_environment = environment;
	}
	
	

}
