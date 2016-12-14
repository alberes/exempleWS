package br.com.cea.ecommerce.synchro.ws;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.invoice.synchro.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.invoice.synchro.v1.Invoices;
import br.com.cea.ebs.cea.ecommerce.invoice.synchro.v1.SendInvoiceRequest;
import br.com.cea.ebs.cea.ecommerce.invoice.synchro.v1.SendInvoiceResponse;
import br.com.cea.ebs.cea.ecommerce.invoice.synchro.v1.SendInvoiceToSynchroPort;
import br.com.cea.ebs.cea.ecommerce.invoice.synchro.v1.TechnicalFaultMsg;
import br.com.cea.ecommerce.common.util.FaultUtil;
import br.com.cea.ecommerce.synchro.bo.SynchroBO;

@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.invoice.synchro.v1.SendInvoiceToSynchroPort")
public class SendInvoiceToSynchroPortImpl implements SendInvoiceToSynchroPort {
	
	private Logger logger = LogManager.getLogger(getClass());

	@Override
	public SendInvoiceResponse sendInvoiceToSynchro(SendInvoiceRequest request, MetaInfType header) 
			throws BusinessFaultMsg, TechnicalFaultMsg {
		SynchroBO bo = new SynchroBO();
		
		String invoiceId = request.getInvoiceId();
		
		try {
			bo.sendInvoice(invoiceId);
		} catch (Exception e) {
			String errorMessage = "Error sending invoice to Synchro";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}
		SendInvoiceResponse response = new SendInvoiceResponse();
		Invoices invoices = new Invoices();
		List<String> invoiceList = invoices.getInvoiceId();
		invoiceList.add(request.getInvoiceId());
		response.setInvoices(invoices);
		return response;
	}

}
