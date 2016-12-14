package br.com.cea.ecommerce.base2.file;

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
import java.util.Date;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import br.com.cea.commons.util.StringUtil;
import br.com.cea.ecommerce.util.LogUtil;

public class MergeFilePL {
	
	private Properties properties = null;
	
	private File fileStore = null;
	
	private File fileEcommerce = null;
	
	private LogUtil logUtil = null;
	
	public MergeFilePL(Properties properties) throws Exception{
		this.properties = properties;		
	}
	
	public void merge() throws Exception{		
		fileStore = getFile(properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.store.dir"), properties.getProperty("extension.file.name.store"));
		fileEcommerce = getFile(properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.ecommerce.dir"), properties.getProperty("extension.file.name.ecommerce"));
		
		if(fileStore == null || !fileStore.isFile()){
			throw new Exception("Arquivo da loja nao encontrado.");
		}
		if(fileEcommerce == null || !fileEcommerce.isFile()){
			throw new Exception("Arquivo do ecommerce nao encontrado.");
		}
		
		logUtil.info("Processo de merge iniciado dos arquivos " + fileStore.getName() + " e " + fileEcommerce.getName());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String prefix = df.format(new Date()).replaceAll("[^0-9]", "_") + "_";
		
		BufferedReader bfStore = new BufferedReader(new FileReader(fileStore));
		BufferedReader bfEcommerce = new BufferedReader(new FileReader(fileEcommerce));
		
		File fileOut = new File(properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.out.dir") + properties.getProperty("file.separator")
				+ fileStore.getName());
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
		
		String line = null;
		String tail = "";
		long index = 0;
		long quantity = quantityLine(fileStore);
		
		while((line = bfStore.readLine()) != null){
			index++;
			if(index < (quantity)){
				bw.write(line.substring(0, 2) + StringUtil.lpad(""+index, '0', 9) + line.substring(11, line.length()));
				bw.newLine();
			}else{
				tail = line;
				break;
			}
		}
		
		logUtil.info("Copiado os dados do arquivo " + fileStore.getName());
		
		while((line = bfEcommerce.readLine()) != null){
			bw.write(line.substring(0, 2) + StringUtil.lpad(""+index, '0', 9) + line.substring(11, line.length()));
			bw.newLine();
			index++;
		}
		
		logUtil.info("Copiado os dados do arquivo " + fileEcommerce.getName());
		
		String typeRecord = tail.substring(0, 2);
		String quantityRecord = String.format("%09d", index);
		
		bw.write(typeRecord + quantityRecord + quantityRecord);
		bw.newLine();
		
		logUtil.info("Adicionado o rodape com a quantidade de registros " + fileOut.getName() + " Quantidade: " + quantityRecord);
		
		bfStore.close();
		bfEcommerce.close();
		bw.close();
		
		transferFile(fileStore, properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.copy.dir"), prefix);
		transferFile(fileEcommerce, properties.getProperty("file.base.dir") + properties.getProperty("file.separator") + properties.getProperty("file.copy.dir"), prefix);
		logUtil.info("Processo de merge finalizado dos arquivos " + fileStore.getName() + " e " + fileEcommerce.getName() + " com sucesso.");
		logUtil.close();
	}
	
	private static long quantityLine(File f1) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(f1));
		long quantity = 0;
		while(br.readLine() != null){
			quantity++;
		}
		br.close();
		return quantity;
	}
	
	private void transferFile(File from, String to, String prefix) throws Exception{
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
		
		from.delete();
		
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
			for(StackTraceElement st : e.getStackTrace()){
				logger.severe(st.toString());
			}
			fh.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public File getFile(String pathDir, String extension){
		File list = new File(pathDir);
		File file = null;

		for(String s: list.list()){
			if(s.toLowerCase().endsWith(extension.toLowerCase())){
				file = new File(pathDir + properties.getProperty("file.separator") + s);
				break;
			}
		}
		return file;
	}

	public void setLogUtil(LogUtil logUtil) {
		this.logUtil = logUtil;
	}
	
}