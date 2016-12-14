package br.com.cea.ecommerce.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.dao.AbstractJDBCDAO;
import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.dao.EcommerceConnectionFactory;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.common.vo.IntegrationStatus;
import br.com.cea.ecommerce.order.vo.AddressVO;
import br.com.cea.ecommerce.order.vo.ConnectorResponseVO;
import br.com.cea.ecommerce.order.vo.CustomerVO;
import br.com.cea.ecommerce.order.vo.ItemVO;
import br.com.cea.ecommerce.order.vo.OrderVO;
import br.com.cea.ecommerce.order.vo.PaymentVO;

public class OrderDAOImp extends AbstractJDBCDAO implements OrderDAO {
	
private Logger logger = LogManager.getLogger(getClass());
	
	private Connection conn;
	
	private static final String INSERT_ORDER = 
		"INSERT INTO ADMEC01.ord_order ( "
			+ "store_order_id "
			+ ",order_id "
			+ ",order_sequence "
			+ ",order_group "
			+ ",status "
			+ ",status_description "
			+ ",order_value "
			+ ",creation_date "
			+ ",last_change "
			+ ",origin "
			+ ",follow_up_email "
			+ ",host_name "
			+ ",changes_attachment "
			+ ",market_place_order_id "
			+ ",operator_id"
			+ ",marketing_data_id"
			+ ",rates_and_benefits_id"
			+ ",changes_data_id, logistics_info_id"
			+ ",customer_document"
			+ ",customer_sequence"
		+ ") VALUES ("
			+ "ADMEC01.sqn_ord_order.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_CUSTOMER = 
		"INSERT INTO ADMEC01.ord_customer("
			+ "profile_id "
			+ ",email "
			+ ",first_name "
			+ ",last_name "
			+ ",document_type "
			+ ",customer_document "
			+ ",customer_sequence "
			+ ",iscorporate "
			+ ",phone "
			+ ",corporate_name "
			+ ",trade_name "
			+ ",corporate_document "
			+ ",state_inscription "
			+ ",corporate_phone "
			+ ",integration_id "
			+ ",synchro_id "
		+ ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_ADDRESS = 
		"INSERT INTO ADMEC01.ord_address ( "
			+ "street "
			+ ",nu "
			+ ",complement "
			+ ",neighborhood "
			+ ",city "
			+ ",state "
			+ ",country "
			+ ",formatted_address "
			+ ",postal_code "
			+ ",address_reference "
			+ ",receiver_name "
			+ ",customer_document "
			+ ",customer_sequence "
		+ ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_ITEM = 
		"INSERT INTO ADMEC01.ord_item ( "
			+ "sku "
			+ ",quantity "
			+ ",selling_price "
			+ ",tax "
			+ ",shipping "
			+ ",discounts "
			+ ",currency "
			+ ",unit_of_measure "
			+ ",price "
			+ ",list_price "
			+ ",image_url "
			+ ",detail_url "
			+ ",is_gift "
			+ ",item_index "
			+ ",lock_id "
			+ ",store_order_id "
			+ ",sequence_order "
		+ ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_PAYMENT = 
		"INSERT INTO ADMEC01.ord_payment ( "
			+ "payment_id "
			+ ",payment_system "
			+ ",payment_system_name "
			+ ",payment_value "
			+ ",installments "
			+ ",reference_value "
			+ ",first_digits "
			+ ",last_digits "
			+ ",payment_url "
			+ ",gift_card_id "
			+ ",gift_card_name "
			+ ",gift_card_caption "
			+ ",redemption_code "
			+ ",payment_group "
			+ ",billing_address "
			+ ",store_order_id"
		+ ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_PAYMENT_CONNECTOR = "INSERT INTO ADMEC01.ord_connector_responses(arp, auth_id, msg, nsu, return_code, tid, num_autent, num_cv, payment_id)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String QUERY_ADDRESS_BY_CUSTOMER_DOCUMENT = "SELECT ord_address.* FROM ADMEC01.ord_address WHERE ord_address.customer_document = ?";
	
