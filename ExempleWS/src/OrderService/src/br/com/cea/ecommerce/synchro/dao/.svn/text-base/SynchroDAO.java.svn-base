package br.com.cea.ecommerce.synchro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.dao.AbstractJDBCDAO;
import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.invoice.vo.CourierVO;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;
import br.com.cea.ecommerce.invoice.vo.ItemVO;
import br.com.cea.ecommerce.order.bo.OrderBO;
import br.com.cea.ecommerce.order.bo.OrderBOImp;
import br.com.cea.ecommerce.order.vo.CustomerVO;

public class SynchroDAO extends AbstractJDBCDAO {
	
	private Logger logger = LogManager.getLogger(getClass());
	private Connection conn = null;
	
	private static final String SISTEMA_ORIGEM = "VTEX";
	private static final String LOCALIDADE_CODIGO = "001";
	private static final String EMITENTE_CODIGO = "C&A0606FX";
	private static final String SEPARADOR_NOTA = "_";
	
	private static final String SQL_INSERT_INVOICE = 
			"INSERT INTO usersyn.SYNITF_SNF ("
				+ "COD_REFERENCIA "
				+ ",SERIE_SUBSERIE "
				+ ",IND_ENTRADA_SAIDA "
				+ ",EDOF_CODIGO "
				+ ",NUM_PEDIDO "
				+ ",SIS_CODIGO "
				+ ",CTRL_CONTEUDO "
				+ ",CTRL_SITUACAO_DOF "
				+ ",NUM_ITENS_SNF "
				+ ",NUM_VOL_CARGA_SNF "
				+ ",NUM_DOC_ASSOC_SNF "
				+ ",DESTINATARIO_LOC_CODIGO "
				+ ",DESTINATARIO_PFJ_CODIGO "
				+ ",EMITENTE_LOC_CODIGO "
				+ ",EMITENTE_PFJ_CODIGO "
				+ ",REMETENTE_LOC_CODIGO "
				+ ",REMETENTE_PFJ_CODIGO "
				+ ",IND_RESP_FRETE "
				+ ",MODO_EMISSAO "
				+ ",TIPO "
				+ ",VL_FRETE "
				+ ",VL_OUTRAS_DESPESAS "
				+ ",IND_NFE_AJUSTE "
				+ ",CTRL_INSTRUCAO "
				+ ",SNF_PROCESSO_RETORNO "
				+ ",NUM_PLACA_VEICULO "
				+ ",TRANSPORTADOR_LOC_CODIGO "
				+ ",OBS_FISCAL_ICMS " 
				+ ",PESO_BRUTO_KG "
				+ ",PESO_LIQUIDO_KG "
				+ ",CPF "
				+ ",TRANSPORTADOR_PFJ_CODIGO "
			+ ") VALUES ("
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?"
			+ ")";

	private static final String SQL_INSERT_ITEM = 
			"INSERT INTO usersyn.SYNITF_SNF_IDF ( "
				+ "COD_REFERENCIA "
				+ ",IDF_NUM "
				+ ",ORD_IMPRESSAO "
				+ ",SUBCLASSE_IDF "
				+ ",MERC_CODIGO "
				+ ",EMITENTE_PFJ_CODIGO "
				+ ",FIN_CODIGO "
				+ ",IDF_TEXTO_COMPLEMENTAR "
				+ ",PRECO_TOTAL "
				+ ",PRECO_UNITARIO "
				+ ",QTD "
//				+ ",VL_AJUSTE_PRECO_TOTAL "
				+ ",CTRL_INSTRUCAO "
			+ ") VALUES ( "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? "
			+ ")";
	
	private static final String SQL_INSERT_VOLUME = 
			"INSERT INTO usersyn.SYNITF_SNF_VOLUME_CARGA ( "
				+ "COD_REFERENCIA "
				+ ",ESPECIE_VOLUMES "
				+ ",QTD_VOLUMES "
				+ ",EMITENTE_PFJ_CODIGO "
				+ ",CTRL_INSTRUCAO "
			+ ") VALUES ( "
				+ "?, ?, ?, ?, ? "
			+ ")";
	

	public SynchroDAO(ConnectionFactory myFactory) throws DAOException, SQLException {
		super(SynchroConnectionFactory.getInstance());
		conn = super.getConnection();
		conn.setAutoCommit(false);
	}
	
