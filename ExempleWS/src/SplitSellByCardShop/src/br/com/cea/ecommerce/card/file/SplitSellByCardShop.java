package br.com.cea.ecommerce.card.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import br.com.cea.ecommerce.util.LogUtil;

public class SplitSellByCardShop {
	
	private Properties properties = null;
		
	private LogUtil logUtil = null;
	
	private String prefixFileName = null;
	
	public SplitSellByCardShop(Properties properties, String prefixFileName) throws Exception{
		this.properties = properties;
		this.prefixFileName = prefixFileName;
	}
	
	public void split() throws Exception{
		List filesName = getFile(properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.store.dir"), properties.getProperty("extension.file.name.store"));
		File fileStore = null;
				
		if(filesName.size() == 0){
			throw new Exception("Arquivo(s) das lojas nao encontrado.");
		}
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String prefix = df.format(now).replaceAll("[^0-9]", "_") + "_";
		
		logUtil.info("Processado iniciado em " + df.format(now));
		logUtil.info("Encontrado(s) " + filesName.size() + " arquivo(s).");
		
		for(int index = 0; index < filesName.size(); index++){
			
			fileStore = new File(filesName.get(index).toString());
			
			if(fileStore.isFile()){
				
				logUtil.info("Iniciando o processo do arquivo " + fileStore.getName());
				
				BufferedReader bfStore = new BufferedReader(new FileReader(fileStore));
				
				File fileOutStore = new File(properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.out.dir") + properties.getProperty("file.separator")
						+ fileStore.getName());
				
				File fileOutEcommerce = new File(properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.ecommerce.dir") + properties.getProperty("file.separator")
						+ prefix + "_" + fileStore.getName());
				
				fileOutEcommerce.createNewFile();
				
				BufferedWriter bwStore = new BufferedWriter(new FileWriter(fileOutStore));
				BufferedWriter bwEcommerce = new BufferedWriter(new FileWriter(fileOutEcommerce));
				
				String line = null;
				long quantityLines = 0;
				long quantityStore = 0;
				long quantityEcommerce = 0;
				String storeCode = properties.getProperty("store.code");
				
				logUtil.info("Remover a transacao da loja " + storeCode);
				
				while((line = bfStore.readLine()) != null){
					quantityLines++;
					if(line.length() > 13){
						if(storeCode.equals(line.substring(4, 12))){
							//Copy body of Ecommerce's file
							bwEcommerce.write(line);
							bwEcommerce.newLine();
							quantityEcommerce++;
						}else{
							//Copy body of Store's file
							bwStore.write(line);
							bwStore.newLine();
							quantityStore++;
						}
					}else{
						//Copy head and tail of Store file
						bwStore.write(line);
						bwStore.newLine();
						quantityStore++;
					}
				}
				
				logUtil.info("Quantidade de linhas encontradas " + quantityLines + " no arquivo " + fileStore.getName());
				logUtil.info("Quantidade de linhas mantidas " + quantityStore + " no arquivo " + fileStore.getName());
				logUtil.info("Quantidade de linhas removidas " + quantityEcommerce + " no arquivo " + fileOutEcommerce.getName());				
				
				bwStore.close();
				bwEcommerce.close();
				bfStore.close();
				
				logUtil.info("Separado os dados do arquivo " + fileStore.getName());
								
				transferFile(fileStore, properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.copy.dir"), prefix, true);
			}
		}
		
		logUtil.close();
		logUtil.info("Processado finalizado em " + df.format(new Date()));
	}
		
	private void transferFile(File from, String to, String prefix, boolean removeFile) throws Exception{
		File fileCopy = new File(to + properties.getProperty("file.separator") + prefix + from.getName());
		InputStream inStream = new FileInputStream(from);
		OutputStream outStream = new FileOutputStream(fileCopy);
 
		byte[] buffer = new byte[1024];
 
		int length;

		while ((length = inStream.read(buffer)) > 0){ 
			outStream.write(buffer, 0, length); 
		}
 
		inStream.close();
		outStream.close();
		
		if(removeFile){
			from.delete();
		}
		
		logUtil.info("Arquivo tranferido de: " + from.getAbsoluteFile());
		logUtil.info("Arquivo tranferido para: " + fileCopy.getAbsoluteFile());		
	}
	
	public void saveLogException(Exception e){
		Logger logger = Logger.getLogger(this.getClass().getName());
		FileHandler fh;
		try {
			fh = new FileHandler(properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.log.dir") + properties.getProperty("file.separator")
					 + properties.getProperty("file.log.exception.dir") + properties.getProperty("file.separator") + this.properties.getProperty("log.exception.name"));
			fh.setFormatter(new XMLFormatter());
			logger.addHandler(fh);
			logger.severe(e.getMessage());
			for(int index = 0; index < e.getStackTrace().length; index++){
				logUtil.severe(e.getStackTrace()[index].toString());
			}			
			fh.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public List getFile(String pathDir, String extension){
		File list = new File(pathDir);
		List files = new ArrayList();

		for(int index = 0; index < list.list().length; index++){
			String s = list.list()[index];
			if(s.toLowerCase().startsWith(prefixFileName.toLowerCase()) &&
					s.toLowerCase().endsWith(extension.toLowerCase())){
				files.add(pathDir + properties.getProperty("file.separator") + s);
			}
		}
		return files;
	}

	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}
	
}