	private static final String QUERY_CUSTOMER_AND_ADDRESS_BY_DOCUMENT = "SELECT ord_customer.profile_id, ord_customer.email, ord_customer.first_name,"
			+ " ord_customer.last_name, ord_customer.document_type, ord_customer.customer_document, ord_customer.customer_sequence, ord_customer.iscorporate,"
			+ " ord_customer.phone, ord_customer.corporate_name, ord_customer.trade_name, ord_customer.corporate_document, ord_customer.state_inscription,"
			+ " ord_customer.corporate_phone, ord_customer.integration_id, ord_customer.synchro_id, ord_address.street, ord_address.nu, ord_address.complement, ord_address.neighborhood,"
			+ " ord_address.city, ord_address.state, ord_address.country, ord_address.formatted_address, ord_address.postal_code, ord_address.address_reference,"
			+ " ord_address.receiver_name FROM ADMEC01.ord_customer"
			+ " JOIN ADMEC01.ord_address ON ord_customer.customer_document = ord_address.customer_document and ord_customer.customer_sequence = ord_address.customer_sequence"
			+ " WHERE ord_customer.customer_document = ? ORDER BY ord_customer.customer_sequence";
	
	private static final String QUERY_CUSTOMER_BY_ORDERID = "SELECT ord_customer.PROFILE_ID, ord_customer.EMAIL, ord_customer.FIRST_NAME, ord_customer.LAST_NAME,"
			+ " ord_customer.DOCUMENT_TYPE, ord_customer.CUSTOMER_DOCUMENT, ord_customer.CUSTOMER_SEQUENCE, ord_customer.ISCORPORATE, ord_customer.PHONE,"
			+ " ord_customer.CORPORATE_NAME, ord_customer.TRADE_NAME, ord_customer.CORPORATE_DOCUMENT, ord_customer.STATE_INSCRIPTION, ord_customer.CORPORATE_PHONE,"
			+ " ord_customer.INTEGRATION_ID, ord_customer.SYNCHRO_ID"
			+ " FROM ADMEC01.ord_order"
			+ " JOIN ADMEC01.ord_customer ON ord_customer.customer_document = ord_order.customer_document and ord_customer.customer_sequence = ord_order.customer_sequence"
			+ " WHERE order_id = ? ORDER BY ord_order.store_order_id DESC";
	
	private final static String QUERY_ORDER_RECORDED_IN_SYNCHRO = 
			"SELECT ord_order.customer_document "
				+ ",ord_order.customer_sequence "
				+ ",ord_order.store_order_id "
				+ ",ord_order.order_id "
				+ ",ord_order.order_sequence "
			+ "FROM admec01.ord_order "
			+ "JOIN admec01.ord_customer "
				+ "ON ord_customer.customer_document = ord_order.customer_document "
				+ "AND ord_customer.customer_sequence = ord_order.customer_sequence "
			+ "WHERE "
				+ "ord_customer.integration_id = 3 "
				+ "and ord_order.integration_id = 1";

	private final static String UPDATE_ORDER_SENT_TO_WEVO = 
			" UPDATE admec01.ord_order "
			+ "SET integration_id = ? "
			+ "WHERE ord_order.store_order_id = ?";

	private final static String SQL_UPDATE_SERIAL_TS_VND = "UPDATE admec01.ec010t_serial SET ts_vnd = SYSDATE WHERE nu_ser IN(SELECT s.nu_ser FROM admec01.ec010t_serial s WHERE s.ni_sku = ? and s.rownum > ?)";
	
	public OrderDAOImp(ConnectionFactory myFactory) throws DAOException, SQLException {
		super(EcommerceConnectionFactory.getInstance());
		conn = super.getConnection();
		conn.setAutoCommit(false);
	}

