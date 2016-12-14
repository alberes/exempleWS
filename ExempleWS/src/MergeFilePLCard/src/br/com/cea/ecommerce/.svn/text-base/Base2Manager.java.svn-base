package br.com.cea.ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import br.com.cea.ecommerce.base2.file.CreateFileBase2;
import br.com.cea.ecommerce.base2.file.MergeFilePL;
import br.com.cea.ecommerce.util.LogUtil;

public class Base2Manager {
	
	private static Base2Manager instance;
	
	private boolean freeForExecution;
	
	private Base2Manager(){
		super();
		freeForExecution = true;
	}

	public static Base2Manager getInstance(){
		if(instance == null){
			synchronized(Base2Manager.class){
				if(instance == null){
					instance = new Base2Manager();
				}
			}
		}
		return instance;
	}
	
	public void execute(String path) throws Exception{
		if(freeForExecution){
			freeForExecution = false;
			Properties properties = new Properties();
			properties.load(new InputStreamReader(new FileInputStream(path + File.separator + "config" + File.separator + "config.properties"), "ISO-8859-1"));
			
			LogUtil logUtil = LogUtil.getInstance();
			logUtil.setProperties(properties);
			
			MergeFilePL mergeFilePL = new MergeFilePL(properties);
			mergeFilePL.setLogUtil(logUtil);
			
			CreateFileBase2 createFileBase2 = new CreateFileBase2(properties);
			createFileBase2.setLogUtil(logUtil);
			
			try {			
				createFileBase2.createFile();
				mergeFilePL.merge();
			} catch (Exception e) {			
				e.printStackTrace();
				logUtil.severe(e.getMessage());
				for(StackTraceElement st : e.getStackTrace()){
					logUtil.severe(st.toString());
				}
				mergeFilePL.saveLogException(e);
			}finally{
				logUtil.close();
				freeForExecution = true;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		Base2Manager.getInstance().execute(args[0]);
	}

}
