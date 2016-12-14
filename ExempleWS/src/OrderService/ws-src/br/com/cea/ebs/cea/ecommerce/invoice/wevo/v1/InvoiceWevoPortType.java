
package br.com.cea.ebs.cea.ecommerce.invoice.wevo.v1;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "InvoiceWevo_PortType", targetNamespace = "http://www.cea.com.br/EBS/CEA/ecommerce/invoice/wevo/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    br.com.cea.ebo.cea.v1.ObjectFactory.class,
    br.com.cea.ebs.cea.ecommerce.invoice.wevo.v1.ObjectFactory.class
})
public interface InvoiceWevoPortType {


    /**
     * 
     * @return
     *     returns br.com.cea.ebs.cea.ecommerce.invoice.wevo.v1.QuantityUpdatedResponse
     * @throws TechnicalFaultMsg
     * @throws BusinessFaultMsg
     */
    @WebMethod
    @WebResult(name = "QuantityUpdatedResponse", targetNamespace = "http://www.cea.com.br/EBS/CEA/ecommerce/invoice/wevo/v1", partName = "parameters")
    public QuantityUpdatedResponse sendInvoiceToWevo()
        throws BusinessFaultMsg, TechnicalFaultMsg
    ;

}
