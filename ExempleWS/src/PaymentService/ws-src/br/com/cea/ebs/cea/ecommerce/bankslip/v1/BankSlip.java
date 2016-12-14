
package br.com.cea.ebs.cea.ecommerce.bankslip.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankSlip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankSlip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateOccurrence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValueBankSlip" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValuePayment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DepositDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LineDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankSlip", propOrder = {
    "dateOccurrence",
    "orderId",
    "dueDate",
    "valueBankSlip",
    "valuePayment",
    "depositDate",
    "payer",
    "lineDetail"
})
public class BankSlip {

    @XmlElement(name = "DateOccurrence", required = true)
    protected String dateOccurrence;
    @XmlElement(name = "OrderId", required = true)
    protected String orderId;
    @XmlElement(name = "DueDate", required = true)
    protected String dueDate;
    @XmlElement(name = "ValueBankSlip", required = true)
    protected BigDecimal valueBankSlip;
    @XmlElement(name = "ValuePayment", required = true)
    protected BigDecimal valuePayment;
    @XmlElement(name = "DepositDate", required = true)
    protected String depositDate;
    @XmlElement(name = "Payer", required = true)
    protected String payer;
    @XmlElement(name = "LineDetail", required = true)
    protected String lineDetail;

    /**
     * Gets the value of the dateOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOccurrence() {
        return dateOccurrence;
    }

    /**
     * Sets the value of the dateOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOccurrence(String value) {
        this.dateOccurrence = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the valueBankSlip property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValueBankSlip() {
        return valueBankSlip;
    }

    /**
     * Sets the value of the valueBankSlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValueBankSlip(BigDecimal value) {
        this.valueBankSlip = value;
    }

    /**
     * Gets the value of the valuePayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValuePayment() {
        return valuePayment;
    }

    /**
     * Sets the value of the valuePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValuePayment(BigDecimal value) {
        this.valuePayment = value;
    }

    /**
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositDate(String value) {
        this.depositDate = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * Gets the value of the lineDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDetail() {
        return lineDetail;
    }

    /**
     * Sets the value of the lineDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDetail(String value) {
        this.lineDetail = value;
    }

}
