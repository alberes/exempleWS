
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInvoiceConfirmDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInvoiceConfirmDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceConfirmDto" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}InvoiceConfirmDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInvoiceConfirmDto", propOrder = {
    "invoiceConfirmDto"
})
public class ArrayOfInvoiceConfirmDto {

    @XmlElement(name = "InvoiceConfirmDto", nillable = true)
    protected List<InvoiceConfirmDto> invoiceConfirmDto;

    /**
     * Gets the value of the invoiceConfirmDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceConfirmDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceConfirmDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceConfirmDto }
     * 
     * 
     */
    public List<InvoiceConfirmDto> getInvoiceConfirmDto() {
        if (invoiceConfirmDto == null) {
            invoiceConfirmDto = new ArrayList<InvoiceConfirmDto>();
        }
        return this.invoiceConfirmDto;
    }

}
