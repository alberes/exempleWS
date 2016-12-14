package br.com.cea.ecommerce.invoice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.dao.AbstractJDBCDAO;
import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.dao.EcommerceConnectionFactory;
import br.com.cea.ecommerce.common.util.ConverterUtil;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.common.vo.IntegrationStatus;
import br.com.cea.ecommerce.invoice.vo.AddressVO;
import br.com.cea.ecommerce.invoice.vo.ConnectorResponseVO;
import br.com.cea.ecommerce.invoice.vo.CourierVO;
import br.com.cea.ecommerce.invoice.vo.CustomerVO;
import br.com.cea.ecommerce.invoice.vo.InvoiceSynchro;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;
import br.com.cea.ecommerce.invoice.vo.ItemVO;
import br.com.cea.ecommerce.invoice.vo.OrderVO;
import br.com.cea.ecommerce.invoice.vo.PaymentVO;
import br.com.cea.ecommerce.invoice.vo.TotalsVO;

public class InvoiceDAOImp extends AbstractJDBCDAO implements InvoiceDAO{

	private Logger logger = LogManager.getLogger(getClass());
	
	private Connection conn;
	
	private static final String INSERT_INVOICE =
		"INSERT INTO ADMEC01.invoice( "
			+ "store_invoice_id"
			+ ",invoice_id "
			+ ",invoice_type "
			+ ",create_date "
			+ ",update_date "
			+ ",issuance_date "
			+ ",order_id "
			+ ",items "
			+ ",totals "
			+ ",sales_channel "
			+ ",customer "
			+ ",transactions "
			+ ",fiscal_document "
			+ ",dt_inc, dt_upd "
			+ ",integration_id "
			+ ",CUSTOMER_DOCUMENT "
			+ ",CUSTOMER_SEQUENCE "
			+ ",CUSTOMER_SYNCHRO_ID "
			+ ",CHECKOUT "
		+ ") VALUES ( "
			+ "ADMEC01.sqn_invoice.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
		+ ")";
	
	private static final String INSERT_ORDER = "INSERT INTO ADMEC01.order_table(store_order_id, order_id, invoice_id, sequence_order, dt_inc, dt_upd, store_invoice_id) VALUES (sqn_order_table.nextval, ?, ?, ?, ?, ?, ?)";

	private static final String INSERT_CUSTOMER = "INSERT INTO ADMEC01.customer(customer_id, email, first_name, last_name, store_invoice_id, document_type, customer_document, phone, corporate_name, trade_name, corporate_document,"
			+ " state_inscription, corporate_phone, iscorporate, dt_inc, dt_upd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_ADDRESS = "INSERT INTO ADMEC01.address(street, nu, country, state, city, neighborhood, postal_code, address_reference, receiver_name, formatted_address, components, dt_inc, dt_upd, store_invoice_id)"
			+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_ITEM = "INSERT INTO ADMEC01.item(sku, quantity, selling_price, tax, discounts, shipping, currency, unit_of_measure, dt_inc, dt_upd, store_order_id, class_cod, sequence_order, item_name, item_serial, ean)"
			+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
	private static final String INSERT_PAYMENT = "INSERT INTO ADMEC01.payment(payment_id, payment_system, payment_system_name, payment_value, installments, reference_value, first_digits, last_digits, payment_url, gift_card_id, gift_card_name, gift_card_caption, redemption_code, group_i, billing_address, connector_responses,  dt_inc, dt_upd, store_invoice_id)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_COURIER = "INSERT INTO ADMEC01.courier(courier_id, courier_name, state_inscription, plaque, cargo_type, gross_weight, net_weight, courier_self, dt_inc, dt_upd, store_invoice_id, volume)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_TOTALS = "INSERT INTO ADMEC01.totals(totals_value, shipping, discounts, tax, dt_inc, dt_upd, store_invoice_id)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?)";

	private static final String INSERT_PAYMENT_CONNECTOR = "INSERT INTO ADMEC01.connector_responses(tid, auth_id, return_code, msg, nsu, arp, payment_id) VALUES(?, ?, ?, ?, ?, ?, ?)";
	