	private String buildCodReferencia(InvoiceVO vo){
		StringBuilder cod = new StringBuilder();
		cod.append(SISTEMA_ORIGEM);
		cod.append(vo.getId());
		cod.append(SEPARADOR_NOTA);
		cod.append(vo.getOrder().getId());
		return cod.toString();
	}
	
	private String buildTextoComplementar(ItemVO vo){
		StringBuilder textoComplementar = new StringBuilder();
		textoComplementar.append(vo.getSkuId());
		textoComplementar.append(SEPARADOR_NOTA);
		if(vo.getSerial() != null){
			textoComplementar.append(". #SN ");
			textoComplementar.append(vo.getSerial());
			textoComplementar.append("#");
			textoComplementar.append(SEPARADOR_NOTA);
		}
		textoComplementar.append(vo.getName());
		return textoComplementar.toString();
	}
	
	private String buildMercadoria(ItemVO vo){
		StringBuilder mercadoria = new StringBuilder();
		mercadoria.append(vo.getItemFNE());
		mercadoria.append(vo.getItemClass());
		mercadoria.append(vo.getItemCode());
		return  mercadoria.toString();
	}
	
	public void insertInvoice(InvoiceVO vo) throws DAOException, SQLException{
		String codReferencia = buildCodReferencia(vo);
		insertInvoiceEntity(vo, codReferencia);
		int index = 1;
		for(ItemVO itemVO : vo.getOrder().getItems()){
			insertITem(itemVO, codReferencia, index++);
		}
		insertVolume(vo.getCourier(), codReferencia);
	}
	
	private void insertInvoiceEntity(InvoiceVO vo, String codReferencia) throws DAOException{
		PreparedStatement ps = null;
		OrderBO orderBO = new OrderBOImp();
		try {
			
			CustomerVO customerOrder = orderBO.getCustomerByOrderId(vo.getOrder().getId());
			
			ps = conn.prepareStatement(SQL_INSERT_INVOICE);
			int i = 1;
			
			String transportadora = ("0000000000" + vo.getCourier().getId())
					.substring(vo.getCourier().getId().length()) + "F";
			
			ps.setString(i++, codReferencia); //COD_REFERENCIA
			if(vo.getCheckout() == null || vo.getCheckout() == 0){
				vo.setCheckout(vo.getCheckout());
			}
			ps.setString(i++, "1"); //SERIE_SUBSERIE
			ps.setString(i++, "S"); //IND_ENTRADA_SAIDA
			ps.setString(i++, "NFE"); //EDOF_CODIGO
			ps.setString(i++, vo.getOrder().getId()); //NUM_PEDIDO
			ps.setString(i++, SISTEMA_ORIGEM); //SIS_CODIGO
			ps.setString(i++, "C"); //CTRL_CONTEUDO
			ps.setString(i++, "N"); //CTRL_SITUACAO_DOF
			ps.setInt(i++, vo.getOrder().getItems().size()); //NUM_ITENS_SNF
			ps.setInt(i++, 1); //NUM_VOL_CARGA_SNF
			ps.setInt(i++, 0); //NUM_DOC_ASSOC_SNF
			ps.setString(i++, LOCALIDADE_CODIGO); //DESTINATARIO_LOC_CODIGO
			ps.setString(i++, customerOrder.getSynchroId()); //DESTINATARIO_PFJ_CODIGO
			ps.setString(i++, LOCALIDADE_CODIGO); //EMITENTE_LOC_CODIGO
			ps.setString(i++, EMITENTE_CODIGO); //EMITENTE_PFJ_CODIGO
			ps.setString(i++, LOCALIDADE_CODIGO); //REMETENTE_LOC_CODIGO 
			ps.setString(i++, EMITENTE_CODIGO); //REMETENTE_PFJ_CODIGO 
			ps.setString(i++, "1"); //IND_RESP_FRETE 
			ps.setString(i++, "L"); //MODO_EMISSAO
			ps.setString(i++, "N"); //TIPO
			if(vo.getTotals().getShipping() != null){
				ps.setDouble(i++, vo.getTotals().getShipping()); //VL_FRETE
			} else {
				ps.setDouble(i++, 0); //VL_FRETE				
			}
			ps.setDouble(i++, 0); //VL_OUTRAS_DESPESAS
			ps.setString(i++, "N"); //IND_NFE_AJUSTE
			ps.setString(i++, "M"); //CTRL_INSTRUCAO
			ps.setString(i++, "CA2_RETORNO_ECOM_SNF"); //SNF_PROCESSO_RETORNO
			ps.setString(i++, vo.getCourier().getPlaque()); //NUM_PLACA_VEICULO
			ps.setString(i++, "001"); //TRANSPORTADOR_LOC_CODIGO
			ps.setString(i++, "Pedido:" + vo.getOrder().getId()); //OBS_FISCAL_ICMS
			if(vo.getCourier().getGrossWeight() != null){
				ps.setDouble(i++, vo.getCourier().getGrossWeight()); //PESO_BRUTO_KG
			} else {
				ps.setDouble(i++, 0); //PESO_BRUTO_KG
			}
			if(vo.getCourier().getNetWeight() != null){
				ps.setDouble(i++, vo.getCourier().getNetWeight()); //SNF_PROCESSO_RETORNO
			} else {
				ps.setDouble(i++, 0); //SNF_PROCESSO_RETORNO
			}
			ps.setString(i++, vo.getCustomer().getDocument()); //CPF
			ps.setString(i++, transportadora); //TRANSPORTADOR_PFJ_CODIGO
			
			ps.executeUpdate();			 
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(null, ps);
		}
	}

