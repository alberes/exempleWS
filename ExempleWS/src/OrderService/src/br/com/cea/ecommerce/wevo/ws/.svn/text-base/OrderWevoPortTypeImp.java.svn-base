package br.com.cea.ecommerce.wevo.ws;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.order.wevo.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.order.wevo.v1.OrderWevoPortType;
import br.com.cea.ebs.cea.ecommerce.order.wevo.v1.QuantityUpdatedResponse;
import br.com.cea.ebs.cea.ecommerce.order.wevo.v1.TechnicalFaultMsg;
import br.com.cea.ecommerce.common.util.FaultUtil;
import br.com.cea.ecommerce.order.bo.OrderBO;
import br.com.cea.ecommerce.order.bo.OrderBOImp;

@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.order.wevo.v1.OrderWevoPortType")
public class OrderWevoPortTypeImp implements OrderWevoPortType{

	private Logger logger = LogManager.getLogger(getClass());

	@Override
	public QuantityUpdatedResponse sendOrderToWevo() throws BusinessFaultMsg, TechnicalFaultMsg{
		QuantityUpdatedResponse response = new QuantityUpdatedResponse();
		OrderBO orderBO = new OrderBOImp();
		try {
			response.setQuantity(orderBO.sendOrderToWevo());
		} catch (Exception e) {
			String errorMessage = "Error sending order to WEVO";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}
		return response;
	}
}
