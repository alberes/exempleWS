package br.com.cea.ecommerce.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Clob;
import java.sql.SQLException;

public class ConverterUtil {
	
	public static String clobToString(Clob clob) throws SQLException{
		if(clob != null){
			StringBuilder sb = new StringBuilder();
			BufferedReader br = null;
			String line = null;
			try{
		        br = new BufferedReader(clob.getCharacterStream());
		        while((line = br.readLine()) != null) {
		            sb.append(line);
		        }
		        br.close();
			} catch (IOException e){
				e.printStackTrace();
			} 
			return sb.toString();
		} else {
			return null;
		}
	}

}
