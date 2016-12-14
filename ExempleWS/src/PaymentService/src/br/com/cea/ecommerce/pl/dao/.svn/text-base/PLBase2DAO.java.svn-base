package br.com.cea.ecommerce.pl.dao;

import java.sql.SQLException;

import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2LogVO;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2VO;

public interface PLBase2DAO {
	
	public MergeItemBase2VO saveMergeItemBase2(MergeItemBase2VO mergeItemBase2VO) throws DAOException;
	
	public MergeItemBase2LogVO saveMergeBase2Log(MergeItemBase2LogVO mergeItemBase2LogVO) throws DAOException;
	
	public void rollback() throws SQLException;
	
	public void commit() throws SQLException;
	
	public void close();

}