	private static final String QUERY_INVOICE_BY_INVOICE_ID =
		"SELECT invoice.store_invoice_id "
			+ ",invoice.invoice_id "
			+ ",invoice.invoice_type "
			+ ",invoice.create_date "
			+ ",invoice.update_date "
			+ ",invoice.issuance_date "
			+ ",invoice.items "
			+ ",invoice.totals "
			+ ",invoice.sales_channel "
			+ ",invoice.customer "
			+ ",invoice.transactions "
			+ ",invoice.fiscal_document "
			+ ",invoice.dt_inc "
			+ ",invoice.dt_upd "
			+ ",invoice.integration_id "
			+ ",invoice.checkout "
			+ ",order_table.store_order_id "
			+ ",order_table.order_id "
			+ ",order_table.sequence_order "
			+ ",order_table.dt_inc dt_inc_ord "
			+ ",order_table.dt_upd dt_upd_ord "
			+ ",totals.totals_value "
			+ ",totals.shipping "
			+ ",totals.discounts "
			+ ",totals.tax "
			+ ",totals.dt_inc dt_inc_tot "
			+ ",totals.dt_upd dt_upd_tot "
			+ ",item.sku "
			+ ",item.quantity "
			+ ",item.selling_price "
			+ ",item.tax tax_item "
			+ ",item.discounts discounts_item "
			+ ",item.shipping shipping_item "
			+ ",item.currency "
			+ ",item.unit_of_measure"
			+ ",item.dt_inc dt_inc_item "
			+ ",item.dt_upd dt_upd_item "
			+ ",item.class_cod "
			+ ",item.sequence_order sequence_order_item "
			+ ",item_name "
			+ ",item_serial "
			+ ",ean "
			+ ",courier.courier_id "
			+ ",courier.courier_name "
			+ ",courier.state_inscription "
			+ ",courier.plaque "
			+ ",courier.cargo_type "
			+ ",courier.gross_weight "
			+ ",courier.net_weight "
			+ ",courier.courier_self "
			+ ",courier.dt_inc dt_inc_cou "
			+ ",courier.dt_upd dt_upd_cou "
			+ ",courier.volume "
			+ ",vw.cd_fne fne "
			+ ",vw.cd_cls cls "
			+ ",vw.cd_cls_cod cod "
		+ "FROM ADMEC01.invoice"
			+ " JOIN ADMEC01.order_table ON order_table.store_invoice_id = invoice.store_invoice_id"
			+ " JOIN ADMEC01.item ON item.store_order_id = order_table.store_order_id"
			+ " JOIN ADMEC01.totals ON totals.store_invoice_id = invoice.store_invoice_id"
			+ " JOIN ADMEC01.courier ON courier.store_invoice_id = invoice.store_invoice_id"
			+ " JOIN ADMEC01.vw_item_cls_fne vw ON item.sku = vw.cd_item"
		+ " WHERE invoice.invoice_id = ?";

	private static final String QUERY_EXISTS_INVOICE_ID = "SELECT invoice_id FROM ADMEC01.invoice WHERE invoice_id = ?";
	
	private static final String QUERY_INVOICE_TO_WEVO = 
		"SELECT "
			+ "C.NUM_PEDIDO "
			+ ",C.NUMERO "
			+ ",C.COD_REFERENCIA "
			+ ",D.VL_TOTAL_FATURADO "
			+ ",C.INTEGRATION_ID "
			+ ",C.DT_INCLUSAO "
			+ ",D.NFE_LOCALIZADOR "
			+ ",D.SERIE_SUBSERIE "
			+ ",X.CAMPO_XML "
		+ "FROM "
			+ "ADMEC01.CA2_SNF_ECOM_EMITIDO C"
			+ ",ADMEC01.COR_DOF D "
			+ ",ADMEC01.NFE_XML X "
		+ "WHERE D.DOF_IMPORT_NUMERO = C.COD_REFERENCIA "
		+ "AND C.CHAVE_ORIGEM = X.CHAVE_ORIGEM "
		+ "AND C.INTEGRATION_ID = 4 "
		+ "AND STATUS = 'OK'";
	
	private static final String UPDATE_INVOICE_SENT_TO_WEVO = 
		"UPDATE ADMEC01.CA2_SNF_ECOM_EMITIDO SET integration_id = ? WHERE cod_referencia = ?";
	
	private final static String SQL_UPDATE_SERIAL_TS_VND = "UPDATE admec01.ec010t_serial SET nu_ped = ?, ts_vnd = ? WHERE nu_ser IN(SELECT s.nu_ser FROM admec01.ec010t_serial s"
			+ " WHERE s.ts_vnd IS NULL AND s.ni_sku = ? and rownum <= ?)";
	
