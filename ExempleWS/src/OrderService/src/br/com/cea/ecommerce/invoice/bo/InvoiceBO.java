package br.com.cea.ecommerce.invoice.bo;

import java.sql.SQLException;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;

public interface InvoiceBO {
	
	public InvoiceVO createInvoice(InvoiceVO invoiceVO) throws BusinessException, Exception;
	
	public Integer sendInvoiceToWevo() throws BusinessException, Exception;
	
	public boolean existsInvoice(String id) throws BusinessException, Exception;
	
	public Long getStoreOrderIdByOrderId(String orderId) throws BusinessException, Exception;

}
