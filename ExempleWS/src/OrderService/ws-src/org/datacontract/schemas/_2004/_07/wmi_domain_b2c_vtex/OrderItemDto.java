
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalInfoBrandId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdditionalInfoBrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInfoCategoriesIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInfoCommercialConditionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdditionalInfoProductClusterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bundle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BundleItems" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderItemDto" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Component" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DetailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsGift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemAttachments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemFather" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LockId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeasurementUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderItemPriceTag" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderItemPriceTagDto" minOccurs="0"/>
 *         &lt;element name="PreSaleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PriceValidUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seller" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerSku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemDto", propOrder = {
    "additionalInfoBrandId",
    "additionalInfoBrandName",
    "additionalInfoCategoriesIds",
    "additionalInfoCommercialConditionId",
    "additionalInfoProductClusterId",
    "bundle",
    "bundleItems",
    "commission",
    "component",
    "detailUrl",
    "ean",
    "id",
    "imageUrl",
    "index",
    "isGift",
    "itemAttachments",
    "itemFather",
    "listPrice",
    "lockId",
    "measurementUnit",
    "name",
    "orderItemPriceTag",
    "preSaleDate",
    "price",
    "priceValidUntil",
    "productId",
    "quantity",
    "refId",
    "seller",
    "sellerSku",
    "sellingPrice",
    "tax",
    "unitMultiplier"
})
public class OrderItemDto {

