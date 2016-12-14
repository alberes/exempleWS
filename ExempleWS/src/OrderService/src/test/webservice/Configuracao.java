package test.webservice;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import br.com.cea.ebo.cea.v1.MetaInfType;

public class Configuracao {
	
	static public String END_POINT = "http://localhost:7001/InvoiceService/InvoicePortTypeImpService";
	
	static MetaInfType getMetaInformacao(){
		MetaInfType meta = new MetaInfType();
		meta.setCodigoAplicacaoOrigem("XPTO");
		meta.setCodigoOperacaoOrigem("aaaa");
		meta.setEnderecoAplicacaoOrigem("http://endereco:8887/xxx");
		meta.setTransacaoId("123123");
		meta.setUsuarioIdOrigem("brXPTO");
		return meta;
	}
	
	public static void setEndpointAddress(Object port, String newAddress) {
		BindingProvider bp = (BindingProvider) port;
		Map<String, Object> context = bp.getRequestContext();
		context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, newAddress);
	}	
}