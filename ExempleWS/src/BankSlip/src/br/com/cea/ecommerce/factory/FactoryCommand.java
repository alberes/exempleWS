package br.com.cea.ecommerce.factory;

import java.util.Properties;

import br.com.cea.ecommerce.command.AbstractCommand;

public class FactoryCommand {

	private Properties mappings = null;
	
	private static FactoryCommand instance = null;
	
	private FactoryCommand(){
		mappings = new Properties();
		mappings.put("bankslip", "br.com.cea.ecommerce.command.ReadFileCNABCommand");
	}
	
	public static FactoryCommand getInstance(){
		if(instance == null){
			synchronized (FactoryCommand.class) {
				if(instance == null){
					instance = new FactoryCommand();
				}
			}
		}
		return instance;
	}
	
	/**
	* Caso nao seja encontrado sera retornado nulo.
	* @param command
	* @return
	*/
	public AbstractCommand getCommand(String command) {
		AbstractCommand cmd = null;
		try {
			cmd = (AbstractCommand)Class.forName(this.mappings.getProperty(command)).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cmd;
	}
}
