package br.com.cea.ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import br.com.cea.ecommerce.command.AbstractCommand;
import br.com.cea.ecommerce.factory.FactoryCommand;
import br.com.cea.ecommerce.util.LogUtil;


public class ExecutorManager {
	
	public static void main(String[] args)throws Exception{
		
		LogUtil logUtil = LogUtil.getInstance();
		try{
			Properties properties = new Properties();
			properties.load(new InputStreamReader(new FileInputStream(args[1] + File.separator + args[0] + File.separator + "config" + File.separator + "config.properties"), "ISO-8859-1"));
			logUtil.setProperties(properties);
			
			FactoryCommand factory = FactoryCommand.getInstance();
			AbstractCommand command = factory.getCommand(args[0]);		
			
			command.setProperties(properties);
			command.execute();
		}catch(Exception e){
			e.printStackTrace();
			logUtil.severe(e.getMessage());
			for(StackTraceElement st : e.getStackTrace()){
				logUtil.severe(st.toString());
			}
			logUtil.saveLogException(e);
		}

		
	}

}
