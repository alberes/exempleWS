package br.com.cea.ecommerce.affiliated.ws;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.cea.ebo.cea.v1.MetaInfType;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;
import br.com.cea.ebs.cea.ecommerce.affiliated.v1.Affiliated;
import br.com.cea.ebs.cea.ecommerce.affiliated.v1.AffiliatedPortType;
import br.com.cea.ebs.cea.ecommerce.affiliated.v1.AffiliatedRequest;
import br.com.cea.ebs.cea.ecommerce.affiliated.v1.AffiliatedResponse;
import br.com.cea.ebs.cea.ecommerce.affiliated.v1.Affiliates;
import br.com.cea.ebs.cea.ecommerce.affiliated.v1.BusinessFaultMsg;
import br.com.cea.ebs.cea.ecommerce.affiliated.v1.TechnicalFaultMsg;
import br.com.cea.ecommerce.affiliated.bo.AffiliatedBO;
import br.com.cea.ecommerce.affiliated.bo.AffiliatedBOImp;
import br.com.cea.ecommerce.affiliated.vo.AffiliatedVO;
import br.com.cea.ecommerce.affiliated.vo.DependentVO;
import br.com.cea.ecommerce.common.util.DateTimeUtil;
import br.com.cea.ecommerce.common.util.FaultUtil;

@javax.jws.WebService(endpointInterface = "br.com.cea.ebs.cea.ecommerce.affiliated.v1.AffiliatedPortType")
public class AffiliatedPortTypeImp implements AffiliatedPortType{

	private Logger logger = LogManager.getLogger(getClass());

	@Override
	public AffiliatedResponse affiliates(AffiliatedRequest parameters,
			MetaInfType header) throws BusinessFaultMsg, TechnicalFaultMsg {
		AffiliatedResponse response = new AffiliatedResponse();
		response.setAffiliates(new Affiliates());
		AffiliatedBO affiliatedBO = new AffiliatedBOImp();
		Affiliated affiliated = null;
		
		try{
			
			if(parameters.getRequestDate() == null){
				GregorianCalendar gc = new GregorianCalendar();
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				gc.setTime(dateFormat.parse(dateFormat.format(new Date())));
				parameters.setRequestDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
			}
			
			List<AffiliatedVO> affiliates = affiliatedBO.getAffiliates(DateTimeUtil.convertGregorianToDate(parameters.getRequestDate()));
			List<DependentVO> dependents = affiliatedBO.getDependents(DateTimeUtil.convertGregorianToDate(parameters.getRequestDate()));

			List<Affiliated> affiliatesWS = response.getAffiliates().getAffiliated();
			
			for(AffiliatedVO affiliatedVO : affiliates){
				affiliated = new Affiliated();
				AffiliatedConverter.copyFromAffiliatedVOToAffiliated(affiliatedVO, affiliated);
				affiliatesWS.add(affiliated);
			}
			
			for(DependentVO dependentVO : dependents){
				affiliated = new Affiliated();
				AffiliatedConverter.copyFromDependentVOToAffiliated(dependentVO, affiliated);
				affiliatesWS.add(affiliated);
			}
		}catch (Exception e) {
			String errorMessage = "Error no servico associados";
			logger.error(errorMessage, e);
			TechnicalFaultType fault = FaultUtil.getInstance().createTechnicalFaultMsg(e);
			throw new TechnicalFaultMsg(errorMessage, fault);
		}		
		return response;
	}

}
