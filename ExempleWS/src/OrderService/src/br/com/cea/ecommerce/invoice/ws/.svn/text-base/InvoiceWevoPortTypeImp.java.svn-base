package br.com.cea.ecommerce.invoice.ws;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.invoice.wevo.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.invoice.wevo.v1.InvoiceWevoPortType;
import br.com.cea.ebs.cea.ecommerce.invoice.wevo.v1.QuantityUpdatedResponse;
import br.com.cea.ebs.cea.ecommerce.invoice.wevo.v1.TechnicalFaultMsg;
import br.com.cea.ecommerce.common.util.FaultUtil;
import br.com.cea.ecommerce.invoice.bo.InvoiceBO;
import br.com.cea.ecommerce.invoice.bo.InvoiceBOImp;

@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.invoice.wevo.v1.InvoiceWevoPortType")
public class InvoiceWevoPortTypeImp implements InvoiceWevoPortType{
	
	private Logger logger = LogManager.getLogger(getClass());

	@Override
	public QuantityUpdatedResponse sendInvoiceToWevo()	throws BusinessFaultMsg, TechnicalFaultMsg {
		QuantityUpdatedResponse response = new QuantityUpdatedResponse();
		InvoiceBO bo = new InvoiceBOImp();
		try {
			response.setQuantity(bo.sendInvoiceToWevo());
		} catch (Exception e) {
			String errorMessage = "Error sending invoice to WEVO";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}
		return response;
	}
	
}
