package br.com.cea.ecommerce.pl.bo;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.commons.exception.BusinessException;
import br.com.cea.commons.exception.DAOException;
import br.com.cea.ecommerce.pl.dao.PLBase2DAO;
import br.com.cea.ecommerce.pl.dao.PLBase2DAOImp;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2LogVO;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2VO;

public class PLBase2BOImp implements PLBase2BO{
	
	private Logger logger = LogManager.getLogger(getClass());
	
	@Override
	public MergeItemBase2VO createItemBase2(MergeItemBase2VO mergeItemBase2VO) throws BusinessException, Exception{
		PLBase2DAO plBase2DAO = new PLBase2DAOImp(null);
		
		try{
			//Valores inicias
			mergeItemBase2VO.setCreateDate(new Date());
			mergeItemBase2VO.setExecutionDate(null);
			mergeItemBase2VO.setStatus("A".equals(mergeItemBase2VO.getRespCode()) && "0".equals(mergeItemBase2VO.getRetCode()) ? 1 : 0);//Ainda nao foi enviado para OKI
			mergeItemBase2VO.setDesctiptionStatus("Dados inseridos.");
			//Regras para campos fixos
			mergeItemBase2VO.setTpReg("01");
			mergeItemBase2VO.setCdFl("0455");
			mergeItemBase2VO.setCdLogPos("01");
			mergeItemBase2VO.setCdVrsPos("90");
			mergeItemBase2VO.setCdRlsVrs("00");
			mergeItemBase2VO.setCdMovPos("50");
			mergeItemBase2VO.setPais("BR");
			mergeItemBase2VO.setTipDoc("0");
			mergeItemBase2VO.setMoeda("986");
			mergeItemBase2VO.setCodSuperv("000000000000");
			mergeItemBase2VO.setFlgAutoriz("0");
			mergeItemBase2VO.setReasCode("000");
			mergeItemBase2VO.setFlgOffline("N");
			mergeItemBase2VO.setLoja("0455");
			mergeItemBase2VO.setVlPagoDin("0000000000000");
			mergeItemBase2VO.setVlPagoChq("0000000000000");
			mergeItemBase2VO.setVlPagoTef("0000000000000");
			mergeItemBase2VO.setVlPagoBns("0000000000000");
			mergeItemBase2VO.setVlPagoUss("0000000000000");
			mergeItemBase2VO.setVlPagoCqu("0000000000000");
			mergeItemBase2VO.setTpOperacao("00");
			mergeItemBase2VO.setLeitCart("1");
			mergeItemBase2VO.setNumOperador("000");
			
			if("A".equals(mergeItemBase2VO.getTipTransac())){
				mergeItemBase2VO.setIdeOpera("001");//Pagamento de Compra Rotativo
			}else if("N".equals(mergeItemBase2VO.getTipTransac())){
				mergeItemBase2VO.setIdeOpera("005");//Pagamento de Compra Parcelada sem Juros
			}			
			
			plBase2DAO.saveMergeItemBase2(mergeItemBase2VO);
			
			plBase2DAO.commit();
		}catch(DAOException e){
			logger.error("Falha no acesso ao banco de dados", e);
			plBase2DAO.rollback();
			throw new Exception(e);
		}finally{
			plBase2DAO.close();
		}
		return mergeItemBase2VO;
	}
	
	@Override
	public MergeItemBase2LogVO createBase2Log(MergeItemBase2LogVO mergeItemBase2LogVO) throws BusinessException, Exception{
		PLBase2DAO plBase2DAO = new PLBase2DAOImp(null);
		try{
			//Valores inicias
			mergeItemBase2LogVO.setCreateDate(new Date());
			
			plBase2DAO.saveMergeBase2Log(mergeItemBase2LogVO);
			plBase2DAO.commit();
		}catch(DAOException e){
			logger.error("Falha no acesso ao banco de dados", e);
			plBase2DAO.rollback();
			throw new Exception(e);
		}finally{
			plBase2DAO.close();
		}
		return mergeItemBase2LogVO;
	}

}
