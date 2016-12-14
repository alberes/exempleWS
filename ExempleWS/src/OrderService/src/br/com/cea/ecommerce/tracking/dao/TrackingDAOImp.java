package br.com.cea.ecommerce.tracking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.dao.AbstractJDBCDAO;
import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.dao.EcommerceConnectionFactory;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.tracking.vo.TrackingVO;

public class TrackingDAOImp extends AbstractJDBCDAO implements TrackingDAO {
	
	private Logger logger = LogManager.getLogger(getClass());
	
	public Connection conn;
	
	private static final String INSERT_TRACKING = "INSERT INTO ADMEC01.order_tracking(tracking_id, store_order_id, order_id, status_id, status_date, create_date) VALUES(sqn_order_tracking.nextval, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_TRACKING_STATUS = "INSERT INTO ADMEC01.tracking_status(status_id, status_description, description) VALUES(sqn_tracking_status.nextval, ?, ?)";
	
	private static final String QUERY_GET_STATUS_ID_BY_DESCRIPTION = "SELECT status_id FROM tracking_status where status_description = ?";
	
	private static final String QUERY_GET_STORE_ORDER_ID_BY_ORDER_ID = 
			"SELECT store_order_id FROM ADMEC01.order_table WHERE order_id = ?";
	
	public TrackingDAOImp(ConnectionFactory myFactory) throws DAOException, SQLException {
		super(EcommerceConnectionFactory.getInstance());
		conn = super.getConnection();
		conn.setAutoCommit(false);
	}

	@Override
	public TrackingVO saveTracking(TrackingVO tracking) throws DAOException {
		PreparedStatement psStoreOrderId = null;
		ResultSet rsStoreOrderId = null;
		PreparedStatement psTracking = null;
		ResultSet rsTracking = null;
		try {
			
			psStoreOrderId = conn.prepareStatement(QUERY_GET_STORE_ORDER_ID_BY_ORDER_ID);
			psStoreOrderId.setString(1, tracking.getOrderId());
			rsStoreOrderId = psStoreOrderId.executeQuery();
			if(rsStoreOrderId.next()){
				tracking.setStoreOrderId(rsStoreOrderId.getLong("store_order_id"));
			}
			
			psTracking = conn.prepareStatement(INSERT_TRACKING, new String[]{"tracking_id"});
			psTracking.setLong(1, tracking.getStoreOrderId());
			psTracking.setString(2, tracking.getOrderId());
			psTracking.setLong(3, tracking.getStatusId());
			psTracking.setTimestamp(4, DateTimeUtil.convertDateToSQLDate(tracking.getStatusDate()));
			psTracking.setTimestamp(5, DateTimeUtil.convertDateToSQLDate(tracking.getCreateDate()));
			
			psTracking.executeUpdate();
			rsTracking = psTracking.getGeneratedKeys();
			
			if(rsTracking.next()){
				tracking.setTrackingId(rsTracking.getLong(1));
			}	
			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(psStoreOrderId, rsStoreOrderId);
			super.close(psTracking, rsTracking);
		}
		return tracking;
	}
	
	@Override
	public Long saveTrackingStatus(String statusDescription) throws DAOException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Long statusId = null;
		try {			
			ps = conn.prepareStatement(INSERT_TRACKING_STATUS, new String[]{"status_id"});
			
			ps.setString(1, statusDescription);
			ps.setString(2, statusDescription);
			
			ps.executeUpdate();
			
			rs = ps.getGeneratedKeys();
			
			if(rs.next()){
				statusId = rs.getLong(1);
			}		
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return statusId;
	}
	
	@Override
	public Long getStatusId(String description) throws BusinessException, Exception {
		ResultSet rs = null;
		PreparedStatement ps = null;
		Long statusId = null;
		try {
			ps = conn.prepareStatement(QUERY_GET_STATUS_ID_BY_DESCRIPTION);
			ps.setString(1, description);
			rs = ps.executeQuery();
			if(rs.next()) {
				statusId = rs.getLong("status_id");
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return statusId;
	}
	
	public Connection getConn() {
		return conn;
	}

	public void rollback() throws SQLException {
		conn.rollback();
	}

	public void commit() throws SQLException {
		conn.commit();
	}

	public void close() {
		super.close(conn);
	}

}