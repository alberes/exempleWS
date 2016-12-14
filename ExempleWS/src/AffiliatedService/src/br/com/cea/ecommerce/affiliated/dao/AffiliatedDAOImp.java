package br.com.cea.ecommerce.affiliated.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.dao.AbstractJDBCDAO;
import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.affiliated.vo.AffiliatedVO;
import br.com.cea.ecommerce.affiliated.vo.DependentVO;
import br.com.cea.ecommerce.common.dao.RHConnectionFactory;
import br.com.cea.ecommerce.common.util.DateTimeUtil;

public class AffiliatedDAOImp extends AbstractJDBCDAO implements AffiliatedDAO {

	private Logger logger = LogManager.getLogger(getClass());
	
	private Connection conn;
	
	private static String QUERY_AFFILIATES_BY_DATES = "SELECT id_pessoa, cod_empresa, nome, cpf, cod_centro_custo, cod_cargo, cargo, chapa, sexo,"
			+ " cod_loc_trabalho, local_de_trabalho, dt_admissao, dt_demissao, dt_ultima_acao, cd_sx, nr_mnq, nr_cal, situacao FROM rh102v_pessoal_padrao"
			+ " WHERE ((dt_admissao BETWEEN ? AND ?) OR (dt_demissao BETWEEN ? AND ?) OR (cod_centro_custo IN('11931100', '80920101', '80930101') AND dt_admissao >= ?)) AND LTRIM(RTRIM(cod_empresa)) = ?"
			+ " ORDER BY dt_demissao ASC, dt_admissao ASC";
	
	private static String QUERY_AFFILIATES_DEPENDENT_BY_DATES = "SELECT id_pessoa, cod_empresa, chapa, dt_admissao, dt_demissao, nome_dependente, cpf_dependente,"
			+ " nu_dependente, dt_ultima_acao, situacao, situacao_dep FROM rh107v_dependentes_padrao"
			+ " WHERE ((dt_admissao BETWEEN ? AND ?) OR (dt_demissao BETWEEN ? AND ?)) AND LTRIM(RTRIM(cod_empresa)) = ?"
			+ " AND cpf_dependente IS NOT NULL AND LTRIM(RTRIM(cpf_dependente)) NOT IN('', '00000000000')";
	
	public AffiliatedDAOImp(ConnectionFactory myFactory) throws DAOException, SQLException {
		super(RHConnectionFactory.getInstance());
		conn = super.getConnection();
		conn.setAutoCommit(false);
	}
	
	@Override
	public List<AffiliatedVO> getAffiliates(Date startDate, Date finishDate)
			throws DAOException, SQLException {
		List<AffiliatedVO> affiliates = new ArrayList<AffiliatedVO>();
		AffiliatedVO affiliatedVO = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try {
			Date now = new Date();
			ps = conn.prepareStatement(QUERY_AFFILIATES_BY_DATES);
			ps.setTimestamp(1, DateTimeUtil.convertDateToSQLDate(startDate));
			ps.setTimestamp(2, DateTimeUtil.convertDateToSQLDate(finishDate));
			ps.setTimestamp(3, DateTimeUtil.convertDateToSQLDate(startDate));
			ps.setTimestamp(4, DateTimeUtil.convertDateToSQLDate(now));
			ps.setTimestamp(5, DateTimeUtil.convertDateToSQLDate(startDate));
			ps.setString(6, "CEA");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				affiliatedVO = new AffiliatedVO();
				affiliatedVO.setIdPessoa(rs.getLong("id_pessoa"));				
				affiliatedVO.setCodEmpresa(rs.getString("cod_empresa"));
				affiliatedVO.setNome(rs.getString("nome"));
				affiliatedVO.setCpf(rs.getString("cpf"));
				affiliatedVO.setCodCentroCusto(rs.getString("cod_centro_custo"));
				affiliatedVO.setCodCargo(rs.getString("cod_cargo"));				
				affiliatedVO.setCargo(rs.getString("cargo"));
				affiliatedVO.setChapa(rs.getLong("chapa"));
				affiliatedVO.setSexo(rs.getString("sexo"));
				affiliatedVO.setCodLocTrabalho(rs.getString("cod_loc_trabalho"));				
				affiliatedVO.setLocalTrabalho(rs.getString("local_de_trabalho"));				
				affiliatedVO.setDataAdmissao(rs.getDate("dt_admissao"));				
				affiliatedVO.setDataDemissao(rs.getDate("dt_demissao"));				
				affiliatedVO.setDataUltimaAcao(rs.getDate("dt_ultima_acao"));				
				affiliatedVO.setCdSexo(rs.getString("cd_sx"));				
				affiliatedVO.setManiquim(rs.getLong("nr_mnq"));				
				affiliatedVO.setNumeroCalcado(rs.getLong("nr_cal"));				
				affiliatedVO.setSituacao(rs.getString("situacao"));
				affiliates.add(affiliatedVO);
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return affiliates;
	}
	
	@Override
	public List<DependentVO> getDependents(Date startDate, Date finishDate) throws DAOException, SQLException {
		List<DependentVO> dependents = new ArrayList<DependentVO>();
		DependentVO dependentVO = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try {
			Date now = new Date();
			ps = conn.prepareStatement(QUERY_AFFILIATES_DEPENDENT_BY_DATES);
			ps.setTimestamp(1, DateTimeUtil.convertDateToSQLDate(startDate));
			ps.setTimestamp(2, DateTimeUtil.convertDateToSQLDate(finishDate));
			ps.setTimestamp(3, DateTimeUtil.convertDateToSQLDate(startDate));
			ps.setTimestamp(4, DateTimeUtil.convertDateToSQLDate(now));
			ps.setString(5, "CEA");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				dependentVO = new DependentVO();
				dependentVO.setIdPessoa(rs.getLong("id_pessoa"));				
				dependentVO.setCodEmpresa(rs.getString("cod_empresa"));				
				dependentVO.setChapa(rs.getLong("chapa"));
				dependentVO.setDataAdmissao(rs.getDate("dt_admissao"));				
				dependentVO.setDataDemissao(rs.getDate("dt_demissao"));				
				dependentVO.setNome(rs.getString("nome_dependente"));				
				dependentVO.setCpf(rs.getString("cpf_dependente"));				
				dependentVO.setQuantidadeDependente(rs.getLong("nu_dependente"));				
				dependentVO.setDataUltimaAcao(rs.getDate("dt_ultima_acao"));				
				dependentVO.setSituacao(rs.getString("situacao"));				
				dependentVO.setSituacaoDependente(rs.getString("situacao_dep"));
				dependents.add(dependentVO);
			}
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps, rs);
		}
		return dependents;
	}

	@Override
	public void rollback() throws SQLException{
		conn.rollback();
	}
	
	@Override
	public void commit() throws SQLException{
		conn.commit();
	}
	
	@Override
	public void close(){
		super.close(conn);
	}

}
