package br.com.cea.ecommerce.bankslip.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.email.ContentType;
import br.com.cea.commons.email.EmailService;
import br.com.cea.commons.email.EmailVO;
import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.bankslip.dao.BankSlipDAO;
import br.com.cea.ecommerce.bankslip.dao.BankSlipDAOImp;
import br.com.cea.ecommerce.bankslip.vo.BankSlipVO;

public class BankSlipBOImp implements BankSlipBO{

	private Logger logger = LogManager.getLogger(getClass());
	
	@Override
	public BankSlipVO createBankSlip(BankSlipVO bankSlipVO) throws BusinessException, Exception {
		BankSlipDAO bankSlipDAO = new BankSlipDAOImp(null);
		String actionDescription = "";
		String returnCallback = "";
		String operation = "";
		String[] data = null;
		
		try{
			bankSlipVO.setCreationDate(new Date());
			if(bankSlipVO.getValueBankSlip().equals(bankSlipVO.getValuePayment())){
				//Chamar o servico de pagamento
				bankSlipVO.setStatus(1);
				actionDescription = "Enviado a confirmacao para o e-commerce.";
				returnCallback = "200 = ok";
				operation = "CALLBACK";
			}else{
				//Passar um email para o SAC
				bankSlipVO.setStatus(2);
				actionDescription = "Enviado e-mail para o SAC.";
				operation = "EMAIL";
				sendMail();
			}
			
			data = bankSlipDAO.getPaymentData(bankSlipVO.getSequenceOrderId());
			
			bankSlipVO.setOperationType(operation);
			bankSlipVO.setActionDescription(actionDescription);
			bankSlipVO.setReturnCallback(returnCallback);
			bankSlipVO.setPaymentId(data[0]);
			bankSlipVO.setOrderId(data[1]);
			bankSlipDAO.saveBankSlip(bankSlipVO);
			bankSlipDAO.commit();
		}catch(DAOException e){
			logger.error("Falha no acesso ao banco de dados", e);
			bankSlipDAO.rollback();
			throw new Exception(e);
		}finally{
			bankSlipDAO.close();
		}
		return bankSlipVO;
	}
	
	public void sendMail() {
		 
		List<String> emailsTo = new ArrayList<String>();
		emailsTo.add("jose.menezes@resource.com.br");
		
		EmailService emailService = new EmailService();
		EmailVO emailVO = new EmailVO();
		   
		// Parametrizar assunto do e-mail em properties
		emailVO.setAssunto("Divergencia dos valores");
		emailVO.setFrom("jose.menezes@resource.com.br");
		emailVO.setTo(emailsTo);
		emailVO.setCorpo("Valor pago diferente do valor real do boleto.");
		
		emailService.setServidorSmtpBR("smtp.office365.com");
		
		try {
			emailService.send(emailVO, ContentType.TEXT_HTML);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
