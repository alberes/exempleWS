package br.com.cea.ecommerce.pl.ws;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.cartaopl.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.cartaopl.v1.CartaoPLLogRequest;
import br.com.cea.ebs.cea.ecommerce.cartaopl.v1.CartaoPLPortType;
import br.com.cea.ebs.cea.ecommerce.cartaopl.v1.CartaoPLRequest;
import br.com.cea.ebs.cea.ecommerce.cartaopl.v1.CartaoPLResponse;
import br.com.cea.ebs.cea.ecommerce.cartaopl.v1.TechnicalFaultMsg;
import br.com.cea.ecommerce.common.util.FaultUtil;
import br.com.cea.ecommerce.pl.bo.PLBase2BO;
import br.com.cea.ecommerce.pl.bo.PLBase2BOImp;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2LogVO;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2VO;

@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.cartaopl.v1.CartaoPLPortType")
public class CartaoPLPortTypeImp implements CartaoPLPortType{
	
	private Logger logger = LogManager.getLogger(getClass());

	@Override
	public CartaoPLResponse cartaoPL(CartaoPLRequest parameters, MetaInfType header) throws BusinessFaultMsg, TechnicalFaultMsg {
		CartaoPLResponse response = new CartaoPLResponse();
		PLBase2BO plBase2BO = null;
		try{
			plBase2BO = new PLBase2BOImp();
			MergeItemBase2VO mergeItemBase2VO = new MergeItemBase2VO();
			MergeItemBase2Converter.copyFromMergeItemBase2ToMergeItemBase2VO(parameters, mergeItemBase2VO);
			plBase2BO.createItemBase2(mergeItemBase2VO);
			response.setAcknowledge(true);
		}catch (Exception e) {
			String errorMessage = "Error no servico CartaoPL";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}
		
		return response;
	}

	
	@Override
	public CartaoPLResponse cartaoPLLog(CartaoPLLogRequest parameters, MetaInfType header) throws BusinessFaultMsg, TechnicalFaultMsg {
		CartaoPLResponse response = new CartaoPLResponse();
		PLBase2BO plBase2BO = null;
		MergeItemBase2LogVO mergeItemBase2LogVO = new MergeItemBase2LogVO();
		try{
			plBase2BO = new PLBase2BOImp();
			mergeItemBase2LogVO.setIdPagamento(parameters.getCartaoPL().getIdPgto());
			mergeItemBase2LogVO.setIdPedido(parameters.getCartaoPL().getNumPedido());
			mergeItemBase2LogVO.setXml(xmlToString(parameters, CartaoPLLogRequest.class));
			
			plBase2BO.createBase2Log(mergeItemBase2LogVO);
			response.setAcknowledge(true);
		}catch (Exception e) {
			String errorMessage = "Error no servico CartaoPL";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}
		return response;
	}

	private String xmlToString(Object request, @SuppressWarnings("rawtypes") Class cls) throws JAXBException {
		StringWriter writer = new StringWriter();
		JAXBContext ctx = JAXBContext.newInstance(cls);
		Marshaller m = ctx.createMarshaller();
		m.marshal(request, writer);
		return writer.toString();
	 }
}
