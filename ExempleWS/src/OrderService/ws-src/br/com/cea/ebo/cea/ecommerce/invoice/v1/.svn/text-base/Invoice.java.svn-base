
package br.com.cea.ebo.cea.ecommerce.invoice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Order" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}Order"/>
 *         &lt;element name="Items" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}ItemList"/>
 *         &lt;element name="Totals" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}Totals"/>
 *         &lt;element name="Customer" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}Customer"/>
 *         &lt;element name="ShippingAddress" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}Address"/>
 *         &lt;element name="Transactions" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}TransactionList"/>
 *         &lt;element name="FiscalDocument" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}FiscalDocument" minOccurs="0"/>
 *         &lt;element name="InvoiceSelf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UpdatedAt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IssuanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SalesChannel" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}SalesChannel" minOccurs="0"/>
 *         &lt;element name="Courier" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}Courier" minOccurs="0"/>
 *         &lt;element name="Checkout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = {
    "id",
    "order",
    "items",
    "totals",
    "customer",
    "shippingAddress",
    "transactions",
    "fiscalDocument",
    "invoiceSelf",
    "type",
    "createdAt",
    "updatedAt",
    "issuanceDate",
    "salesChannel",
    "courier",
    "checkout"
})
public class Invoice {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Order", required = true)
    protected Order order;
    @XmlElement(name = "Items", required = true)
    protected ItemList items;
    @XmlElement(name = "Totals", required = true)
    protected Totals totals;
    @XmlElement(name = "Customer", required = true)
    protected Customer customer;
    @XmlElement(name = "ShippingAddress", required = true)
    protected Address shippingAddress;
    @XmlElement(name = "Transactions", required = true)
    protected TransactionList transactions;
    @XmlElement(name = "FiscalDocument")
    protected FiscalDocument fiscalDocument;
    @XmlElement(name = "InvoiceSelf")
    protected String invoiceSelf;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "CreatedAt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "UpdatedAt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(name = "IssuanceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuanceDate;
    @XmlElement(name = "SalesChannel")
    protected SalesChannel salesChannel;
    @XmlElement(name = "Courier")
    protected Courier courier;
    @XmlElement(name = "Checkout")
    protected Integer checkout;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
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
     * Gets the value of the totals property.
     * 
     * @return
     *     possible object is
     *     {@link Totals }
     *     
     */
    public Totals getTotals() {
        return totals;
    }

    /**
     * Sets the value of the totals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totals }
     *     
     */
    public void setTotals(Totals value) {
        this.totals = value;
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
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
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
     * Gets the value of the fiscalDocument property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalDocument }
     *     
     */
    public FiscalDocument getFiscalDocument() {
        return fiscalDocument;
    }

    /**
     * Sets the value of the fiscalDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalDocument }
     *     
     */
    public void setFiscalDocument(FiscalDocument value) {
        this.fiscalDocument = value;
    }

    /**
     * Gets the value of the invoiceSelf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSelf() {
        return invoiceSelf;
    }

    /**
     * Sets the value of the invoiceSelf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSelf(String value) {
        this.invoiceSelf = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the issuanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuanceDate() {
        return issuanceDate;
    }

    /**
     * Sets the value of the issuanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuanceDate(XMLGregorianCalendar value) {
        this.issuanceDate = value;
    }

    /**
     * Gets the value of the salesChannel property.
     * 
     * @return
     *     possible object is
     *     {@link SalesChannel }
     *     
     */
    public SalesChannel getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesChannel }
     *     
     */
    public void setSalesChannel(SalesChannel value) {
        this.salesChannel = value;
    }

    /**
     * Gets the value of the courier property.
     * 
     * @return
     *     possible object is
     *     {@link Courier }
     *     
     */
    public Courier getCourier() {
        return courier;
    }

    /**
     * Sets the value of the courier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Courier }
     *     
     */
    public void setCourier(Courier value) {
        this.courier = value;
    }

    /**
     * Gets the value of the checkout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckout() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckout(Integer value) {
        this.checkout = value;
    }

}
