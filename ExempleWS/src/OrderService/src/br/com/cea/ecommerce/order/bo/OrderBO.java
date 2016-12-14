package br.com.cea.ecommerce.order.bo;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.ecommerce.order.vo.CustomerVO;
import br.com.cea.ecommerce.order.vo.OrderVO;

public interface OrderBO {

	public OrderVO createOrder(OrderVO orderVO) throws BusinessException, Exception;
	
	public CustomerVO getCustomer(String document, String street) throws BusinessException, Exception;
	
	public CustomerVO getCustomerByOrderId(String orderId) throws BusinessException, Exception;
	
	public Integer sendOrderToWevo() throws BusinessException, Exception;
}
