package br.com.cea.ecommerce.bankslip.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.dao.AbstractJDBCDAO;
import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.bankslip.vo.BankSlipVO;
import br.com.cea.ecommerce.common.dao.EcommerceConnectionFactory;
import br.com.cea.ecommerce.common.util.DateTimeUtil;

public class BankSlipDAOImp extends AbstractJDBCDAO implements BankSlipDAO{

	private Logger logger = LogManager.getLogger(getClass());
	
	private Connection conn;
	
	private static final String INSERT_BANK_SLIP = "INSERT INTO admec01.cnab_bank_slip(id_bank_slip, date_occurrence, sequence_order, order_id, due_date, value_bank_slip,"
			+ " value_payment, deposit_date, payer, line_detail, payment_id, creation_date, operation_type, status, action_description, return_callback)"
			+ " VALUES(ADMEC01.sqn_cnab_bank_slip.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String SELECT_PAYMENT_ID_BY_ORDER_ID = "SELECT payment.payment_id, order_table.order_id FROM admec01.invoice"
			+ " JOIN admec01.order_table ON order_table.store_invoice_id = invoice.store_invoice_id"
			+ " JOIN admec01.payment ON payment.store_invoice_id = invoice.store_invoice_id WHERE order_table.sequence_order = ?";
	
	public BankSlipDAOImp(ConnectionFactory myFactory) throws DAOException, SQLException {
		super(EcommerceConnectionFactory.getInstance());
		conn = super.getConnection();
		conn.setAutoCommit(false);
	}
	
	@Override
	public BankSlipVO saveBankSlip(BankSlipVO bankSlip) throws DAOException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {			
			ps = conn.prepareStatement(INSERT_BANK_SLIP, new String[]{"id_bank_slip"});
			ps.setString(1, bankSlip.getDateOccurrence());
			ps.setString(2, bankSlip.getSequenceOrderId());
			ps.setString(3, bankSlip.getOrderId());
			ps.setString(4, bankSlip.getDueDate());
			ps.setDouble(5, bankSlip.getValueBankSlip());
			ps.setDouble(6, bankSlip.getValuePayment());
			ps.setString(7, bankSlip.getDepositDate());
			ps.setString(8, bankSlip.getPayer());
			ps.setString(9, bankSlip.getLineDetail());
			ps.setString(10, bankSlip.getPaymentId());
			ps.setTimestamp(11, DateTimeUtil.convertDateToSQLDate(bankSlip.getCreationDate()));
			ps.setString(12, bankSlip.getOperationType());
			ps.setInt(13, bankSlip.getStatus());
			ps.setString(14, bankSlip.getActionDescription());
			ps.setString(15, bankSlip.getReturnCallback());
						
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			
			if(rs.next()){
				bankSlip.setIdBankPayback(rs.getLong(1));
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return bankSlip;
	}	
	
	@Override
	public String[] getPaymentData(String orderId) throws DAOException {
		ResultSet rs = null;
		PreparedStatement ps = null;
		String[] data = new String[]{"", ""};
		try {
			ps = conn.prepareStatement(SELECT_PAYMENT_ID_BY_ORDER_ID);
			ps.setString(1, orderId);
			rs = ps.executeQuery();
			if (rs.next()) {
				data[0] = rs.getString("payment_id");
				data[1] = rs.getString("order_id");				
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return data;
	}
	
	@Override
	public void rollback() throws SQLException{
		conn.rollback();
	}
	
	@Override
	public void commit() throws SQLException{
		conn.commit();
	}
	
	@Override
	public void close(){
		super.close(conn);
	}
	
}
