package br.com.cea.ecommerce.order.ws;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.order.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.order.v1.OrderPortType;
import br.com.cea.ebs.cea.ecommerce.order.v1.OrderRequest;
import br.com.cea.ebs.cea.ecommerce.order.v1.OrderResponse;
import br.com.cea.ebs.cea.ecommerce.order.v1.TechnicalFaultMsg;
import br.com.cea.ecommerce.common.util.FaultUtil;
import br.com.cea.ecommerce.order.bo.OrderBO;
import br.com.cea.ecommerce.order.bo.OrderBOImp;
import br.com.cea.ecommerce.order.vo.OrderVO;

@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.order.v1.OrderPortType")
public class OrderPortTypeImp implements OrderPortType {

	private Logger logger = LogManager.getLogger(getClass());
	
	@Override
	public OrderResponse order(OrderRequest parameters, MetaInfType meta) throws BusinessFaultMsg, TechnicalFaultMsg {
		OrderResponse response = new OrderResponse();
		
		try{
			OrderVO orderVO = new OrderVO();
			OrderConverter.copyFromOrderToOrderVO(parameters.getOrder(), orderVO);
			OrderBO orderBO = new OrderBOImp();
			orderBO.createOrder(orderVO);
			response.setAcknowledge(true);
		}catch (Exception e) {
			String errorMessage = "Error order";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}
		
		return response;
	}
	
}
