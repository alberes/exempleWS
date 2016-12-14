package br.com.cea.ecommerce.invoice.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.vo.IntegrationStatus;
import br.com.cea.ecommerce.invoice.vo.AddressVO;
import br.com.cea.ecommerce.invoice.vo.CourierVO;
import br.com.cea.ecommerce.invoice.vo.CustomerVO;
import br.com.cea.ecommerce.invoice.vo.InvoiceSynchro;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;
import br.com.cea.ecommerce.invoice.vo.ItemVO;
import br.com.cea.ecommerce.invoice.vo.OrderVO;
import br.com.cea.ecommerce.invoice.vo.PaymentVO;
import br.com.cea.ecommerce.invoice.vo.TotalsVO;

public interface InvoiceDAO {
	
	public InvoiceVO saveInvoice(InvoiceVO invoice) throws DAOException;
	
	public InvoiceVO getInvoiceById(String invoiceId) throws DAOException;
	
	public ItemVO saveItem(ItemVO itemVO) throws DAOException;
	
	public List<ItemVO> saveAllItems(List<ItemVO> list) throws DAOException;
	
	public PaymentVO savePayment(PaymentVO payment) throws DAOException;
	
	public List<PaymentVO> saveAllPayments(List<PaymentVO> list) throws DAOException;
	
	public OrderVO saveOrder(OrderVO order) throws DAOException;
	
	public CustomerVO saveCustomer(CustomerVO customerVO) throws DAOException;
	
	public AddressVO saveAddress(AddressVO addressVO) throws DAOException;
	
	public CourierVO saveCourier(CourierVO courierVO) throws DAOException;
	
	public TotalsVO saveTotals(TotalsVO totalsVO) throws DAOException;
	
	public boolean existsInvoiceById(String id) throws DAOException;
	
	public List<String> getSerialNumber(Long storeOrderId, String sku, int quantity) throws DAOException;
	
	public Long getStoreOrderIdByOrderId(String orderId) throws DAOException;
	
	public void rollback() throws SQLException;
	
	public void commit() throws SQLException;
	
	public void close();
	
	public List<InvoiceSynchro> getSynchroInvoices() throws DAOException;
	
	public int updateStatus(InvoiceSynchro invoice, IntegrationStatus integrationStatus) throws DAOException;
	
	public int updateStatus(String invoiceId, IntegrationStatus integrationStatus) throws DAOException;
}