package br.com.cea.ecommerce.tracking.bo;

import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.invoice.bo.InvoiceBOImp;
import br.com.cea.ecommerce.tracking.dao.TrackingDAOImp;
import br.com.cea.ecommerce.tracking.vo.TrackingVO;

public class TrackingBOImp implements TrackingBO {

	private Logger logger = LogManager.getLogger(getClass());
	
	@Override
	public List<TrackingVO> createTracking(List<TrackingVO> list) throws BusinessException, Exception {
		TrackingDAOImp trackingDAO = new TrackingDAOImp(null);
		InvoiceBOImp invoiceBO = new InvoiceBOImp();
		Long statusId = null;
		try{
			Date now = new Date();
			for(TrackingVO trackingVO : list){
				statusId = trackingDAO.getStatusId(trackingVO.getStatusDescription().trim());
				if(statusId == null){
					statusId = trackingDAO.saveTrackingStatus(trackingVO.getStatusDescription().trim());
				}
				trackingVO.setStoreOrderId(invoiceBO.getStoreOrderIdByOrderId(trackingVO.getOrderId()));
				trackingVO.setStatusId(statusId);
				trackingVO.setCreateDate(now);
				trackingDAO.saveTracking(trackingVO);
			}
			trackingDAO.commit();
		}catch(DAOException e){
			logger.error("Falha no acesso ao banco de dados", e);
			trackingDAO.rollback();
			throw new Exception(e);
		}finally{
			trackingDAO.close();
		}
		return list;
	}
	
}