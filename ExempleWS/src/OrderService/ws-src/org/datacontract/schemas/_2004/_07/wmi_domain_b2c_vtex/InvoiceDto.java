
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Invoice" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}Invoice" minOccurs="0"/>
 *         &lt;element name="InvoiceItem" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfInvoiceItem" minOccurs="0"/>
 *         &lt;element name="InvoiceTransaction" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfInvoiceTransaction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDto", propOrder = {
    "invoice",
    "invoiceItem",
    "invoiceTransaction"
})
public class InvoiceDto {

    @XmlElementRef(name = "Invoice", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Invoice> invoice;
    @XmlElementRef(name = "InvoiceItem", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInvoiceItem> invoiceItem;
    @XmlElementRef(name = "InvoiceTransaction", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInvoiceTransaction> invoiceTransaction;

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     
     */
    public JAXBElement<Invoice> getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     
     */
    public void setInvoice(JAXBElement<Invoice> value) {
        this.invoice = ((JAXBElement<Invoice> ) value);
    }

    /**
     * Gets the value of the invoiceItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInvoiceItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInvoiceItem> getInvoiceItem() {
        return invoiceItem;
    }

    /**
     * Sets the value of the invoiceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInvoiceItem }{@code >}
     *     
     */
    public void setInvoiceItem(JAXBElement<ArrayOfInvoiceItem> value) {
        this.invoiceItem = ((JAXBElement<ArrayOfInvoiceItem> ) value);
    }

    /**
     * Gets the value of the invoiceTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInvoiceTransaction }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInvoiceTransaction> getInvoiceTransaction() {
        return invoiceTransaction;
    }

    /**
     * Sets the value of the invoiceTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInvoiceTransaction }{@code >}
     *     
     */
    public void setInvoiceTransaction(JAXBElement<ArrayOfInvoiceTransaction> value) {
        this.invoiceTransaction = ((JAXBElement<ArrayOfInvoiceTransaction> ) value);
    }

}