	private void insertITem(ItemVO vo, String codReferencia, int index) throws DAOException{
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(SQL_INSERT_ITEM);
			int i = 1;
			
			ps.setString(i++, codReferencia); //COD_REFERENCIA
			if(vo.getSequence() != null){
				ps.setDouble(i++, vo.getSequence()); //IDF_NUM
				ps.setDouble(i++, vo.getSequence()); //ORD_IMPRESSAO
			} else {
				ps.setDouble(i++, 0); //IDF_NUM
				ps.setDouble(i++, 0); //ORD_IMPRESSAO
			}
			ps.setString(i++, "M"); //SUBCLASSE_IDF
			ps.setString(i++, buildMercadoria(vo)); //MERC_CODIGO
			ps.setString(i++, EMITENTE_CODIGO); //EMITENTE_PFJ_CODIGO
			ps.setString(i++, "COM"); //FIN_CODIGO
			ps.setString(i++, buildTextoComplementar(vo)); //IDF_TEXTO_COMPLEMENTAR
			if(vo.getSellingPrice() == null){
				vo.setSellingPrice(0d);
			}
			if(vo.getQuantity() == null){
				vo.setQuantity(0);
			}
			ps.setDouble(i++, vo.getSellingPrice() * vo.getQuantity()); //PRECO_TOTAL
			ps.setDouble(i++, vo.getSellingPrice()); //PRECO_UNITARIO
			ps.setDouble(i++, vo.getQuantity()); //QTD
			if(vo.getDiscounts() == null){
				vo.setDiscounts(0d);
			}
//			ps.setDouble(i++, vo.getDiscounts()); //VL_AJUSTE_PRECO_TOTAL
			ps.setString(i++, "M"); //CTRL_INSTRUCAO

			ps.executeUpdate();			 
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(null, ps);
		}
	}
	
	private void insertVolume(CourierVO vo, String codReferencia) throws DAOException{
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(SQL_INSERT_VOLUME);
			int i = 1;

			ps.setString(i++, codReferencia); //COD_REFERENCIA
			ps.setString(i++, vo.getCargoType()); //ESPECIE_VOLUMES
			ps.setDouble(i++, vo.getVolumeNumber()); //QTD_VOLUMES
			ps.setString(i++, EMITENTE_CODIGO); //EMITENTE_PFJ_CODIGO
			ps.setString(i++, "M"); //CTRL_INSTRUCAO
			
			ps.executeUpdate();			 
		} catch (Exception e) {
			logger.error(e);
			throw new DAOException(e);
		} finally {
			super.close(null, ps);
		}
	}
	
	public void rollback() throws SQLException{
		conn.rollback();
	}
	
	public void commit() throws SQLException{
		conn.commit();
	}
	
	public void close(){
		super.close(conn);
	}

}
