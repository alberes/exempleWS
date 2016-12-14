
package br.com.cea.ebs.cea.ecommerce.bankslip.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankSlip" type="{http://www.cea.com.br/EBS/CEA/ecommerce/bankslip/v1}BankSlip"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bankSlip"
})
@XmlRootElement(name = "BankSlipRequest")
public class BankSlipRequest {

    @XmlElement(name = "BankSlip", required = true)
    protected BankSlip bankSlip;

    /**
     * Gets the value of the bankSlip property.
     * 
     * @return
     *     possible object is
     *     {@link BankSlip }
     *     
     */
    public BankSlip getBankSlip() {
        return bankSlip;
    }

    /**
     * Sets the value of the bankSlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankSlip }
     *     
     */
    public void setBankSlip(BankSlip value) {
        this.bankSlip = value;
    }

}
