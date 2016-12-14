
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderLogisticsDeliveryIdDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLogisticsDeliveryIdDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DockId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarehouseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLogisticsDeliveryIdDto", propOrder = {
    "courierId",
    "courierName",
    "dockId",
    "quantity",
    "warehouseId"
})
public class OrderLogisticsDeliveryIdDto {

    @XmlElementRef(name = "CourierId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> courierId;
    @XmlElementRef(name = "CourierName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> courierName;
    @XmlElementRef(name = "DockId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> dockId;
    @XmlElementRef(name = "Quantity", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> quantity;
    @XmlElementRef(name = "WarehouseId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> warehouseId;

    /**
     * Gets the value of the courierId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCourierId() {
        return courierId;
    }

    /**
     * Sets the value of the courierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCourierId(JAXBElement<String> value) {
        this.courierId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the courierName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCourierName() {
        return courierName;
    }

    /**
     * Sets the value of the courierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCourierName(JAXBElement<String> value) {
        this.courierName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dockId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDockId() {
        return dockId;
    }

    /**
     * Sets the value of the dockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDockId(JAXBElement<String> value) {
        this.dockId = ((JAXBElement<String> ) value);
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
     * Gets the value of the warehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarehouseId() {
        return warehouseId;
    }

    /**
     * Sets the value of the warehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarehouseId(JAXBElement<String> value) {
        this.warehouseId = ((JAXBElement<String> ) value);
    }

}