    @XmlElementRef(name = "AdditionalInfoBrandId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> additionalInfoBrandId;
    @XmlElementRef(name = "AdditionalInfoBrandName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> additionalInfoBrandName;
    @XmlElementRef(name = "AdditionalInfoCategoriesIds", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> additionalInfoCategoriesIds;
    @XmlElementRef(name = "AdditionalInfoCommercialConditionId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> additionalInfoCommercialConditionId;
    @XmlElementRef(name = "AdditionalInfoProductClusterId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> additionalInfoProductClusterId;
    @XmlElementRef(name = "Bundle", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Boolean> bundle;
    @XmlElementRef(name = "BundleItems", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderItemDto> bundleItems;
    @XmlElementRef(name = "Commission", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> commission;
    @XmlElementRef(name = "Component", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Boolean> component;
    @XmlElementRef(name = "DetailUrl", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> detailUrl;
    @XmlElementRef(name = "Ean", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> ean;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "ImageUrl", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> imageUrl;
    @XmlElementRef(name = "Index", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> index;
    @XmlElementRef(name = "IsGift", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Boolean> isGift;
    @XmlElementRef(name = "ItemAttachments", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> itemAttachments;
    @XmlElementRef(name = "ItemFather", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> itemFather;
    @XmlElementRef(name = "ListPrice", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> listPrice;
    @XmlElementRef(name = "LockId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> lockId;
    @XmlElementRef(name = "MeasurementUnit", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> measurementUnit;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "OrderItemPriceTag", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderItemPriceTagDto> orderItemPriceTag;
    @XmlElementRef(name = "PreSaleDate", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> preSaleDate;
    @XmlElementRef(name = "Price", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> price;
    @XmlElementRef(name = "PriceValidUntil", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> priceValidUntil;
    @XmlElementRef(name = "ProductId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> productId;
    @XmlElementRef(name = "Quantity", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> quantity;
    @XmlElementRef(name = "RefId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> refId;
    @XmlElementRef(name = "Seller", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> seller;
    @XmlElementRef(name = "SellerSku", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> sellerSku;
    @XmlElementRef(name = "SellingPrice", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> sellingPrice;
    @XmlElementRef(name = "Tax", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> tax;
    @XmlElementRef(name = "UnitMultiplier", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> unitMultiplier;

    /**
     * Gets the value of the additionalInfoBrandId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalInfoBrandId() {
        return additionalInfoBrandId;
    }

    /**
     * Sets the value of the additionalInfoBrandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalInfoBrandId(JAXBElement<Integer> value) {
        this.additionalInfoBrandId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the additionalInfoBrandName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInfoBrandName() {
        return additionalInfoBrandName;
    }

    /**
     * Sets the value of the additionalInfoBrandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInfoBrandName(JAXBElement<String> value) {
        this.additionalInfoBrandName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInfoCategoriesIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInfoCategoriesIds() {
        return additionalInfoCategoriesIds;
    }

    /**
     * Sets the value of the additionalInfoCategoriesIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInfoCategoriesIds(JAXBElement<String> value) {
        this.additionalInfoCategoriesIds = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the additionalInfoCommercialConditionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalInfoCommercialConditionId() {
        return additionalInfoCommercialConditionId;
    }

    /**
     * Sets the value of the additionalInfoCommercialConditionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalInfoCommercialConditionId(JAXBElement<Integer> value) {
        this.additionalInfoCommercialConditionId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the additionalInfoProductClusterId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalInfoProductClusterId() {
        return additionalInfoProductClusterId;
    }

    /**
     * Sets the value of the additionalInfoProductClusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalInfoProductClusterId(JAXBElement<String> value) {
        this.additionalInfoProductClusterId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bundle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBundle() {
        return bundle;
    }

    /**
     * Sets the value of the bundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBundle(JAXBElement<Boolean> value) {
        this.bundle = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the bundleItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderItemDto> getBundleItems() {
        return bundleItems;
    }

    /**
     * Sets the value of the bundleItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDto }{@code >}
     *     
     */
    public void setBundleItems(JAXBElement<ArrayOfOrderItemDto> value) {
        this.bundleItems = ((JAXBElement<ArrayOfOrderItemDto> ) value);
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCommission(JAXBElement<Integer> value) {
        this.commission = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setComponent(JAXBElement<Boolean> value) {
        this.component = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the detailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetailUrl() {
        return detailUrl;
    }

    /**
     * Sets the value of the detailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetailUrl(JAXBElement<String> value) {
        this.detailUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEan() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEan(JAXBElement<String> value) {
        this.ean = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setId(JAXBElement<Integer> value) {
        this.id = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImageUrl(JAXBElement<String> value) {
        this.imageUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIndex(JAXBElement<Integer> value) {
        this.index = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the isGift property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsGift() {
        return isGift;
    }

    /**
     * Sets the value of the isGift property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsGift(JAXBElement<Boolean> value) {
        this.isGift = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the itemAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemAttachments() {
        return itemAttachments;
    }

    /**
     * Sets the value of the itemAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemAttachments(JAXBElement<String> value) {
        this.itemAttachments = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the itemFather property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemFather() {
        return itemFather;
    }

    /**
     * Sets the value of the itemFather property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemFather(JAXBElement<String> value) {
        this.itemFather = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setListPrice(JAXBElement<Integer> value) {
        this.listPrice = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the lockId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLockId() {
        return lockId;
    }

    /**
     * Sets the value of the lockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLockId(JAXBElement<String> value) {
        this.lockId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Sets the value of the measurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeasurementUnit(JAXBElement<String> value) {
        this.measurementUnit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderItemPriceTag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemPriceTagDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderItemPriceTagDto> getOrderItemPriceTag() {
        return orderItemPriceTag;
    }

    /**
     * Sets the value of the orderItemPriceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemPriceTagDto }{@code >}
     *     
     */
    public void setOrderItemPriceTag(JAXBElement<ArrayOfOrderItemPriceTagDto> value) {
        this.orderItemPriceTag = ((JAXBElement<ArrayOfOrderItemPriceTagDto> ) value);
    }

    /**
     * Gets the value of the preSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreSaleDate() {
        return preSaleDate;
    }

    /**
     * Sets the value of the preSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreSaleDate(JAXBElement<String> value) {
        this.preSaleDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrice(JAXBElement<Integer> value) {
        this.price = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the priceValidUntil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceValidUntil() {
        return priceValidUntil;
    }

    /**
     * Sets the value of the priceValidUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceValidUntil(JAXBElement<String> value) {
        this.priceValidUntil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProductId(JAXBElement<Integer> value) {
        this.productId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQuantity(JAXBElement<Integer> value) {
        this.quantity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefId(JAXBElement<String> value) {
        this.refId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSeller(JAXBElement<Integer> value) {
        this.seller = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sellerSku property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellerSku() {
        return sellerSku;
    }

    /**
     * Sets the value of the sellerSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellerSku(JAXBElement<String> value) {
        this.sellerSku = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Sets the value of the sellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSellingPrice(JAXBElement<Integer> value) {
        this.sellingPrice = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTax(JAXBElement<Integer> value) {
        this.tax = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the unitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * Sets the value of the unitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUnitMultiplier(JAXBElement<Integer> value) {
        this.unitMultiplier = ((JAXBElement<Integer> ) value);
    }

}
