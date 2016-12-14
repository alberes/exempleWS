package br.com.cea.ecommerce.bankslip.ws;

import br.com.cea.ebs.cea.ecommerce.bankslip.v1.BankSlip;
import br.com.cea.ecommerce.bankslip.vo.BankSlipVO;

public class BankSlipConverter {
	
	public static synchronized void copyFromBankSlipToBankSlipVO(BankSlip bankSlip, BankSlipVO bankSlipVO){
		bankSlipVO.setDateOccurrence(bankSlip.getDateOccurrence());
		bankSlipVO.setSequenceOrderId(bankSlip.getOrderId());
		bankSlipVO.setDueDate(bankSlip.getDueDate());
		bankSlipVO.setValueBankSlip(bankSlip.getValueBankSlip().doubleValue());
		bankSlipVO.setValuePayment(bankSlip.getValuePayment().doubleValue());
		bankSlipVO.setDepositDate(bankSlip.getDepositDate());
		bankSlipVO.setPayer(bankSlip.getPayer());
		bankSlipVO.setLineDetail(bankSlip.getLineDetail());
	}

}
