package br.com.cea.ecommerce.util;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ServiceLocator {	
	
	public static void main(String[] args) throws Exception{
		 Hashtable<String, String> env = new Hashtable<String, String>(); 
         env.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory"); 
	     env.put(Context.SECURITY_PRINCIPAL, "weblogic"); 
	     env.put(Context.SECURITY_CREDENTIALS,"weblogic1"); 
	     env.put(Context.PROVIDER_URL,"t3://localhost:7001"); 
	     Context initial = new InitialContext(env);
	     DataSource dataSource  = (DataSource) initial.lookup ("jdbc/ecommerceDS");
	     System.out.println(dataSource);
	}

}
