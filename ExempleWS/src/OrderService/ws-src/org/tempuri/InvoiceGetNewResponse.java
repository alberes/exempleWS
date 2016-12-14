
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex.ArrayOfInvoiceDto;


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
 *         &lt;element name="InvoiceGetNewResult" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfInvoiceDto" minOccurs="0"/>
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
    "invoiceGetNewResult"
})
@XmlRootElement(name = "InvoiceGetNewResponse")
public class InvoiceGetNewResponse {

    @XmlElementRef(name = "InvoiceGetNewResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInvoiceDto> invoiceGetNewResult;

    /**
     * Gets the value of the invoiceGetNewResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInvoiceDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInvoiceDto> getInvoiceGetNewResult() {
        return invoiceGetNewResult;
    }

    /**
     * Sets the value of the invoiceGetNewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInvoiceDto }{@code >}
     *     
     */
    public void setInvoiceGetNewResult(JAXBElement<ArrayOfInvoiceDto> value) {
        this.invoiceGetNewResult = ((JAXBElement<ArrayOfInvoiceDto> ) value);
    }

}
