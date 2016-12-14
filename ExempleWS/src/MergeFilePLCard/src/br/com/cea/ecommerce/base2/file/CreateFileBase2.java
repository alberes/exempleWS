package br.com.cea.ecommerce.base2.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;

import br.com.cea.commons.util.StringUtil;
import br.com.cea.ecommerce.util.LogUtil;

public class CreateFileBase2 {
	
	private Properties properties = null;
	
	private BufferedWriter fileEcommerce = null;
	
	private LogUtil logUtil = null;
	
	public static final int STATUS_START = 1;
	
	public static final int STATUS_EXECUTION = 2;
	
	public static final int STATUS_FINISH = 3;
	
	private final static String QUERY_BASE_2_STATUS = "SELECT i.id_pagamento, i.create_date, i.execution_date, i.status, i.desctiption_status, i.tp_reg, LPAD(rownum, 9, '0') nu_seq_reg,"
			+ " i.dt_mov_log, i.cd_fl, i.cd_log_pos, i.cd_vrs_pos, i.cd_rls_vrs, i.cd_mov_pos, LPAD(rownum, 9, '0') nu_seq_fl, i.ide_opera, i.pais, i.tip_transac, i.pln_credt,"
			+ " i.tip_doc, i.num_cartao, i.num_docum, i.vlr_pago, i.moeda, i.id_pedido, i.data_item, i.hora, i.cod_superv, i.flg_autoriz, i.cod_orpag,"
			+ " i.reas_code, i.resp_code, i.cod_autoriz, i.flg_offline, i.num_fone, i.loja, i.vl_pago_din, i.vl_pago_chq, i.vl_pago_tef, i.vl_pago_bns,"
			+ " i.vl_pago_uss, i.vl_pago_cqu, i.tp_operacao, i.num_ticket, i.leit_cart, i.num_operador, i.num_parc"
			+ " FROM merge_item_base_2 i"
			+ " WHERE status = ?";
	
	private final static String UPDATE_BASE_2_STATUS = "UPDATE merge_item_base_2 SET execution_date = ?, status = ?, desctiption_status = ? WHERE status = ?";
	
	public CreateFileBase2(Properties properties) throws Exception{
		this.properties = properties;
		fileEcommerce = new BufferedWriter(new FileWriter(properties.getProperty("file.base.dir") + properties.getProperty("file.separator")
				+ properties.getProperty("file.ecommerce.dir") + properties.getProperty("file.separator") + properties.getProperty("file.ecommerce.name")
				+ "."+ properties.getProperty("extension.file.name.ecommerce")));
	}
	
	public void createFile() throws Exception{
		logUtil.info("Processo de merge iniciado dos arquivos " + properties.getProperty("file.ecommerce.name"));
		
		Connection conn = getLocalConnection();
		conn.setAutoCommit(false);
		
		PreparedStatement ps = null;
		PreparedStatement psUpdate = null;
		ResultSet rs = null;
		StringBuilder line = null;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String startDate = df.format(new java.util.Date());
		long quantity = 0;
		try {
			psUpdate = conn.prepareStatement(UPDATE_BASE_2_STATUS);
			
			psUpdate.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
			psUpdate.setInt(2, STATUS_EXECUTION);
			psUpdate.setString(3, "Operacao em execucao. Data e hora de inicio: " + startDate);
			psUpdate.setLong(4, STATUS_START);
			int quantityUpdated = psUpdate.executeUpdate();
			conn.commit();
			
			ps = conn.prepareStatement(QUERY_BASE_2_STATUS);
			ps.setInt(1, STATUS_EXECUTION);
			rs = ps.executeQuery();
			
			while(rs.next()){
				line = new StringBuilder();
				String field = null;
				for(int index = 6; index < 47; index++){
					field = rs.getString(index);					
					line.append(StringUtil.lpad(field.trim(), '0', field.length()));
				}
				fileEcommerce.write(line.toString());
				fileEcommerce.newLine();
				quantity++;
			}
			
			logUtil.info("Quantidade de registros encontrados na base: " + quantity + ". Quantidade de linhar geradas no arquivos: " + quantity);			
			logUtil.info("Foram gravados " + quantity + " no arquivo " + properties.getProperty("file.ecommerce.name"));			
			
			psUpdate.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
			psUpdate.setInt(2, STATUS_FINISH);
			psUpdate.setString(3, "Operacao concluida com sucesso. Foram gerados " + quantity + " registros. Data e hora de inicio e fim: " + startDate + " - " + df.format(new java.util.Date()));
			psUpdate.setLong(4, STATUS_EXECUTION);
			quantityUpdated = psUpdate.executeUpdate();
			conn.commit();
			
			logUtil.info("Foram atualizados " + quantityUpdated + " na base ");			
		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
		} finally {
			fileEcommerce.close();
			rs.close();
			ps.close();
			psUpdate.close();
			conn.close();
		}
	}
	
	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}

	public Connection getLocalConnection() throws Exception {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@" + this.properties.getProperty("database.host") + ":" + this.properties.getProperty("database.port")
    			+ ":" + this.properties.getProperty("database.sid"), this.properties.getProperty("database.user"), this.properties.getProperty("database.password"));
    	return conn;
    }

}
