package br.com.cea.ecommerce.tracking.ws;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.ecommerce.tracking.v1.Tracking;
import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.tracking.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.tracking.v1.TechnicalFaultMsg;
import br.com.cea.ebs.cea.ecommerce.tracking.v1.TrackingPortType;
import br.com.cea.ebs.cea.ecommerce.tracking.v1.TrackingRequest;
import br.com.cea.ebs.cea.ecommerce.tracking.v1.TrackingResponse;
import br.com.cea.ecommerce.common.util.FaultUtil;
import br.com.cea.ecommerce.tracking.bo.TrackingBO;
import br.com.cea.ecommerce.tracking.bo.TrackingBOImp;
import br.com.cea.ecommerce.tracking.vo.TrackingVO;

@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.tracking.v1.TrackingPortType")
public class TrackingPortTypeImp implements TrackingPortType {

	private Logger logger = LogManager.getLogger(getClass());
	
	@Override
	public TrackingResponse tracking(TrackingRequest parameters, MetaInfType header) throws BusinessFaultMsg, TechnicalFaultMsg {
		
		TrackingResponse response = new TrackingResponse();
		TrackingVO trackingVO = null;
		List<TrackingVO> trackings = new ArrayList<TrackingVO>();
		
		try{	
			
			for(Tracking tracking : parameters.getTrackingList().getTracking()){
				trackingVO = new TrackingVO();
				TrackingConverter.copyFromTrackingToTrackingVO(tracking, trackingVO);
				trackings.add(trackingVO);
			}
			
			if(trackings.isEmpty()){
				response.setAcknowledge(false);
			}else{
				TrackingBO trackingBO = new TrackingBOImp();
				trackingBO.createTracking(trackings);				
				response.setAcknowledge(true);
			}
			
		}catch (Exception e) {
			String errorMessage = "Error order";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}
		
		return response;
	}

}