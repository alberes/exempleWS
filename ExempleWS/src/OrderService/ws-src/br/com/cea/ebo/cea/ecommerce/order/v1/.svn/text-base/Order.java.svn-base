
package br.com.cea.ebo.cea.ecommerce.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Customer" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}Customer"/>
 *         &lt;element name="Address" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}Address"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Items" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ItemList"/>
 *         &lt;element name="Transactions" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}TransactionList"/>
 *         &lt;element name="Totals" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ArrayOfTotals"/>
 *         &lt;element name="ChangesData" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ArrayOfChangesData" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketPlace" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}MarketPlace" minOccurs="0"/>
 *         &lt;element name="CallCenter" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}CallCenterOperatorData" minOccurs="0"/>
 *         &lt;element name="MarketingData" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}MarketingData" minOccurs="0"/>
 *         &lt;element name="RatesAndBenefits" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ArrayOfRatesAndBenefits" minOccurs="0"/>
 *         &lt;element name="FollowUpEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogisticsInfo" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ArrayOfLogisticsInfo" minOccurs="0"/>
 *         &lt;element name="ChangesAttachment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "orderId",
    "sequence",
    "orderGroup",
    "status",
    "statusDescription",
    "value",
    "customer",
    "address",
    "creationDate",
    "lastChange",
    "items",
    "transactions",
    "totals",
    "changesData",
    "origin",
    "marketPlace",
    "callCenter",
    "marketingData",
    "ratesAndBenefits",
    "followUpEmail",
    "hostname",
    "logisticsInfo",
    "changesAttachment"
})
public class Order {

    @XmlElement(name = "OrderId", required = true)
    protected String orderId;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElement(name = "OrderGroup")
    protected String orderGroup;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "Value")
    protected double value;
    @XmlElement(name = "Customer", required = true)
    protected Customer customer;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastChange")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChange;
    @XmlElement(name = "Items", required = true)
    protected ItemList items;
    @XmlElement(name = "Transactions", required = true)
    protected TransactionList transactions;
    @XmlElement(name = "Totals", required = true)
    protected ArrayOfTotals totals;
    @XmlElement(name = "ChangesData")
    protected ArrayOfChangesData changesData;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "MarketPlace")
    protected MarketPlace marketPlace;
    @XmlElement(name = "CallCenter")
    protected CallCenterOperatorData callCenter;
    @XmlElement(name = "MarketingData")
    protected MarketingData marketingData;
    @XmlElement(name = "RatesAndBenefits")
    protected ArrayOfRatesAndBenefits ratesAndBenefits;
    @XmlElement(name = "FollowUpEmail")
    protected String followUpEmail;
    @XmlElement(name = "Hostname")
    protected String hostname;
    @XmlElement(name = "LogisticsInfo")
    protected ArrayOfLogisticsInfo logisticsInfo;
    @XmlElement(name = "ChangesAttachment")
    protected String changesAttachment;

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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the orderGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderGroup() {
        return orderGroup;
    }

    /**
     * Sets the value of the orderGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderGroup(String value) {
        this.orderGroup = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChange() {
        return lastChange;
    }

    /**
     * Sets the value of the lastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChange(XMLGregorianCalendar value) {
        this.lastChange = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setItems(ItemList value) {
        this.items = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionList }
     *     
     */
    public TransactionList getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionList }
     *     
     */
    public void setTransactions(TransactionList value) {
        this.transactions = value;
    }

    /**
     * Gets the value of the totals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTotals }
     *     
     */
    public ArrayOfTotals getTotals() {
        return totals;
    }

    /**
     * Sets the value of the totals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTotals }
     *     
     */
    public void setTotals(ArrayOfTotals value) {
        this.totals = value;
    }

    /**
     * Gets the value of the changesData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChangesData }
     *     
     */
    public ArrayOfChangesData getChangesData() {
        return changesData;
    }

    /**
     * Sets the value of the changesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChangesData }
     *     
     */
    public void setChangesData(ArrayOfChangesData value) {
        this.changesData = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the marketPlace property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPlace }
     *     
     */
    public MarketPlace getMarketPlace() {
        return marketPlace;
    }

    /**
     * Sets the value of the marketPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPlace }
     *     
     */
    public void setMarketPlace(MarketPlace value) {
        this.marketPlace = value;
    }

    /**
     * Gets the value of the callCenter property.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterOperatorData }
     *     
     */
    public CallCenterOperatorData getCallCenter() {
        return callCenter;
    }

    /**
     * Sets the value of the callCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterOperatorData }
     *     
     */
    public void setCallCenter(CallCenterOperatorData value) {
        this.callCenter = value;
    }

    /**
     * Gets the value of the marketingData property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingData }
     *     
     */
    public MarketingData getMarketingData() {
        return marketingData;
    }

    /**
     * Sets the value of the marketingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingData }
     *     
     */
    public void setMarketingData(MarketingData value) {
        this.marketingData = value;
    }

    /**
     * Gets the value of the ratesAndBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatesAndBenefits }
     *     
     */
    public ArrayOfRatesAndBenefits getRatesAndBenefits() {
        return ratesAndBenefits;
    }

    /**
     * Sets the value of the ratesAndBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatesAndBenefits }
     *     
     */
    public void setRatesAndBenefits(ArrayOfRatesAndBenefits value) {
        this.ratesAndBenefits = value;
    }

    /**
     * Gets the value of the followUpEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowUpEmail() {
        return followUpEmail;
    }

    /**
     * Sets the value of the followUpEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowUpEmail(String value) {
        this.followUpEmail = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the logisticsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLogisticsInfo }
     *     
     */
    public ArrayOfLogisticsInfo getLogisticsInfo() {
        return logisticsInfo;
    }

    /**
     * Sets the value of the logisticsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLogisticsInfo }
     *     
     */
    public void setLogisticsInfo(ArrayOfLogisticsInfo value) {
        this.logisticsInfo = value;
    }

    /**
     * Gets the value of the changesAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangesAttachment() {
        return changesAttachment;
    }

    /**
     * Sets the value of the changesAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangesAttachment(String value) {
        this.changesAttachment = value;
    }

}
