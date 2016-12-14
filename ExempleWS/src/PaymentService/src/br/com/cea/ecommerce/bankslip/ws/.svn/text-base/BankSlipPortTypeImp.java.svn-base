package br.com.cea.ecommerce.bankslip.ws;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlipPortType;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlipRequest;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlipResponse;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.bankslip.v1.TechnicalFaultMsg;
import br.com.cea.ecommerce.bankslip.bo.BankSlipBO;
import br.com.cea.ecommerce.bankslip.bo.BankSlipBOImp;
import br.com.cea.ecommerce.bankslip.vo.BankSlipVO;
import br.com.cea.ecommerce.common.util.FaultUtil;

@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlipPortType")
public class BankSlipPortTypeImp implements BankSlipPortType{

	private Logger logger = LogManager.getLogger(getClass());
	
	@Override
	public BankSlipResponse bankSlip(BankSlipRequest parameters,
			MetaInfType header) throws BusinessFaultMsg, TechnicalFaultMsg {
		BankSlipResponse response = new BankSlipResponse();
		
		try{
			BankSlipVO bankSlipVO = new BankSlipVO();
			BankSlipConverter.copyFromBankSlipToBankSlipVO(parameters.getBankSlip(), bankSlipVO);
			BankSlipBO bankSlipBO = new BankSlipBOImp();
			bankSlipBO.createBankSlip(bankSlipVO);
			response.setAcknowledge(true);
		}catch (Exception e) {
			String errorMessage = "Error no servico BankSlip";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}		
		return response;
	}

}
