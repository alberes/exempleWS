package br.com.cea.ecommerce.bankslip.dao;

import java.sql.SQLException;

import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.bankslip.vo.BankSlipVO;

public interface BankSlipDAO {

	public BankSlipVO saveBankSlip(BankSlipVO bankSlip) throws DAOException;
	
	public String[] getPaymentData(String orderId) throws DAOException;
	
	public void rollback() throws SQLException;
	
	public void commit() throws SQLException;
	
	public void close();
}
