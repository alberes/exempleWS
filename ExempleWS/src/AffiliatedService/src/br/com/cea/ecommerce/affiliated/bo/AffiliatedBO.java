package br.com.cea.ecommerce.affiliated.bo;

import java.util.Date;
import java.util.List;

import br.com.cea.ecommerce.affiliated.vo.AffiliatedVO;
import br.com.cea.ecommerce.affiliated.vo.DependentVO;

public interface AffiliatedBO {

	public List<AffiliatedVO> getAffiliates(Date requestDate) throws Exception;
	
	public List<DependentVO> getDependents(Date requestDate) throws Exception;
	
}
