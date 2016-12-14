
package br.com.cea.ebo.cea.ecommerce.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LogisticsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogisticsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryWindowStartDateUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeliveryWindowEndDateUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeliveryWindowPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ItemIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LockTTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogisticsDeliveryId" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ArrayOfLogisticsDeliveryId" minOccurs="0"/>
 *         &lt;element name="LogisticsInfoSla" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ArrayOfLogisticsInfoSla" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SelectedSla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ShippingEstimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingEstimateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogisticsInfo", propOrder = {
    "deliveryCompany",
    "deliveryWindowStartDateUtc",
    "deliveryWindowEndDateUtc",
    "deliveryWindowPrice",
    "itemIndex",
    "lockTTL",
    "logisticsDeliveryId",
    "logisticsInfoSla",
    "price",
    "selectedSla",
    "sellingPrice",
    "shippingEstimate",
    "shippingEstimateDate"
})
public class LogisticsInfo {

    @XmlElement(name = "DeliveryCompany")
    protected String deliveryCompany;
    @XmlElement(name = "DeliveryWindowStartDateUtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryWindowStartDateUtc;
    @XmlElement(name = "DeliveryWindowEndDateUtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryWindowEndDateUtc;
    @XmlElement(name = "DeliveryWindowPrice")
    protected Double deliveryWindowPrice;
    @XmlElement(name = "ItemIndex")
    protected Integer itemIndex;
    @XmlElement(name = "LockTTL")
    protected String lockTTL;
    @XmlElement(name = "LogisticsDeliveryId")
    protected ArrayOfLogisticsDeliveryId logisticsDeliveryId;
    @XmlElement(name = "LogisticsInfoSla")
    protected ArrayOfLogisticsInfoSla logisticsInfoSla;
    @XmlElement(name = "Price")
    protected Double price;
    @XmlElement(name = "SelectedSla")
    protected String selectedSla;
    @XmlElement(name = "SellingPrice")
    protected Double sellingPrice;
    @XmlElement(name = "ShippingEstimate")
    protected String shippingEstimate;
    @XmlElement(name = "ShippingEstimateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingEstimateDate;

    /**
     * Gets the value of the deliveryCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    /**
     * Sets the value of the deliveryCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCompany(String value) {
        this.deliveryCompany = value;
    }

    /**
     * Gets the value of the deliveryWindowStartDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryWindowStartDateUtc() {
        return deliveryWindowStartDateUtc;
    }

    /**
     * Sets the value of the deliveryWindowStartDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryWindowStartDateUtc(XMLGregorianCalendar value) {
        this.deliveryWindowStartDateUtc = value;
    }

    /**
     * Gets the value of the deliveryWindowEndDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryWindowEndDateUtc() {
        return deliveryWindowEndDateUtc;
    }

    /**
     * Sets the value of the deliveryWindowEndDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryWindowEndDateUtc(XMLGregorianCalendar value) {
        this.deliveryWindowEndDateUtc = value;
    }

    /**
     * Gets the value of the deliveryWindowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeliveryWindowPrice() {
        return deliveryWindowPrice;
    }

    /**
     * Sets the value of the deliveryWindowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeliveryWindowPrice(Double value) {
        this.deliveryWindowPrice = value;
    }

    /**
     * Gets the value of the itemIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemIndex() {
        return itemIndex;
    }

    /**
     * Sets the value of the itemIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemIndex(Integer value) {
        this.itemIndex = value;
    }

    /**
     * Gets the value of the lockTTL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockTTL() {
        return lockTTL;
    }

    /**
     * Sets the value of the lockTTL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockTTL(String value) {
        this.lockTTL = value;
    }

    /**
     * Gets the value of the logisticsDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLogisticsDeliveryId }
     *     
     */
    public ArrayOfLogisticsDeliveryId getLogisticsDeliveryId() {
        return logisticsDeliveryId;
    }

    /**
     * Sets the value of the logisticsDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLogisticsDeliveryId }
     *     
     */
    public void setLogisticsDeliveryId(ArrayOfLogisticsDeliveryId value) {
        this.logisticsDeliveryId = value;
    }

    /**
     * Gets the value of the logisticsInfoSla property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLogisticsInfoSla }
     *     
     */
    public ArrayOfLogisticsInfoSla getLogisticsInfoSla() {
        return logisticsInfoSla;
    }

    /**
     * Sets the value of the logisticsInfoSla property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLogisticsInfoSla }
     *     
     */
    public void setLogisticsInfoSla(ArrayOfLogisticsInfoSla value) {
        this.logisticsInfoSla = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
    }

    /**
     * Gets the value of the selectedSla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedSla() {
        return selectedSla;
    }

    /**
     * Sets the value of the selectedSla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedSla(String value) {
        this.selectedSla = value;
    }

    /**
     * Gets the value of the sellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Sets the value of the sellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSellingPrice(Double value) {
        this.sellingPrice = value;
    }

    /**
     * Gets the value of the shippingEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingEstimate() {
        return shippingEstimate;
    }

    /**
     * Sets the value of the shippingEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingEstimate(String value) {
        this.shippingEstimate = value;
    }

    /**
     * Gets the value of the shippingEstimateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingEstimateDate() {
        return shippingEstimateDate;
    }

    /**
     * Sets the value of the shippingEstimateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingEstimateDate(XMLGregorianCalendar value) {
        this.shippingEstimateDate = value;
    }

}
