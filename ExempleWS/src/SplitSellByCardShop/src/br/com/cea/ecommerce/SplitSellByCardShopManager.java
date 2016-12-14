package br.com.cea.ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import br.com.cea.ecommerce.card.file.SplitSellByCardShop;
import br.com.cea.ecommerce.util.LogUtil;

public class SplitSellByCardShopManager {
	
	private static SplitSellByCardShopManager instance;
	
	private boolean freeForExecution;
	
	private SplitSellByCardShopManager(){
		super();
		freeForExecution = true;
	}

	public static SplitSellByCardShopManager getInstance(){
		if(instance == null){
			synchronized(SplitSellByCardShopManager.class){
				if(instance == null){
					instance = new SplitSellByCardShopManager();
				}
			}
		}
		return instance;
	}
	
	public void execute(String prefixFileName, String path) throws Exception{
		if(freeForExecution){
			freeForExecution = false;
			InputStream input = new FileInputStream(path + File.separator + "config" + File.separator + "config.properties");
			Properties properties = new Properties();
			properties.load(input);
			
			LogUtil logUtil = LogUtil.getInstance();
			logUtil.setProperties(properties);
			
			SplitSellByCardShop splitSellByCardShop = new SplitSellByCardShop(properties, prefixFileName);
			splitSellByCardShop.setLogUtil(logUtil);
						
			try {			
				splitSellByCardShop.split();
			} catch (Exception e) {			
				e.printStackTrace();
				logUtil.severe(e.getMessage());
				for(int index = 0; index < e.getStackTrace().length; index++){
					logUtil.severe(e.getStackTrace()[index].toString());
				}
				splitSellByCardShop.saveLogException(e);
			}finally{
				logUtil.close();
				freeForExecution = true;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		SplitSellByCardShopManager.getInstance().execute(args[0], args[1]);
	}

}
