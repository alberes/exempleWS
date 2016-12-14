
package br.com.cea.ebs.cea.ecommerce.order.wevo.v1;

import javax.xml.ws.WebFault;
import br.com.cea.ebo.cea.v1.BusinessFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "BusinessFault", targetNamespace = "http://www.cea.com.br/EBO/CEA/v1")
public class BusinessFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BusinessFaultType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public BusinessFaultMsg(String message, BusinessFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public BusinessFaultMsg(String message, BusinessFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.cea.ebo.cea.v1.BusinessFaultType
     */
    public BusinessFaultType getFaultInfo() {
        return faultInfo;
    }

}
