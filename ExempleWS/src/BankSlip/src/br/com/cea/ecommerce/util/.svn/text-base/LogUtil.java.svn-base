package br.com.cea.ecommerce.util;

import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LogUtil {
	
	private static Logger LOGGER = null;
	
	private FileHandler FH = null;
	
	private Properties properties = null;
	
	private static LogUtil instance = null;
	
	private LogUtil(){		
	}
	
	public void info(String message){
		LOGGER.info(message);
	}

	public void severe(String message){
		LOGGER.severe(message);
	}
	
	public void close(){
		FH.close();
	}

	public void setProperties(Properties properties) throws Exception {
		this.properties = properties;
		LOGGER = Logger.getLogger(this.getClass().getName());
		FH = new FileHandler(properties.getProperty("file.base.dir") + properties.getProperty("file.separator")
				 + properties.getProperty("file.log.dir") + properties.getProperty("file.separator") + this.properties.getProperty("log.name"));
		FH.setFormatter(new XMLFormatter());
		LOGGER.addHandler(FH);
	}
	
	public static LogUtil getInstance(){
		if(LogUtil.instance == null){
			synchronized (LogUtil.class) {
				if(LogUtil.instance == null){
					instance = new LogUtil();
				}
			}
		}
		return instance;
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
}
