package test.webservice;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.InvoicePortType;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.InvoiceService;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.PreInvoiceRequest;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.PreInvoiceResponse;

public class InvoiceTest extends TestCase {
	
	private InvoicePortType port = null;
	
	@Before
	public void setUp() {
		InvoiceService service = new InvoiceService();
		port = service.getInvoiceService();
		Configuracao.setEndpointAddress(port, Configuracao.END_POINT);
	}
	
	@After
	public void tearDown() throws Exception {
		port = null;
	}
	
	@Test	
	public void testPreInvoice() throws Exception{
		MetaInfType meta = new MetaInfType();
		
		PreInvoiceRequest request = new PreInvoiceRequest();
		PreInvoiceResponse response = port.preInvoice(request, meta);
		
		if(response == null){
			throw new Exception("Erro");
		}else if(!response.isAcknowledge()){
			throw new Exception("Erro no isAcknowledge");
		}
		System.out.println("ok - PreInvoice");
	}

	/*@Test
	public void testInvoice() throws Exception{
		InvoiceRequest request = new InvoiceRequest();
		InvoiceResponse response= port.invoice(request);
		
		if(response == null){
			throw new Exception("Erro");
		}else if(!response.isAcknowledge()){
			throw new Exception("Erro no isAcknowledge");
		}
		System.out.println("ok - Invoice");
	}*/
	
	

}
