package br.com.cea.ecommerce.tracking.ws;

import br.com.cea.ebo.cea.ecommerce.tracking.v1.Tracking;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.tracking.vo.TrackingVO;

public class TrackingConverter {

	public static synchronized void copyFromTrackingToTrackingVO(Tracking tracking, TrackingVO trackingVO){
		trackingVO.setOrderId(tracking.getOrderId());
		trackingVO.setStatusDescription(tracking.getStatusDescription());
		trackingVO.setStatusDate(DateTimeUtil.convertGregorianToDate(tracking.getStatusDate()));
	}
	
}