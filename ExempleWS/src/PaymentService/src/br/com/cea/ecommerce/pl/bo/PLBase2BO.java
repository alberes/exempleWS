package br.com.cea.ecommerce.pl.bo;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2LogVO;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2VO;

public interface PLBase2BO {
		
	public MergeItemBase2VO createItemBase2(MergeItemBase2VO mergeItemBase2VO) throws BusinessException, Exception;
	
	public MergeItemBase2LogVO createBase2Log(MergeItemBase2LogVO mergeItemBase2LogVO) throws BusinessException, Exception;

}
