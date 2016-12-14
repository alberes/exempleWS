
package br.com.cea.ebo.cea.ecommerce.invoice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Courier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Courier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateInscription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Plaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourierAddress" type="{http://www.cea.com.br/EBO/CEA/ecommerce/invoice/v1}Address" minOccurs="0"/>
 *         &lt;element name="CargoType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NetWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VolumeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Self" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Courier", propOrder = {
    "id",
    "name",
    "stateInscription",
    "plaque",
    "courierAddress",
    "cargoType",
    "grossWeight",
    "netWeight",
    "volumeNumber",
    "self"
})
public class Courier {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "StateInscription")
    protected String stateInscription;
    @XmlElement(name = "Plaque")
    protected String plaque;
    @XmlElement(name = "CourierAddress")
    protected Address courierAddress;
    @XmlElement(name = "CargoType", required = true)
    protected String cargoType;
    @XmlElement(name = "GrossWeight")
    protected double grossWeight;
    @XmlElement(name = "NetWeight")
    protected double netWeight;
    @XmlElement(name = "VolumeNumber")
    protected int volumeNumber;
    @XmlElement(name = "Self")
    protected String self;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the stateInscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateInscription() {
        return stateInscription;
    }

    /**
     * Sets the value of the stateInscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateInscription(String value) {
        this.stateInscription = value;
    }

    /**
     * Gets the value of the plaque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaque() {
        return plaque;
    }

    /**
     * Sets the value of the plaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaque(String value) {
        this.plaque = value;
    }

    /**
     * Gets the value of the courierAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCourierAddress() {
        return courierAddress;
    }

    /**
     * Sets the value of the courierAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCourierAddress(Address value) {
        this.courierAddress = value;
    }

    /**
     * Gets the value of the cargoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoType() {
        return cargoType;
    }

    /**
     * Sets the value of the cargoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoType(String value) {
        this.cargoType = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     */
    public double getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     */
    public void setGrossWeight(double value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     */
    public double getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     */
    public void setNetWeight(double value) {
        this.netWeight = value;
    }

    /**
     * Gets the value of the volumeNumber property.
     * 
     */
    public int getVolumeNumber() {
        return volumeNumber;
    }

    /**
     * Sets the value of the volumeNumber property.
     * 
     */
    public void setVolumeNumber(int value) {
        this.volumeNumber = value;
    }

    /**
     * Gets the value of the self property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelf() {
        return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelf(String value) {
        this.self = value;
    }

}
