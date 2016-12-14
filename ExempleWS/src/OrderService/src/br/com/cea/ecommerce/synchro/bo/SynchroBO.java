package br.com.cea.ecommerce.synchro.bo;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.invoice.dao.InvoiceDAO;
import br.com.cea.ecommerce.invoice.dao.InvoiceDAOImp;
import br.com.cea.ecommerce.invoice.vo.InvoiceVO;
import br.com.cea.ecommerce.invoice.vo.ItemVO;
import br.com.cea.ecommerce.invoice.vo.OrderVO;
import br.com.cea.ecommerce.synchro.dao.SynchroDAO;

public class SynchroBO {
	
	private Logger logger = LogManager.getLogger(getClass());
	
	public void sendInvoice(String invoiceId) throws Exception{
		InvoiceDAO invoiceDAO = new InvoiceDAOImp(null);
		SynchroDAO synchroDAO = new SynchroDAO(null);
				
		try{
			InvoiceVO vo = invoiceDAO.getInvoiceById(invoiceId);
			if(vo == null){
				throw new BusinessException("Itens nao encontrados");
			}
			logger.debug("Invoice retrieved: " + invoiceId);
			
			addSerialNumber(invoiceDAO, vo.getOrder());
			
			synchroDAO.insertInvoice(vo);
			
			invoiceDAO.commit();
			synchroDAO.commit();
			logger.debug("Invoice sent to Synchro: " + invoiceId);
		} catch (DAOException e){
			logger.error("Falha no acesso ao banco de dados", e);
			synchroDAO.rollback();
			invoiceDAO.rollback();
			throw new Exception(e);
		} finally {
			invoiceDAO.close();
			synchroDAO.close();
		}
	}
	
	private void addSerialNumber(InvoiceDAO invoiceDAO, OrderVO order)throws Exception{
		List<ItemVO> itemsSerial = new ArrayList<ItemVO>();
		List<Integer> itemsRemove = new ArrayList<Integer>();
		List<ItemVO> items = order.getItems();
		Double total = 0d;
		//Produtos eletronicos precisam dos seriais para colocar na nota fiscal para identificar a garantia
		for(ItemVO item : items){
			if(item.getItemClass() != null && !"".equals(item.getItemClass().trim()) && item.getItemClass().matches("[0-9]+")){
				long itemClass = Long.valueOf(item.getItemClass());
				if(itemClass < 400){
					List<String> seriais = invoiceDAO.getSerialNumber(order.getStoreOrderId(), item.getSkuId(), item.getQuantity());
					if(item.getQuantity() != seriais.size()){
						throw new Exception("Serial nao encontrado para o sku " + item.getSkuId() + " do pedido " + order.getId());
					}
					for(int index = 0; index < item.getQuantity(); index++){
						ItemVO itemSerial = new ItemVO(item);
						itemSerial.setQuantity(1);
						itemSerial.setSerial(seriais.get(index));
						itemSerial.setDiscounts(item.getDiscounts() / item.getQuantity());
						itemSerial.setShipping(item.getShipping() / item.getQuantity());
						itemsRemove.add(index);
						itemsSerial.add(itemSerial);
						total += itemSerial.getShipping();
					}
					//Caso tenha diferenca por causa da divisao adicionar no primeiro item
					if(total < item.getShipping()){
						itemsSerial.get(0).setShipping(item.getShipping() - total);;
					}
				}
			}
		}
		//Remover os produtos eletronicos agrupados para adicionar desagrupados
		for(int index = itemsRemove.size() - 1; index >= 0; index--){			
			items.remove(index);
		}			
		//Adiciona os items eletronicos com seriais.
		items.addAll(itemsSerial);
	}
	
}
