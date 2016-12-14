
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemPriceTagDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemPriceTagDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPercentual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemPriceTagDto", propOrder = {
    "identifier",
    "isPercentual",
    "name",
    "value"
})
public class OrderItemPriceTagDto {

    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "IsPercentual", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Boolean> isPercentual;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> value;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the isPercentual property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPercentual() {
        return isPercentual;
    }

    /**
     * Sets the value of the isPercentual property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPercentual(JAXBElement<Boolean> value) {
        this.isPercentual = ((JAXBElement<Boolean> ) value);
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setValue(JAXBElement<Integer> value) {
        this.value = ((JAXBElement<Integer> ) value);
    }

}
