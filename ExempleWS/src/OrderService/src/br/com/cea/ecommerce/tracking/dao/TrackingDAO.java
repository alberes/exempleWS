package br.com.cea.ecommerce.tracking.dao;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.tracking.vo.TrackingVO;

public interface TrackingDAO {
	
	public TrackingVO saveTracking(TrackingVO tracking) throws DAOException;

	public Long saveTrackingStatus(String statusDescription) throws DAOException;
	
	public Long getStatusId(String description) throws BusinessException, Exception;

}