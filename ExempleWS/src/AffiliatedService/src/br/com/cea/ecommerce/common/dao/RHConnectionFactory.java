package br.com.cea.ecommerce.common.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.dao.jdbc.J2EEConnectionFactory;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.dao.RHConnectionFactory;


/**
 * A factory for creating OracleConnection objects.
 */
public final class RHConnectionFactory extends J2EEConnectionFactory {
	
	/** The jndi. */
	private static String jndi = "jdbc/rhDS";

	/** The me. */
	private static ConnectionFactory me = new RHConnectionFactory();
	
	/**
	 * Gets the single instance of OracleConnectionFactory.
	 *
	 * @return single instance of OracleConnectionFactory
	 */
	public static ConnectionFactory getInstance() {
        return me;
    }

    /**
     * Instantiates a new oracle connection factory.
     */
    private RHConnectionFactory() {
        super(jndi);
    }
    
    
    /**
     * Retorna um conexao manualmente.
     *
     * @return the local connection
     * @throws DAOException the dAO exception
     */
    public Connection getLocalConnection() throws DAOException {
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.16.40.104:1852:rfrisut","uec01","temp#01");
//        	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.16.40.104:1852:rfrisut","admec01","dilbert_2014");
//        	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@cealrfrisdbp1:1855:rfrispr01","UEC01","eccea_2014");
        	
        	// Deixar getConnection comentado e retornar null para n�o bloquear na valida��o pelo Jenkins/Sonar
            //return null;
            return conn;
        } catch (Exception ex) {
            throw new DAOException("Erro ao obter a conex�o local", ex);
        }
    }

}