	@Override
	public OrderVO saveOrder(OrderVO order) throws DAOException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {			
			ps = conn.prepareStatement(INSERT_ORDER, new String[]{"store_order_id"});
			ps.setString(1, order.getId());
			ps.setInt(2, order.getSequence());
			ps.setString(3, order.getGroup());
			ps.setString(4, order.getStatus());
			ps.setString(5, order.getStatusDescription());
			ps.setDouble(6, order.getValue());
			ps.setTimestamp(7, DateTimeUtil.convertDateToSQLDate(order.getCreateDate()));
			ps.setTimestamp(8, DateTimeUtil.convertDateToSQLDate(order.getUpdateDate()));
			ps.setString(9, order.getOrigin());
			ps.setString(10, order.getFollowupEmail());
			ps.setString(11, order.getHost());
			ps.setString(12, order.getChangeAttachment());
			ps.setString(13, order.getMarketPlaceOrderId());
			ps.setString(14, order.getOperatorId());
			ps.setString(15, order.getMarketingDataId());
			ps.setString(16, order.getRatesBenefitsId());
			ps.setLong(17, order.getChangesDataId());
			ps.setLong(18, order.getLogisticsInfoId());
			ps.setString(19, order.getCustomer().getDocument());
			ps.setLong(20, order.getCustomer().getSequence());
			
			ps.executeUpdate();
			
			rs = ps.getGeneratedKeys();
			
			if(rs.next()){
				order.setStoreOrderId(rs.getLong(1));
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return order;
	}

	@Override
	public CustomerVO saveCustomer(CustomerVO customerVO) throws DAOException{
		PreparedStatement ps = null;
		try {			
			ps = conn.prepareStatement(INSERT_CUSTOMER);
			ps.setString(1, customerVO.getId());
			ps.setString(2, customerVO.getEmail());
			ps.setString(3, customerVO.getFirstName());
			ps.setString(4, customerVO.getLastName());
			ps.setString(5, customerVO.getDocumentType());
			ps.setString(6, customerVO.getDocument());
			ps.setLong(7, customerVO.getSequence());
			ps.setString(8, customerVO.isCorporate()? "S": "N");
			ps.setString(9, customerVO.getPhone());
			ps.setString(10, customerVO.getCorporateName());
			ps.setString(11, customerVO.getTradeName());
			ps.setString(12, customerVO.getCorporateDocument());
			ps.setString(13, customerVO.getStateInscription());
			ps.setString(14, customerVO.getCorporatePhone());
			ps.setInt(15, customerVO.getIntegrationStatus().getId());
			ps.setString(16, customerVO.getSynchroId());
			
			ps.executeUpdate();			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
		}
		return customerVO;
	}
	
	public AddressVO saveAddress(AddressVO addressVO) throws DAOException{
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(INSERT_ADDRESS);
			
			ps.setString(1, addressVO.getStreet());
			ps.setString(2, addressVO.getNumber());
			ps.setString(3, addressVO.getComplement());
			ps.setString(4, addressVO.getNeighborhood());
			ps.setString(5, addressVO.getCity());
			ps.setString(6, addressVO.getState());
			ps.setString(7, addressVO.getCountry());
			ps.setString(8, addressVO.getFormattedAddress());
			ps.setString(9, addressVO.getPostalCode());
			ps.setString(10, addressVO.getReference());
			ps.setString(11, addressVO.getReceiveName());
			ps.setString(12, addressVO.getCustomer().getDocument());
			ps.setLong(13, addressVO.getCustomer().getSequence());

			ps.executeUpdate();			 
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
		}

		return addressVO;
	}
	
