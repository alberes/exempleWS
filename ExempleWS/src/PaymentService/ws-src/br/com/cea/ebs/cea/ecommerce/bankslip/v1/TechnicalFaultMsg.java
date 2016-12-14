
package br.com.cea.ebs.cea.ecommerce.bankslip.v1;

import javax.xml.ws.WebFault;
import br.com.cea.ebo.cea.v1.TechnicalFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "TechnicalFault", targetNamespace = "http://www.cea.com.br/EBO/CEA/v1")
public class TechnicalFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TechnicalFaultType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public TechnicalFaultMsg(String message, TechnicalFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public TechnicalFaultMsg(String message, TechnicalFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.cea.ebo.cea.v1.TechnicalFaultType
     */
    public TechnicalFaultType getFaultInfo() {
        return faultInfo;
    }

}
