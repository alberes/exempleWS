package br.com.cea.ecommerce.pl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.dao.AbstractJDBCDAO;
import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.dao.EcommerceConnectionFactory;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2LogVO;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2VO;

public class PLBase2DAOImp extends AbstractJDBCDAO implements PLBase2DAO{
	
	private Logger logger = LogManager.getLogger(getClass());
	
	private Connection conn;
	
	private static final String INSERT_MERGE_ITEM_BASE_2 = "INSERT INTO admec01.merge_item_base_2(id_base_2, id_pagamento, create_date, execution_date, status, desctiption_status, tp_reg, dt_mov_log,"
			+ " cd_fl, cd_log_pos, cd_vrs_pos, cd_rls_vrs, cd_mov_pos, ide_opera, pais, tip_transac, pln_credt, tip_doc, num_cartao, num_docum, vlr_pago, moeda,"
			+ " id_pedido, data_item, hora, cod_superv, flg_autoriz, cod_orpag, reas_code, resp_code, cod_autoriz, flg_offline, num_fone, loja, vl_pago_din, vl_pago_chq,"
			+ " vl_pago_tef, vl_pago_bns, vl_pago_uss, vl_pago_cqu, tp_operacao, num_ticket, leit_cart, num_operador, num_parc, reason_code, ret_code, desc_reson)"
			+ " VALUES(ADMEC01.sqn_merge_item_base_2_log.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String INSERT_MERGE_ITEM_BASE_2_LOG = "INSERT INTO admec01.merge_item_base_2_log(id_base_2, id_pagamento, create_date, id_pedido, xml) VALUES(ADMEC01.sqn_merge_item_base_2.nextval, ?, ?, ?, ?)";
	
	public PLBase2DAOImp(ConnectionFactory myFactory) throws DAOException, SQLException {
		super(EcommerceConnectionFactory.getInstance());
		conn = super.getConnection();
		conn.setAutoCommit(false);
	}

	@Override
	public MergeItemBase2LogVO saveMergeBase2Log(MergeItemBase2LogVO mergeItemBase2LogVO) throws DAOException{		
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(INSERT_MERGE_ITEM_BASE_2_LOG);
			
			ps.setString(1, mergeItemBase2LogVO.getIdPagamento());
			ps.setTimestamp(2, DateTimeUtil.convertDateToSQLDate(mergeItemBase2LogVO.getCreateDate()));
			ps.setString(3, mergeItemBase2LogVO.getIdPedido());
			ps.setString(4, mergeItemBase2LogVO.getXml());
			
			ps.executeUpdate();			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
		}
		return mergeItemBase2LogVO;
	}
	
	@Override
	public MergeItemBase2VO saveMergeItemBase2(MergeItemBase2VO mergeItemBase2VO) throws DAOException{
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(INSERT_MERGE_ITEM_BASE_2);
			
			ps.setString(1, mergeItemBase2VO.getIdPagamento());
			ps.setTimestamp(2, DateTimeUtil.convertDateToSQLDate(mergeItemBase2VO.getCreateDate()));
			ps.setTimestamp(3, DateTimeUtil.convertDateToSQLDate(mergeItemBase2VO.getExecutionDate()));
			ps.setInt(4, mergeItemBase2VO.getStatus());
			ps.setString(5, mergeItemBase2VO.getDesctiptionStatus());
			ps.setString(6, mergeItemBase2VO.getTpReg());
			ps.setString(7, mergeItemBase2VO.getDtMovLog());
			ps.setString(8, mergeItemBase2VO.getCdFl());
			ps.setString(9, mergeItemBase2VO.getCdLogPos());
			ps.setString(10, mergeItemBase2VO.getCdVrsPos());
			ps.setString(11, mergeItemBase2VO.getCdRlsVrs());
			ps.setString(12, mergeItemBase2VO.getCdMovPos());
			ps.setString(13, mergeItemBase2VO.getIdeOpera());
			ps.setString(14, mergeItemBase2VO.getPais());
			ps.setString(15, mergeItemBase2VO.getTipTransac());
			ps.setString(16, mergeItemBase2VO.getPlnCredt());
			ps.setString(17, mergeItemBase2VO.getTipDoc());
			ps.setString(18, mergeItemBase2VO.getNumCartao());
			ps.setString(19, mergeItemBase2VO.getNumDocum());
			ps.setString(20, mergeItemBase2VO.getVlrPago());
			ps.setString(21, mergeItemBase2VO.getMoeda());
			ps.setString(22, mergeItemBase2VO.getIdPedido());
			ps.setString(23, mergeItemBase2VO.getData());
			ps.setString(24, mergeItemBase2VO.getHora());
			ps.setString(25, mergeItemBase2VO.getCodSuperv());
			ps.setString(26, mergeItemBase2VO.getFlgAutoriz());
			ps.setString(27, mergeItemBase2VO.getCodOrpag());
			ps.setString(28, mergeItemBase2VO.getReasCode());
			ps.setString(29, mergeItemBase2VO.getRespCode());
			ps.setString(30, mergeItemBase2VO.getCodAutoriz());
			ps.setString(31, mergeItemBase2VO.getFlgOffline());
			ps.setString(32, mergeItemBase2VO.getNumFone());
			ps.setString(33, mergeItemBase2VO.getLoja());
			ps.setString(34, mergeItemBase2VO.getVlPagoDin());
			ps.setString(35, mergeItemBase2VO.getVlPagoChq());
			ps.setString(36, mergeItemBase2VO.getVlPagoTef());
			ps.setString(37, mergeItemBase2VO.getVlPagoBns());
			ps.setString(38, mergeItemBase2VO.getVlPagoUss());
			ps.setString(39, mergeItemBase2VO.getVlPagoCqu());
			ps.setString(40, mergeItemBase2VO.getTpOperacao());
			ps.setString(41, mergeItemBase2VO.getNumTicket());
			ps.setString(42, mergeItemBase2VO.getLeitCart());
			ps.setString(43, mergeItemBase2VO.getNumOperador());
			ps.setString(44, mergeItemBase2VO.getNumParc());
			ps.setString(45, mergeItemBase2VO.getReasonCode());
			ps.setString(46, mergeItemBase2VO.getRetCode());
			ps.setString(47, mergeItemBase2VO.getDescReason());
			
			ps.executeUpdate();			
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(ps);
		}
		return mergeItemBase2VO;
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