	private final static String SQL_SELECT_SERIAL_NU_SER = "SELECT nu_ser FROM admec01.ec010t_serial WHERE nu_ped = ? AND ts_vnd = ?";
	
	private static final String QUERY_GET_STORE_ORDER_ID_BY_ORDER_ID = 
			"SELECT store_order_id FROM ADMEC01.order_table WHERE order_id = ?";
	
	public InvoiceDAOImp(ConnectionFactory myFactory) throws DAOException, SQLException {
		super(EcommerceConnectionFactory.getInstance());
		conn = super.getConnection();
		conn.setAutoCommit(false);
	}

	@Override
	public InvoiceVO saveInvoice(InvoiceVO invoice) throws DAOException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {			
			ps = conn.prepareStatement(INSERT_INVOICE, new String[]{"store_invoice_id"});
			ps.setString(1, invoice.getId());
			ps.setString(2, invoice.getInvoiceType());
			ps.setTimestamp(3, DateTimeUtil.convertDateToSQLDate(invoice.getCreateDate()));
			ps.setTimestamp(4, DateTimeUtil.convertDateToSQLDate(invoice.getUpdateDate()));
			ps.setTimestamp(5, DateTimeUtil.convertDateToSQLDate(invoice.getIssuanceDate()));
			ps.setString(6, invoice.getOrder().getId());
			ps.setInt(7, invoice.getOrder().getItems().size());
			if(invoice.getTotal() == null){
				invoice.setTotal(0d);
			}
			ps.setDouble(8, invoice.getTotal());
			ps.setString(9, invoice.getSalesChannel());
			ps.setString(10, invoice.getCustomer().getId());
			ps.setString(11, invoice.getTransaction());
			ps.setString(12, invoice.getFiscalDocument());
			ps.setTimestamp(13, DateTimeUtil.convertDateToSQLDate(invoice.getRecordCreateDate()));
			ps.setTimestamp(14, DateTimeUtil.convertDateToSQLDate(invoice.getRecordUpdateDate()));
			ps.setInt(15, invoice.getIntegrationStatus().getId());

			ps.setString(16, invoice.getCustomer().getDocument());
			ps.setLong(17, invoice.getCustomer().getSequence());
			ps.setString(18, invoice.getCustomer().getCustomerSynchroId());
			if(invoice.getCheckout() == null){
				invoice.setCheckout(0);
			}
			ps.setInt(19, invoice.getCheckout());
			
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			
			if(rs.next()){
				invoice.setStoreInvoiceId(rs.getLong(1));
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return invoice;
	}
	
	@Override
	public OrderVO saveOrder(OrderVO order) throws DAOException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {			
			ps = conn.prepareStatement(INSERT_ORDER, new String[]{"store_order_id"});
			ps.setString(1, order.getId());
			ps.setString(2, order.getInvoice().getId());
			if(order.getSequence() == null){
				order.setSequence(0);
			}
			ps.setInt(3, order.getSequence());
			ps.setTimestamp(4, DateTimeUtil.convertDateToSQLDate(order.getRecordCreateDate()));
			ps.setTimestamp(5, DateTimeUtil.convertDateToSQLDate(order.getRecordUpdateDate()));
			ps.setLong(6, order.getInvoice().getStoreInvoiceId());
			
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
	public InvoiceVO getInvoiceById(String id) throws DAOException{
		InvoiceVO invoice = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(QUERY_INVOICE_BY_INVOICE_ID);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				invoice = new InvoiceVO();
				
				crateInvoice(rs, invoice);
				crateOrder(rs, invoice.getOrder());				
				//createCustomer(rs, invoice.getCustomer());				
				createTotals(rs, invoice.getTotals());
				createCourier(rs, invoice.getCourier());
				ItemVO item = createItem(rs);
				List<ItemVO> items = invoice.getOrder().getItems();
				items.add(item);
				
				while(rs.next()){
					item = createItem(rs);
					items.add(item);
				}
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return invoice;
	}
	
	@Override
	public ItemVO saveItem(ItemVO itemVO) throws DAOException {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(INSERT_ITEM);
			
			ps.setString(1, itemVO.getSkuId());
			if(itemVO.getQuantity() == null){
				itemVO.setQuantity(0);
			}
			ps.setInt(2, itemVO.getQuantity());
			if(itemVO.getSellingPrice() == null){
				itemVO.setSellingPrice(0d);
			}
			ps.setDouble(3, itemVO.getSellingPrice());
			if(itemVO.getTax() == null){
				itemVO.setTax(0d);
			}
			ps.setDouble(4, itemVO.getTax());
			if(itemVO.getDiscounts() == null){
				itemVO.setDiscounts(0d);
			}
			ps.setDouble(5, itemVO.getDiscounts());
			if(itemVO.getShipping() == null){
				itemVO.setShipping(0d);
			}
			ps.setDouble(6, itemVO.getShipping());
			ps.setString(7, itemVO.getCurrency());
			ps.setString(8, itemVO.getUnitMeasure());
			ps.setTimestamp(9, DateTimeUtil.convertDateToSQLDate(itemVO.getRecordCreateDate()));
			ps.setTimestamp(10, DateTimeUtil.convertDateToSQLDate(itemVO.getRecordUpdateDate()));
			ps.setLong(11, itemVO.getOrder().getStoreOrderId());
			ps.setString(12, itemVO.getClassCod());
			if(itemVO.getSequence() == null){
				itemVO.setSequence(1);
			}
			ps.setInt(13, itemVO.getSequence());
			ps.setString(14, itemVO.getName());
			ps.setString(15, itemVO.getSerial());
			ps.setString(16, itemVO.getEan());

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
			if(payment.getValue() == null){
				payment.setValue(0d);
			}
			ps.setDouble(4, payment.getValue());
			if(payment.getInstallments() == null){
				payment.setInstallments(0);
			}
			ps.setInt(5, payment.getInstallments());
			if(payment.getReferenceValue() == null){
				payment.setReferenceValue(0d);
			}
			ps.setDouble(6, payment.getReferenceValue());
			ps.setString(7, payment.getFirstDigits());
			ps.setString(8, payment.getLastDigits());
			ps.setString(9, payment.getUrl());
			ps.setString(10, payment.getGiftCardId());
			ps.setString(11, payment.getGiftCardName());
			ps.setString(12, payment.getGiftCardCaption());
			ps.setString(13, payment.getRedemptionCode());
			ps.setString(14, payment.getGroup());
			ps.setString(15, payment.getBillingAddress());
			ps.setString(16, payment.getConnectResponses());
			ps.setTimestamp(17, DateTimeUtil.convertDateToSQLDate(payment.getRecordCreateDate()));
			ps.setTimestamp(18, DateTimeUtil.convertDateToSQLDate(payment.getRecordUpdateDate()));
			ps.setLong(19, payment.getInvoice().getStoreInvoiceId());
			
			ps.executeUpdate();
			
			ConnectorResponseVO connectorResponse = payment.getConnetorResponse();

			if(connectorResponse !=null){
				psConnector = conn.prepareStatement(INSERT_PAYMENT_CONNECTOR);
				psConnector.setString(1, connectorResponse.getTid());
				psConnector.setString(2, connectorResponse.getAuthId());
				psConnector.setString(3, connectorResponse.getReturCod());
				psConnector.setString(4, connectorResponse.getMessage());
				psConnector.setString(5, connectorResponse.getNsu());
				psConnector.setString(6, connectorResponse.getArp());
				psConnector.setString(7, payment.getId());
				
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
	
	public AddressVO saveAddress(AddressVO addressVO) throws DAOException{
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(INSERT_ADDRESS);
			
			ps.setString(1, addressVO.getStreet());
			ps.setString(2, addressVO.getNumber());
			ps.setString(3, addressVO.getCountry());
			ps.setString(4, addressVO.getState());
			ps.setString(5, addressVO.getCity());
			ps.setString(6, addressVO.getNeighborhood());
			ps.setString(7, addressVO.getPostalCode());
			ps.setString(8, addressVO.getAddressReference());
			ps.setString(9, addressVO.getReceiveName());
			ps.setString(10, addressVO.getFormattedAddress());
			ps.setString(11, addressVO.getComponents());
			ps.setTimestamp(12, DateTimeUtil.convertDateToSQLDate(addressVO.getRecordCreateDate()));
			ps.setTimestamp(13, DateTimeUtil.convertDateToSQLDate(addressVO.getRecordUpdateDate()));
			ps.setLong(14, addressVO.getInvoice().getStoreInvoiceId());

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
	public CustomerVO saveCustomer(CustomerVO customerVO) throws DAOException{
		PreparedStatement ps = null;
		try {			
			ps = conn.prepareStatement(INSERT_CUSTOMER);
			ps.setString(1, customerVO.getId());
			ps.setString(2, customerVO.getEmail());
			ps.setString(3, customerVO.getFirstName());
			ps.setString(4, customerVO.getLastName());
			ps.setLong(5, customerVO.getInvoice().getStoreInvoiceId());
			ps.setString(6, customerVO.getDocumentType());
			ps.setString(7, customerVO.getDocument());
			ps.setString(8, customerVO.getPhone());
			ps.setString(9, customerVO.getCorporateName());
			ps.setString(10, customerVO.getTradeName());
			ps.setString(11, customerVO.getCorporateDocument());
			ps.setString(12, customerVO.getStateInscription());
			ps.setString(13, customerVO.getCorporatePhone());
			ps.setString(14, (customerVO.isCorporate()? "S": "N"));
			ps.setTimestamp(15, DateTimeUtil.convertDateToSQLDate(customerVO.getRecordCreateDate()));
			ps.setTimestamp(16, DateTimeUtil.convertDateToSQLDate(customerVO.getRecordUpdateDate()));
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
		}
		return customerVO;
	}
	
	@Override
	public CourierVO saveCourier(CourierVO courierVO) throws DAOException{
		PreparedStatement ps = null;
		try {			
			ps = conn.prepareStatement(INSERT_COURIER);
			ps.setString(1, courierVO.getId());
			ps.setString(2, courierVO.getName());
			ps.setString(3, courierVO.getStateInscription());
			ps.setString(4, courierVO.getPlaque());
			ps.setString(5, courierVO.getCargoType());
			if(courierVO.getGrossWeight() == null){
				courierVO.setGrossWeight(0d);
			}
			ps.setDouble(6, courierVO.getGrossWeight());
			if(courierVO.getNetWeight() == null){
				courierVO.setNetWeight(0d);
			}
			ps.setDouble(7, courierVO.getNetWeight());
			ps.setString(8, courierVO.getSelf());
			ps.setTimestamp(9, DateTimeUtil.convertDateToSQLDate(courierVO.getRecordCreateDate()));
			ps.setTimestamp(10, DateTimeUtil.convertDateToSQLDate(courierVO.getRecordUpdateDate()));
			ps.setLong(11, courierVO.getInvoice().getStoreInvoiceId());
			if(courierVO.getVolumeNumber() == null){
				courierVO.setVolumeNumber(0);;
			}
			ps.setInt(12, courierVO.getVolumeNumber());
			
			ps.executeUpdate();			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
		}
		return courierVO;
	}
	
	@Override
	public TotalsVO saveTotals(TotalsVO totalsVO) throws DAOException{
		PreparedStatement ps = null;
		try {			
			ps = conn.prepareStatement(INSERT_TOTALS);
			if(totalsVO.getValue() == null){
				totalsVO.setValue(0d);
			}
			ps.setDouble(1, totalsVO.getValue());
			if(totalsVO.getShipping() == null){
				totalsVO.setShipping(0d);
			}
			ps.setDouble(2, totalsVO.getShipping());
			if(totalsVO.getDiscounts() == null){
				totalsVO.setDiscounts(0d);
			}
			ps.setDouble(3, totalsVO.getDiscounts());
			if(totalsVO.getTax() == null){
				totalsVO.setTax(0d);
			}
			ps.setDouble(4, totalsVO.getTax());
			ps.setTimestamp(5, DateTimeUtil.convertDateToSQLDate(totalsVO.getRecordCreateDate()));
			ps.setTimestamp(6, DateTimeUtil.convertDateToSQLDate(totalsVO.getRecordUpdateDate()));
			ps.setLong(7, totalsVO.getInvoice().getStoreInvoiceId());
			
			ps.executeUpdate();			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
		}
		return totalsVO;
	}
	
	private void crateInvoice(ResultSet rs, InvoiceVO invoice) throws Exception{
		invoice.setStoreInvoiceId(rs.getLong("store_invoice_id"));
		invoice.setId(rs.getString("invoice_id"));
		invoice.setInvoiceType(rs.getString("invoice_type"));
		invoice.setRecordCreateDate(rs.getDate("create_date"));
		invoice.setRecordUpdateDate(rs.getDate("update_date"));
		invoice.setIssuanceDate(rs.getDate("issuance_date"));
		invoice.setTotal(rs.getDouble("totals"));
		invoice.setFiscalDocument(rs.getString("fiscal_document"));
		invoice.setCreateDate(rs.getDate("dt_inc"));
		invoice.setUpdateDate(rs.getDate("dt_upd"));
		invoice.setIntegrationStatus(IntegrationStatus.getIntegrationStatus(rs.getInt("integration_id")));
		invoice.setCheckout(rs.getInt("checkout"));
	}
	
	private void crateOrder(ResultSet rs, OrderVO order) throws Exception{
		order.setStoreOrderId(rs.getLong("store_order_id"));
		order.setId(rs.getString("order_id"));
		order.setSequence(rs.getInt("sequence_order"));
		order.setRecordCreateDate(rs.getDate("dt_inc_ord"));
		order.setRecordUpdateDate(rs.getDate("dt_upd_ord"));
	}
	
	/*private void createCustomer(ResultSet rs, CustomerVO customer)throws Exception{
		customer.setId(rs.getString("customer_id"));
		customer.setEmail(rs.getString("email"));
		customer.setFirstName(rs.getString("first_name"));
		customer.setLastName(rs.getString("last_name"));
		customer.setDocumentType(rs.getString("document_type"));
		customer.setDocument(rs.getString("customer_document"));
		customer.setPhone(rs.getString("phone"));
		customer.setCorporateName(rs.getString("corporate_name"));
		customer.setTradeName(rs.getString("trade_name"));
		customer.setCorporateDocument(rs.getString("corporate_document"));
		customer.setStateInscription(rs.getString("state_inscription"));
		customer.setCorporatePhone(rs.getString("corporate_phone"));
		customer.setCorporate("Y".equals(rs.getString("iscorporate")));
		customer.setRecordCreateDate(rs.getDate("dt_inc_cus"));
		customer.setRecordUpdateDate(rs.getDate("dt_upd_cus"));
	}*/
	
	private void createTotals(ResultSet rs, TotalsVO totals)throws Exception{
		totals.setValue(rs.getDouble("totals_value"));
		totals.setShipping(rs.getDouble("shipping"));
		totals.setDiscounts(rs.getDouble("discounts"));
		totals.setTax(rs.getDouble("tax"));
		totals.setRecordCreateDate(rs.getDate("dt_inc_tot"));
		totals.setRecordUpdateDate(rs.getDate("dt_upd_tot"));
	}
	
	private void createCourier(ResultSet rs, CourierVO courier)throws Exception{
		courier.setId(rs.getString("courier_id"));
		courier.setName(rs.getString("courier_name"));
		courier.setStateInscription(rs.getString("state_inscription"));
		courier.setPlaque(rs.getString("plaque"));
		courier.setCargoType(rs.getString("cargo_type"));
		courier.setGrossWeight(rs.getDouble("gross_weight"));
		courier.setNetWeight(rs.getDouble("net_weight"));
		courier.setSelf(rs.getString("courier_self"));
		courier.setRecordCreateDate(rs.getDate("dt_inc_cou"));
		courier.setRecordUpdateDate(rs.getDate("dt_upd_cou"));
		courier.setVolumeNumber(rs.getInt("volume"));
	}
	
	private ItemVO createItem(ResultSet rs)throws Exception{
		ItemVO item = new ItemVO();
		item.setSkuId(rs.getString("sku"));
		item.setQuantity(rs.getInt("quantity"));
		item.setSellingPrice(rs.getDouble("selling_price"));
		item.setTax(rs.getDouble("tax_item"));
		item.setDiscounts(rs.getDouble("discounts_item"));
		item.setShipping(rs.getDouble("shipping_item"));
		item.setCurrency(rs.getString("currency"));
		item.setUnitMeasure(rs.getString("unit_of_measure"));
		item.setRecordCreateDate(rs.getDate("dt_inc_item"));
		item.setRecordUpdateDate(rs.getDate("dt_upd_item"));
		item.setClassCod(rs.getString("class_cod"));
		item.setSequence(rs.getInt("sequence_order_item"));
		item.setItemFNE(rs.getString("fne"));
		item.setItemClass(rs.getString("cls"));
		item.setItemCode(rs.getString("cod"));
		item.setName(rs.getString("item_name"));
		item.setSerial(rs.getString("item_serial"));
		item.setEan(rs.getString("ean"));
		return item;
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
	
	@Override
	public List<InvoiceSynchro> getSynchroInvoices() throws DAOException{
		List<InvoiceSynchro> invoiceList = new ArrayList<InvoiceSynchro>();
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(QUERY_INVOICE_TO_WEVO);
			rs = ps.executeQuery();
			while (rs.next()) {
				InvoiceSynchro invoice = new InvoiceSynchro();
				invoice.setOrderId(rs.getString("NUM_PEDIDO"));
				invoice.setInvoiceNumber(rs.getString("NUMERO"));
				invoice.setSynchroId(rs.getString("COD_REFERENCIA"));
				invoice.setTotalValue(rs.getDouble("VL_TOTAL_FATURADO"));
				invoice.setIntegrationId(rs.getInt("INTEGRATION_ID"));
				invoice.setIssuanceDate(rs.getTimestamp("DT_INCLUSAO"));
				invoice.setAccessKey(rs.getString("NFE_LOCALIZADOR"));
				invoice.setSerie(rs.getString("SERIE_SUBSERIE"));
				invoice.setXml(ConverterUtil.clobToString(rs.getClob("CAMPO_XML")));
				invoiceList.add(invoice);
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return invoiceList;
	}
	
	@Override
	public int updateStatus(InvoiceSynchro invoice, IntegrationStatus integrationStatus) throws DAOException{
		int quantity = 0;
		
		PreparedStatement ps = null;
		try {			
			ps = conn.prepareStatement(UPDATE_INVOICE_SENT_TO_WEVO);
			ps.setInt(1, integrationStatus.getId());
			ps.setString(2, invoice.getSynchroId());			
			quantity = ps.executeUpdate();			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		}finally{
			super.close(ps);
		}
		return quantity;
	}

	@Override
	public int updateStatus(String invoiceId, IntegrationStatus integrationStatus) throws DAOException{
		int quantity = 0;
		
		PreparedStatement ps = null;
		try {			
			ps = conn.prepareStatement(UPDATE_INVOICE_SENT_TO_WEVO);
			ps.setInt(1, integrationStatus.getId());
			ps.setString(2, invoiceId);			
			quantity = ps.executeUpdate();			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		}finally{
			super.close(ps);
		}
		return quantity;
	}
	
	@Override
	public boolean existsInvoiceById(String id) throws DAOException{
		ResultSet rs = null;
		PreparedStatement ps = null;
		boolean existInvoice = false;
		try {
			ps = conn.prepareStatement(QUERY_EXISTS_INVOICE_ID);
			ps.setString(1, id);
			rs = ps.executeQuery();
			existInvoice = rs.next();
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return existInvoice;
	}
	
	@Override
	public List<String> getSerialNumber(Long storeOrderId, String sku, int quantity) throws DAOException {
		PreparedStatement ps = null;
		PreparedStatement psSerialNumber = null;
		ResultSet rsSerialNumber = null;
		
		List<String> seriais = new ArrayList<String>();
		Date soldDate = new Date();
		
		try {			
			ps = conn.prepareStatement(SQL_UPDATE_SERIAL_TS_VND);
			ps.setLong(1, storeOrderId);
			ps.setTimestamp(2, DateTimeUtil.convertDateToSQLDate(soldDate));
			ps.setString(3, sku);
			ps.setInt(4, quantity);

			ps.executeUpdate();
			
			psSerialNumber = conn.prepareStatement(SQL_SELECT_SERIAL_NU_SER);
			psSerialNumber.setLong(1, storeOrderId);
			psSerialNumber.setTimestamp(2, DateTimeUtil.convertDateToSQLDate(soldDate));
			
			rsSerialNumber = psSerialNumber.executeQuery();
			
			while(rsSerialNumber.next()){
				seriais.add(rsSerialNumber.getString(1));
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
			super.close(psSerialNumber, rsSerialNumber);
		}
		return seriais;
	}
	
	@Override
	public Long getStoreOrderIdByOrderId(String orderId) throws DAOException{
		ResultSet rs = null;
		PreparedStatement ps = null;
		Long storeOrderId = null;
		try {
			ps = conn.prepareStatement(QUERY_GET_STORE_ORDER_ID_BY_ORDER_ID);
			ps.setString(1, orderId);
			rs = ps.executeQuery();
			if(rs.next()){
				storeOrderId = rs.getLong("store_order_id");
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return storeOrderId;
	}
	
}