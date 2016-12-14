package br.com.cea.ecommerce.affiliated.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.affiliated.vo.AffiliatedVO;
import br.com.cea.ecommerce.affiliated.vo.DependentVO;

public interface AffiliatedDAO {
	
	public List<AffiliatedVO> getAffiliates(Date startDate, Date finishDate) throws DAOException, SQLException;
	
	public List<DependentVO> getDependents(Date startDate, Date finishDate) throws DAOException, SQLException;

	public void rollback() throws SQLException;
	
	public void commit() throws SQLException;
	
	public void close();
}
