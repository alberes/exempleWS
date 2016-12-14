package br.com.cea.ecommerce.order.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.vo.IntegrationStatus;
import br.com.cea.ecommerce.order.vo.AddressVO;
import br.com.cea.ecommerce.order.vo.CustomerVO;
import br.com.cea.ecommerce.order.vo.ItemVO;
import br.com.cea.ecommerce.order.vo.OrderVO;
import br.com.cea.ecommerce.order.vo.PaymentVO;

public interface OrderDAO {

	public OrderVO saveOrder(OrderVO order) throws DAOException;
	
	public CustomerVO saveCustomer(CustomerVO customerVO) throws DAOException;
	
	public AddressVO saveAddress(AddressVO addressVO) throws DAOException;
	
	public ItemVO saveItem(ItemVO itemVO) throws DAOException;
	
	public List<ItemVO> saveAllItems(List<ItemVO> list) throws DAOException;
	
	public PaymentVO savePayment(PaymentVO payment) throws DAOException;
	
	public List<PaymentVO> saveAllPayments(List<PaymentVO> list) throws DAOException;
	
	public List<AddressVO> getAddressByCustomeDocument(String document) throws DAOException;
	
	public List<CustomerVO> getCustomersAndAddressByDocument(String document) throws DAOException;
	
	public CustomerVO getCustomerByOrderId(String orderId) throws DAOException;
	
	public List<OrderVO> getOrderConfirmToWevo() throws DAOException;
	
	public int updateStatus(OrderVO order, IntegrationStatus integrationStatus) throws DAOException;
	
	public void rollback() throws SQLException;
	
	public void commit() throws SQLException;
	
	public void close();
}
