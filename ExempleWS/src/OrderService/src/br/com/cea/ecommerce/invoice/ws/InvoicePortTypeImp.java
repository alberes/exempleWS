package br.com.cea.ecommerce.invoice.ws;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.InvoicePortType;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.PreInvoiceRequest;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.PreInvoiceResponse;
import br.com.cea.ebs.cea.ecommerce.invoice.v1.TechnicalFaultMsg;
import br.com.cea.ecommerce.common.util.FaultUtil;
import br.com.cea.ecommerce.invoice.bo.InvoiceBO;
import br.com.cea.ecommerce.invoice.bo.InvoiceBOImp;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;


@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.invoice.v1.InvoicePortType")
public class InvoicePortTypeImp implements InvoicePortType {
	
	private Logger logger = LogManager.getLogger(getClass());

	@Override
	public PreInvoiceResponse preInvoice(PreInvoiceRequest parameters, MetaInfType meta) throws BusinessFaultMsg, TechnicalFaultMsg{
		PreInvoiceResponse response = new PreInvoiceResponse();
		
		try {
			InvoiceVO invoiceVO = new InvoiceVO();		
			InvoiceConverter.copyFromInvoiceToInvoiceVO(parameters.getInvoice(), invoiceVO);
			
			InvoiceBO bo = new InvoiceBOImp();
			//Nao salvar na base se existir o invoice
			if(bo.existsInvoice(invoiceVO.getId())){
				response.setAcknowledge(false);
				return response;
			}
			bo.createInvoice(invoiceVO);
			response.setAcknowledge(true);
		} catch (Exception e) {
			String errorMessage = "Error invoice";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}		
		return response;
	}

	/*@Override
	public InvoiceResponse invoice(InvoiceRequest parameters) throws BusinessFaultMsg, TechnicalFaultMsg{
		InvoiceResponse response = new InvoiceResponse();
		response.setAcknowledge(true);
		return response;
	}*/

}
