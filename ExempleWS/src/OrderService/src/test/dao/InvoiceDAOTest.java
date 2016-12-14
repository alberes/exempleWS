package test.dao;

import java.sql.SQLException;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.common.dao.EcommerceConnectionFactory;
import br.com.cea.ecommerce.invoice.dao.InvoiceDAO;
import br.com.cea.ecommerce.invoice.dao.InvoiceDAOImp;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;

public class InvoiceDAOTest extends TestCase {
	
	private InvoiceDAO dao = null;
	
	@Before
	public void setUp() {
		try {
			try {
				dao = new InvoiceDAOImp(EcommerceConnectionFactory.getInstance());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}
	
	@Test
	public void testSave() throws DAOException{
		InvoiceVO invoice = new InvoiceVO();
		invoice = dao.saveInvoice(invoice);
	}

}
