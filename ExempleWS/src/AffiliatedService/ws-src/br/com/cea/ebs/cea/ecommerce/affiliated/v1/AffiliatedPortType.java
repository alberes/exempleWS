
package br.com.cea.ebs.cea.ecommerce.affiliated.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import br.com.cea.ebo.cea.v1.MetaInfType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Affiliated_PortType", targetNamespace = "http://www.cea.com.br/EBS/CEA/ecommerce/affiliated/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    br.com.cea.ebo.cea.v1.ObjectFactory.class,
    br.com.cea.ebs.cea.ecommerce.affiliated.v1.ObjectFactory.class
})
public interface AffiliatedPortType {


    /**
     * 
     * @param parameters
     * @param header
     * @return
     *     returns br.com.cea.ebs.cea.ecommerce.affiliated.v1.AffiliatedResponse
     * @throws BusinessFaultMsg
     * @throws TechnicalFaultMsg
     */
    @WebMethod(operationName = "Affiliates")
    @WebResult(name = "AffiliatedResponse", targetNamespace = "http://www.cea.com.br/EBS/CEA/ecommerce/affiliated/v1", partName = "parameters")
    public AffiliatedResponse affiliates(
        @WebParam(name = "AffiliatedRequest", targetNamespace = "http://www.cea.com.br/EBS/CEA/ecommerce/affiliated/v1", partName = "parameters")
        AffiliatedRequest parameters,
        @WebParam(name = "MetaInformacao", targetNamespace = "http://www.cea.com.br/EBO/CEA/v1", header = true, partName = "header")
        MetaInfType header)
        throws BusinessFaultMsg, TechnicalFaultMsg
    ;

}