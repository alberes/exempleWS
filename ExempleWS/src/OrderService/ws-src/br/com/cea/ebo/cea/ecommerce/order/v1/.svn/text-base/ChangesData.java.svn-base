
package br.com.cea.ebo.cea.ecommerce.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChangesData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangesData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ChangesDataItem" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ArrayOfChangesDataItem" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Receipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangesData", propOrder = {
    "discountValue",
    "changesDataItem",
    "reason",
    "receipt",
    "receiptDate"
})
public class ChangesData {

    @XmlElement(name = "DiscountValue")
    protected Double discountValue;
    @XmlElement(name = "ChangesDataItem")
    protected ArrayOfChangesDataItem changesDataItem;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "Receipt")
    protected String receipt;
    @XmlElement(name = "ReceiptDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;

    /**
     * Gets the value of the discountValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountValue() {
        return discountValue;
    }

    /**
     * Sets the value of the discountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountValue(Double value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the changesDataItem property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChangesDataItem }
     *     
     */
    public ArrayOfChangesDataItem getChangesDataItem() {
        return changesDataItem;
    }

    /**
     * Sets the value of the changesDataItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChangesDataItem }
     *     
     */
    public void setChangesDataItem(ArrayOfChangesDataItem value) {
        this.changesDataItem = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceipt(String value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

}
