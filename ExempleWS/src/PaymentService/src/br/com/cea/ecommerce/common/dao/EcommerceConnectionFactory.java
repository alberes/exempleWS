package br.com.cea.ecommerce.common.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import br.com.cea.commons.dao.jdbc.ConnectionFactory;
import br.com.cea.commons.dao.jdbc.J2EEConnectionFactory;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.dao.EcommerceConnectionFactory;


/**
 * A factory for creating OracleConnection objects.
 */
public final class EcommerceConnectionFactory extends J2EEConnectionFactory {
	
	/** The jndi. */
	private static String jndi = "jdbc/ecommerceDS";

	/** The me. */
	private static ConnectionFactory me = new EcommerceConnectionFactory();
	
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
    private EcommerceConnectionFactory() {
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
        	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.16.40.104:1852:rfrisut","admec01","dilbert_2014");
        	
        	// Deixar getConnection comentado e retornar null para não bloquear na validação pelo Jenkins/Sonar
            //return null;
            return conn;
        } catch (Exception ex) {
            throw new DAOException("Erro ao obter a conexão local", ex);
        }
    }

}