package br.com.cea.ecommerce.tracking.bo;

import java.util.List;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.ecommerce.tracking.vo.TrackingVO;

public interface TrackingBO {

	public List<TrackingVO> createTracking(List<TrackingVO> list) throws BusinessException, Exception;
	
}