	@Override
	public ItemVO saveItem(ItemVO itemVO) throws DAOException {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(INSERT_ITEM);
			
			ps.setString(1, itemVO.getSku());
			ps.setInt(2, itemVO.getQuantity());
			if(itemVO.getSallingPrice() != null){
				ps.setDouble(3, itemVO.getSallingPrice());
			} else {
				ps.setDouble(3, 0);
			}
			if(itemVO.getTax() != null){
				ps.setDouble(4, itemVO.getTax());
			} else {
				ps.setDouble(4, 0);
			}
			if(itemVO.getShipping() != null){
				ps.setDouble(5, itemVO.getShipping());
			} else {
				ps.setDouble(5, 0);
			}
			if(itemVO.getDiscounts() != null){
				ps.setDouble(6, itemVO.getDiscounts());
			} else {
				ps.setDouble(6, 0);
			}
			ps.setString(7, itemVO.getCurrency());
			ps.setString(8, itemVO.getUnitMeasure());
			if(itemVO.getPrice() != null){
				ps.setDouble(9, itemVO.getPrice());
			} else {
				ps.setDouble(9, 0);
			}
			if(itemVO.getListPrice() != null){
				ps.setDouble(10, itemVO.getListPrice());
			} else {
				ps.setDouble(10, 0);
			}
			ps.setString(11, itemVO.getImageUrl());
			ps.setString(12, itemVO.getDetailUrl());
			ps.setString(13, itemVO.isGift()? "S": "N");
			ps.setInt(14, itemVO.getItemIndex());
			ps.setString(15, itemVO.getLockId());
			ps.setLong(16, itemVO.getOrder().getStoreOrderId());
			ps.setInt(17, itemVO.getSequence());

			ps.executeUpdate();			 
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
		}
		return itemVO;
	}
	
	@Override
	public List<ItemVO> saveAllItems(List<ItemVO> list) throws DAOException {
		for(ItemVO itemVO : list){
			saveItem(itemVO);
		}
		return list;
	}
	
	@Override
	public PaymentVO savePayment(PaymentVO payment) throws DAOException {
		PreparedStatement ps = null;
		PreparedStatement psConnector = null;
		try {			
			ps = conn.prepareStatement(INSERT_PAYMENT);
			ps.setString(1, payment.getId());
			ps.setString(2, payment.getPaymentSystem());
			ps.setString(3, payment.getPaymentSystemName());
			if(payment.getValue() != null){
				ps.setDouble(4, payment.getValue());
			} else {
				ps.setDouble(4, 0);
			}
			ps.setInt(5, payment.getInstallments());
			if(payment.getReferenceValue() != null){
				ps.setDouble(6, payment.getReferenceValue());
			} else {
				ps.setDouble(6, 0);
			}
			ps.setString(7, payment.getFirstDigits());
			ps.setString(8, payment.getLastDigits());
			ps.setString(9, payment.getUrl());
			ps.setString(10, payment.getGiftCardId());
			ps.setString(11, payment.getGiftCardName());
			ps.setString(12, payment.getGiftCardCaption());
			ps.setString(13, payment.getRedemptionCode());
			ps.setString(14, payment.getGroup());
			ps.setString(15, payment.getBillingAddress());
			ps.setLong(16, payment.getOrder().getStoreOrderId());
			
			ps.executeUpdate();
			
			ConnectorResponseVO connectorResponse = payment.getConnectorResponse();

			if(connectorResponse != null){
				psConnector = conn.prepareStatement(INSERT_PAYMENT_CONNECTOR);
				psConnector.setString(1, connectorResponse.getArp());
				psConnector.setString(2, connectorResponse.getAuthId());
				psConnector.setString(3, connectorResponse.getMessage());
				psConnector.setString(4, connectorResponse.getNsu());
				psConnector.setString(5, connectorResponse.getReturCod());
				psConnector.setString(6, connectorResponse.getTid());
				psConnector.setString(7, connectorResponse.getNumberAuthentication());
				psConnector.setString(8, connectorResponse.getNumberCV());
				psConnector.setString(9, connectorResponse.getPayment().getId());
				
				psConnector.executeUpdate();
			}			
			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
			super.close(psConnector);
		}
		return payment;
	}

	@Override
	public List<PaymentVO> saveAllPayments(List<PaymentVO> list) throws DAOException {
		for(PaymentVO paymentVO : list){
			savePayment(paymentVO);
		}
		return list;
	}
	
	@Override
	public List<AddressVO> getAddressByCustomeDocument(String document) throws DAOException{
		List<AddressVO> list = new ArrayList<AddressVO>();
		ResultSet rs = null;
		PreparedStatement ps = null;
		AddressVO address = null;
		try {
			ps = conn.prepareStatement(QUERY_ADDRESS_BY_CUSTOMER_DOCUMENT);
			ps.setString(1, document);
			rs = ps.executeQuery();
			while(rs.next()) {
				CustomerVO customer = new CustomerVO();
				address = customer.getAddress();
				address.setStreet(rs.getString("street"));
				address.setNumber(rs.getString("nu"));
				address.setComplement(rs.getString("complement"));
				address.setNeighborhood(rs.getString("neighborhood"));
				address.setCity(rs.getString("city"));
				address.setState(rs.getString("state"));
				address.setCountry(rs.getString("country"));
				address.setFormattedAddress(rs.getString("formatted_address"));
				address.setPostalCode(rs.getString("postal_code"));
				address.setReference(rs.getString("address_reference"));
				address.setReceiveName(rs.getString("receiver_name"));
				customer.setDocument(rs.getString("customer_document"));
				customer.setSequence(rs.getLong("customer_sequence"));	
				list.add(address);
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return list;
	}
	
	@Override
	public List<CustomerVO> getCustomersAndAddressByDocument(String document) throws DAOException{
		List<CustomerVO> list = new ArrayList<CustomerVO>();
		ResultSet rs = null;
		PreparedStatement ps = null;
		CustomerVO customer = null;
		try {
			ps = conn.prepareStatement(QUERY_CUSTOMER_AND_ADDRESS_BY_DOCUMENT);
			ps.setString(1, document);
			rs = ps.executeQuery();
			while(rs.next()) {
				customer = new CustomerVO();
				customer = createCustomer(rs, customer);
				createAddress(rs, customer.getAddress());				
				list.add(customer);
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return list;
	}
	
	@Override
	public CustomerVO getCustomerByOrderId(String orderId) throws DAOException{
		ResultSet rs = null;
		PreparedStatement ps = null;
		CustomerVO customer = null;
		try {
			ps = conn.prepareStatement(QUERY_CUSTOMER_BY_ORDERID);
			ps.setString(1, orderId);
			rs = ps.executeQuery();
			if(rs.next()) {
				customer = new CustomerVO();
				customer = createCustomer(rs, customer);
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return customer;
	}
	
	@Override
	public List<OrderVO> getOrderConfirmToWevo() throws DAOException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		OrderVO order = null;
		List<OrderVO> list = new ArrayList<OrderVO>();
		
		try {			
			ps = conn.prepareStatement(QUERY_ORDER_RECORDED_IN_SYNCHRO);
			rs = ps.executeQuery();
			
			while(rs.next()){
				order = new OrderVO();
				//order.setCustomerDocument(rs.getString("customer_document"));
				//order.setCustomerSequence(rs.getInt("customer_sequence"));
				order.setStoreOrderId(rs.getLong("store_order_id"));
				order.setId(rs.getString("order_id"));
				order.setSequence(rs.getInt("order_sequence"));
				list.add(order);
			}
		}catch(Exception e){
			logger.error(e);
			throw new DAOException(e);
		}finally{
			super.close(ps, rs);
		}
		return list;
	}
	
	@Override
	public int updateStatus(OrderVO order, IntegrationStatus integrationStatus) throws DAOException{
		int quantity = 0;
		
		PreparedStatement ps = null;
		try {			
			ps = conn.prepareStatement(UPDATE_ORDER_SENT_TO_WEVO);
			ps.setInt(1, integrationStatus.getId());//Processadoe enviado para WEVO
			ps.setLong(2, order.getStoreOrderId());			
			quantity = ps.executeUpdate();			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		}finally{
			super.close(ps);
		}
		return quantity;
	}
	
	private CustomerVO createCustomer(ResultSet rs, CustomerVO customer)throws Exception{		
		customer.setId(rs.getString("profile_id"));
		customer.setEmail(rs.getString("email"));
		customer.setFirstName(rs.getString("first_name"));
		customer.setLastName(rs.getString("last_name"));
		customer.setDocumentType(rs.getString("document_type"));
		customer.setDocument(rs.getString("customer_document"));
		customer.setSequence(rs.getLong("customer_sequence"));
		customer.setCorporate("S".equals(rs.getString("iscorporate")));
		customer.setPhone(rs.getString("phone"));
		customer.setCorporateName(rs.getString("corporate_name"));
		customer.setTradeName(rs.getString("trade_name"));
		customer.setCorporateDocument(rs.getString("corporate_document"));
		customer.setStateInscription(rs.getString("state_inscription"));
		customer.setCorporatePhone(rs.getString("corporate_phone"));
		customer.setIntegrationStatus(IntegrationStatus.getIntegrationStatus(rs.getInt("integration_id")));
		customer.setSynchroId(rs.getString("synchro_id"));
		return customer;
	}
	
	private AddressVO createAddress(ResultSet rs, AddressVO address)throws Exception{
		address.setStreet(rs.getString("street"));
		address.setNumber(rs.getString("nu"));
		address.setComplement(rs.getString("complement"));
		address.setNeighborhood(rs.getString("neighborhood"));
		address.setCity(rs.getString("city"));
		address.setState(rs.getString("state"));
		address.setCountry(rs.getString("country"));
		address.setFormattedAddress(rs.getString("formatted_address"));
		address.setPostalCode(rs.getString("postal_code"));
		address.setReference(rs.getString("address_reference"));
		address.setReceiveName(rs.getString("receiver_name"));
		return address;
	}
	
	public List<String> getSerialNumber(Long sku, int quantity) throws DAOException {
			PreparedStatement ps = null;
			ResultSet rs = null;
			List<String> seriais = new ArrayList<String>();
			try {			
				ps = conn.prepareStatement(SQL_UPDATE_SERIAL_TS_VND, new String[]{"nu_ser"});
				ps.setLong(1, sku);
				ps.setInt(2, quantity);
				ps.executeUpdate();
				
				rs = ps.getGeneratedKeys();
				
				if(rs.next()){
					seriais.add(rs.getString(1));
				}
			} catch (Exception e) {
				logger.error(e);
				throw new DAOException(e);
			} finally {
				super.close(ps, rs);
			}
		return seriais;
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
