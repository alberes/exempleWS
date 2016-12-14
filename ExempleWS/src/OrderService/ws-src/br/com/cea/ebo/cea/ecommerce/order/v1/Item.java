
package br.com.cea.ebo.cea.ecommerce.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sku" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}Sku"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Discounts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LockId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPriceTag" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ArrayOfItemPriceTag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "sku",
    "quantity",
    "sellingPrice",
    "tax",
    "shipping",
    "discounts",
    "currency",
    "unitOfMeasure",
    "price",
    "listPrice",
    "imageUrl",
    "detailUrl",
    "isGift",
    "index",
    "lockId",
    "itemPriceTag"
})
public class Item {

    @XmlElement(name = "Sku", required = true)
    protected Sku sku;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "SellingPrice")
    protected double sellingPrice;
    @XmlElement(name = "Tax")
    protected double tax;
    @XmlElement(name = "Shipping")
    protected double shipping;
    @XmlElement(name = "Discounts")
    protected Double discounts;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "Price")
    protected Double price;
    @XmlElement(name = "ListPrice")
    protected Double listPrice;
    @XmlElement(name = "ImageUrl")
    protected String imageUrl;
    @XmlElement(name = "DetailUrl")
    protected String detailUrl;
    @XmlElement(name = "IsGift")
    protected Boolean isGift;
    @XmlElement(name = "Index")
    protected Integer index;
    @XmlElement(name = "LockId")
    protected String lockId;
    @XmlElement(name = "ItemPriceTag")
    protected ArrayOfItemPriceTag itemPriceTag;

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link Sku }
     *     
     */
    public Sku getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku }
     *     
     */
    public void setSku(Sku value) {
        this.sku = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the sellingPrice property.
     * 
     */
    public double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Sets the value of the sellingPrice property.
     * 
     */
    public void setSellingPrice(double value) {
        this.sellingPrice = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     */
    public double getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     */
    public void setTax(double value) {
        this.tax = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     */
    public double getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     */
    public void setShipping(double value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscounts(Double value) {
        this.discounts = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
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
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setListPrice(Double value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the detailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    /**
     * Sets the value of the detailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailUrl(String value) {
        this.detailUrl = value;
    }

    /**
     * Gets the value of the isGift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGift() {
        return isGift;
    }

    /**
     * Sets the value of the isGift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGift(Boolean value) {
        this.isGift = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the lockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * Sets the value of the lockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockId(String value) {
        this.lockId = value;
    }

    /**
     * Gets the value of the itemPriceTag property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemPriceTag }
     *     
     */
    public ArrayOfItemPriceTag getItemPriceTag() {
        return itemPriceTag;
    }

    /**
     * Sets the value of the itemPriceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemPriceTag }
     *     
     */
    public void setItemPriceTag(ArrayOfItemPriceTag value) {
        this.itemPriceTag = value;
    }

}
