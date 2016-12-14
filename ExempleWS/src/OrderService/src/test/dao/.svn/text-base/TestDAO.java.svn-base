package test.dao;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.com.cea.commons.email.ContentType;
import br.com.cea.commons.email.EmailService;
import br.com.cea.commons.email.EmailVO;
import br.com.cea.commons.exception.BusinessException;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.PreInvoiceRequest;
import br.com.cea.ecommerce.invoice.bo.InvoiceBO;
import br.com.cea.ecommerce.invoice.bo.InvoiceBOImp;

public class TestDAO {
	
	private void printXml(Object request, @SuppressWarnings("rawtypes") Class cls) {
		try{
			StringWriter writer = new StringWriter();
			JAXBContext ctx = JAXBContext.newInstance(cls);
			Marshaller m = ctx.createMarshaller();
			m.marshal(request, writer);
			System.out.println(writer.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	private String xmlToString(Object request, @SuppressWarnings("rawtypes") Class cls) throws JAXBException {
		StringWriter writer = new StringWriter();
		JAXBContext ctx = JAXBContext.newInstance(cls);
		Marshaller m = ctx.createMarshaller();
		m.marshal(request, writer);
		return writer.toString();
	}
	
	private static PreInvoiceRequest unmarshallString(String xml) throws JAXBException{
		PreInvoiceRequest request = null;
		
		StringReader reader = new StringReader(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(PreInvoiceRequest.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		request = (PreInvoiceRequest) jaxbUnmarshaller.unmarshal(reader);
		return request;
	}
	
	private static void testDB() throws BusinessException, Exception{
		Properties props = System.getProperties();
		props.setProperty("connection.mode", "test");
		
//		OrderBO bo = new OrderBOImp();
//		bo.sendOrderToWevo();
		
		InvoiceBO bo = new InvoiceBOImp();
		bo.sendInvoiceToWevo();
		
//		String xml = "<v11:PreInvoiceRequest xmlns:v1=\"http://www.cea.com.br/EBO/CEA/v1\" xmlns:v11=\"http://www.cea.com.br/EBS/CEA/ecommerce/invoice/v1\" xmlns:v12=\"http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1\" xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\"><v11:Invoice><v12:Id>PERF71_0001</v12:Id><v12:Order><v12:Id>PERF71_0001</v12:Id><v12:Sequence>500361</v12:Sequence><v12:Self>vrn:cea:orders/475301516595-01</v12:Self></v12:Order><v12:Items><v12:Item><v12:Sku><v12:RefId>6876356</v12:RefId><v12:Name>SEAMLESS BIKINI HIGH PRETO M</v12:Name><v12:Id>2013177</v12:Id></v12:Sku><v12:Quantity>1</v12:Quantity><v12:SellingPrice>1000</v12:SellingPrice><v12:Tax>0</v12:Tax><v12:Shipping>0</v12:Shipping><v12:Discounts>-449</v12:Discounts></v12:Item></v12:Items><v12:Totals><v12:Value>1000</v12:Value></v12:Totals><v12:Customer><v12:Email>{customer_email}</v12:Email><v12:FirstName>Priscila</v12:FirstName><v12:LastName>Ribeiro</v12:LastName><v12:DocumentType>CPF</v12:DocumentType><v12:Document>79219578204</v12:Document><v12:IsCorporate>false</v12:IsCorporate><v12:Phone>11 4324-45-54</v12:Phone><v12:Id>1b182081-49de-41f0-9ba4-e131091044a2</v12:Id></v12:Customer><v12:ShippingAddress><v12:Street>CPF</v12:Street><v12:Number>89</v12:Number><v12:Neighborhood>Vila Olímpia</v12:Neighborhood><v12:City>São Paulo</v12:City><v12:State>SP</v12:State><v12:Country>BRA</v12:Country><v12:ReceiverName>Priscila Ribeiro</v12:ReceiverName></v12:ShippingAddress><v12:Transactions><v12:InvoiceTransaction><v12:Payments><v12:InvoiceTransactionPayment><v12:Id>BF27C1419C7F4008B90023407A4AE9BF</v12:Id><v12:PaymentSystem>201</v12:PaymentSystem><v12:PaymentSystemName>Promissória</v12:PaymentSystemName><v12:Value>1000</v12:Value><v12:Installments>1</v12:Installments><v12:ReferenceValue>1000</v12:ReferenceValue><v12:BillingAddress><v12:Street>Avenida Doutor Cardoso de Melo</v12:Street><v12:Number>1750</v12:Number><v12:Neighborhood>Vila Olímpia</v12:Neighborhood><v12:City>São Paulo</v12:City><v12:State>SP</v12:State><v12:Country>BRA</v12:Country></v12:BillingAddress></v12:InvoiceTransactionPayment></v12:Payments><v12:Id>PERF71_0001</v12:Id></v12:InvoiceTransaction></v12:Transactions><v12:FiscalDocument><v12:Id>1</v12:Id><v12:Value>1</v12:Value><v12:Url>1</v12:Url><v12:AcessKey>1</v12:AcessKey><v12:EmbeddedDocument>1</v12:EmbeddedDocument><v12:Attachment><v12:Content>1</v12:Content><v12:ContentType>1</v12:ContentType><v12:FileName>1</v12:FileName><v12:Url>1</v12:Url></v12:Attachment></v12:FiscalDocument><v12:Type>outbound</v12:Type><v12:SalesChannel><v12:Id>1</v12:Id></v12:SalesChannel><v12:Courier><v12:Id>0000049565</v12:Id><v12:Name>Transfolha</v12:Name><v12:CargoType>Caixa</v12:CargoType><v12:GrossWeight>300</v12:GrossWeight><v12:NetWeight>300</v12:NetWeight><v12:VolumeNumber>1</v12:VolumeNumber><v12:Self>?</v12:Self></v12:Courier></v11:Invoice></v11:PreInvoiceRequest>";
//		PreInvoiceRequest request = unmarshallString(xml);
//		
//		InvoicePortType port = new InvoicePortTypeImp();
//		port.preInvoice(request, null);
		
	}
	
	private static void sendEmail(){
		List<String> emailsTo = new ArrayList<String>();
		emailsTo.add("jose.menezes@resource.com.br");

		EmailService emailService = new EmailService();
		emailService.setServidorSmtpBR("10.16.0.131");
		
		EmailVO emailVO = new EmailVO();

		// Parametrizar assunto do e-mail em properties
		
		emailVO.setAssunto("Divergencia dos valores");
		emailVO.setFrom("jose.menezes@resource.com.br");
		emailVO.setTo(emailsTo);
		emailVO.setCorpo("Valor pago diferente do valor real do boleto.");

		try {
			emailService.send(emailVO, ContentType.TEXT_HTML);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws BusinessException, Exception {
		testDB();
//		sendEmail();
	}
	
	

}
