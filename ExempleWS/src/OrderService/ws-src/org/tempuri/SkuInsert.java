
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vtex_commerce_webapps_adminwcfservice.ArrayOfStockKeepingUnitDTO;


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
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skuCollection" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfStockKeepingUnitDTO" minOccurs="0"/>
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
    "instanceId",
    "skuCollection"
})
@XmlRootElement(name = "SkuInsert")
public class SkuInsert {

    @XmlElementRef(name = "instanceId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<String> instanceId;
    @XmlElementRef(name = "skuCollection", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStockKeepingUnitDTO> skuCollection;

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceId(JAXBElement<String> value) {
        this.instanceId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the skuCollection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockKeepingUnitDTO> getSkuCollection() {
        return skuCollection;
    }

    /**
     * Sets the value of the skuCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}
     *     
     */
    public void setSkuCollection(JAXBElement<ArrayOfStockKeepingUnitDTO> value) {
        this.skuCollection = ((JAXBElement<ArrayOfStockKeepingUnitDTO> ) value);
    }

}
