package br.com.cea.ecommerce.affiliated.ws;

import br.com.cea.ebs.cea.ecommerce.affiliated.v1.Affiliated;
import br.com.cea.ecommerce.affiliated.vo.AffiliatedVO;
import br.com.cea.ecommerce.affiliated.vo.DependentVO;

public class AffiliatedConverter {

	public static synchronized void copyFromAffiliatedVOToAffiliated(AffiliatedVO affiliatedVO, Affiliated affiliated){
		affiliated.setCPF(affiliatedVO.getCpf());
		affiliated.setMatricula(affiliatedVO.getChapa());
		affiliated.setStatus("ATIVO".equals(affiliatedVO.getSituacao())? "ATIVO" : "INATIVO");
	}

	public static synchronized void copyFromDependentVOToAffiliated(DependentVO dependentVO, Affiliated affiliated){
		affiliated.setCPF(dependentVO.getCpf());
		affiliated.setMatricula(dependentVO.getChapa());
		affiliated.setStatus("ATIVO".equals(dependentVO.getSituacao())? "ATIVO" : "INATIVO");
	}
	
}
