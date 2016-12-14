package br.com.cea.ecommerce.pl.ws;

import br.com.cea.ebs.cea.ecommerce.cartaopl.v1.CartaoPLRequest;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.pl.vo.MergeItemBase2VO;

public class MergeItemBase2Converter {
	
	public static synchronized void copyFromMergeItemBase2ToMergeItemBase2VO(CartaoPLRequest cartaoPLRequest, MergeItemBase2VO mergeItemBase2VO){
		mergeItemBase2VO.setIdPagamento(cartaoPLRequest.getCartaoPL().getIdPgto());
		mergeItemBase2VO.setIdPedido(cartaoPLRequest.getCartaoPL().getNumPedido());
		//NumSeqPedido
		mergeItemBase2VO.setDtMovLog(DateTimeUtil.format(cartaoPLRequest.getCartaoPL().getDtMovLog(), DateTimeUtil.PATTERN_DATE_EN_WITHOUT_SLASH));
		mergeItemBase2VO.setTipTransac(cartaoPLRequest.getCartaoPL().getTipTransac());
		mergeItemBase2VO.setPlnCredt(cartaoPLRequest.getCartaoPL().getPlnCredit());
		mergeItemBase2VO.setNumCartao(cartaoPLRequest.getCartaoPL().getNumCartao());
		mergeItemBase2VO.setVlrPago(cartaoPLRequest.getCartaoPL().getVlrPago());
		mergeItemBase2VO.setDataItem(DateTimeUtil.format(cartaoPLRequest.getCartaoPL().getData(), DateTimeUtil.PATTERN_DATE_PT_WITHOUT_SLASH));
		mergeItemBase2VO.setCodOrpag(cartaoPLRequest.getCartaoPL().getCodOrpag());
		mergeItemBase2VO.setNumTicket(cartaoPLRequest.getCartaoPL().getNumPedido());
		mergeItemBase2VO.setNumParc(cartaoPLRequest.getCartaoPL().getNumParc() + "");		
		mergeItemBase2VO.setRespCode(cartaoPLRequest.getCartaoPL().getRespCode());
		mergeItemBase2VO.setRetCode(cartaoPLRequest.getCartaoPL().getRetCode());
		mergeItemBase2VO.setReasonCode(cartaoPLRequest.getCartaoPL().getReasonCode());
		mergeItemBase2VO.setCodAutoriz(cartaoPLRequest.getCartaoPL().getCodAutorizacao());
		mergeItemBase2VO.setNumDocum(cartaoPLRequest.getCartaoPL().getCpf());
		mergeItemBase2VO.setNumFone(cartaoPLRequest.getCartaoPL().getFoneCliente());
		mergeItemBase2VO.setHora(DateTimeUtil.format(cartaoPLRequest.getCartaoPL().getData(), DateTimeUtil.PATTERN_TIME_PT));
		mergeItemBase2VO.setDescReason(cartaoPLRequest.getCartaoPL().getDescRetorno());
	}

}
