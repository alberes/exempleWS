package br.com.cea.ecommerce.affiliated.bo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.cea.ecommerce.affiliated.dao.AffiliatedDAO;
import br.com.cea.ecommerce.affiliated.dao.AffiliatedDAOImp;
import br.com.cea.ecommerce.affiliated.vo.AffiliatedVO;
import br.com.cea.ecommerce.affiliated.vo.DependentVO;

public class AffiliatedBOImp implements AffiliatedBO {

	@Override
	public List<AffiliatedVO> getAffiliates(Date requestDate) throws Exception {
		AffiliatedDAO affiliatedDAO = new AffiliatedDAOImp(null);
		List<AffiliatedVO> affiliates = null;
		
		Date startDate = null;
		Date finishDate = null;
		Calendar calendar = Calendar.getInstance();
				
		Date now = new Date();
		
		if(now.before(requestDate)){
			throw new Exception("Nao e permitido data futuro.");
		}
		
		calendar.setTime(requestDate);
		calendar.add(Calendar.DAY_OF_MONTH, -90);
		startDate = calendar.getTime();
		
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -90);
		finishDate = calendar.getTime();
		
		affiliates = affiliatedDAO.getAffiliates(startDate, finishDate);
		affiliatedDAO.close();
		return affiliates;
	}

	@Override
	public List<DependentVO> getDependents(Date requestDate) throws Exception {
		AffiliatedDAO affiliatedDAO = new AffiliatedDAOImp(null);
		List<DependentVO> dependents = null;
		
		Date startDate = null;
		Date finishDate = null;
		Calendar calendar = Calendar.getInstance();
				
		Date now = new Date();
		
		if(now.before(requestDate)){
			throw new Exception("Nao e permitido data futuro.");
		}
		
		calendar.setTime(requestDate);
		calendar.add(Calendar.DAY_OF_MONTH, -90);
		startDate = calendar.getTime();
		
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, -90);
		finishDate = calendar.getTime();
		
		dependents = affiliatedDAO.getDependents(startDate, finishDate);
		affiliatedDAO.close();
		return dependents;
	}

}
