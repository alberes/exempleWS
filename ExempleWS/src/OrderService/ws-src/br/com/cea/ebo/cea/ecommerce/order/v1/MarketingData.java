
package br.com.cea.ebo.cea.ecommerce.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtmCampaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtmMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtmPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtmSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtmiCampaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtmiPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtmiPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingData", propOrder = {
    "coupon",
    "id",
    "utmCampaign",
    "utmMedium",
    "utmPartner",
    "utmSource",
    "utmiCampaign",
    "utmiPage",
    "utmiPart"
})
public class MarketingData {

    @XmlElement(name = "Coupon")
    protected String coupon;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "UtmCampaign")
    protected String utmCampaign;
    @XmlElement(name = "UtmMedium")
    protected String utmMedium;
    @XmlElement(name = "UtmPartner")
    protected String utmPartner;
    @XmlElement(name = "UtmSource")
    protected String utmSource;
    @XmlElement(name = "UtmiCampaign")
    protected String utmiCampaign;
    @XmlElement(name = "UtmiPage")
    protected String utmiPage;
    @XmlElement(name = "UtmiPart")
    protected String utmiPart;

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon(String value) {
        this.coupon = value;
    }

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
     * Gets the value of the utmCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtmCampaign() {
        return utmCampaign;
    }

    /**
     * Sets the value of the utmCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtmCampaign(String value) {
        this.utmCampaign = value;
    }

    /**
     * Gets the value of the utmMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtmMedium() {
        return utmMedium;
    }

    /**
     * Sets the value of the utmMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtmMedium(String value) {
        this.utmMedium = value;
    }

    /**
     * Gets the value of the utmPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtmPartner() {
        return utmPartner;
    }

    /**
     * Sets the value of the utmPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtmPartner(String value) {
        this.utmPartner = value;
    }

    /**
     * Gets the value of the utmSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtmSource() {
        return utmSource;
    }

    /**
     * Sets the value of the utmSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtmSource(String value) {
        this.utmSource = value;
    }

    /**
     * Gets the value of the utmiCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtmiCampaign() {
        return utmiCampaign;
    }

    /**
     * Sets the value of the utmiCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtmiCampaign(String value) {
        this.utmiCampaign = value;
    }

    /**
     * Gets the value of the utmiPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtmiPage() {
        return utmiPage;
    }

    /**
     * Sets the value of the utmiPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtmiPage(String value) {
        this.utmiPage = value;
    }

    /**
     * Gets the value of the utmiPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtmiPart() {
        return utmiPart;
    }

    /**
     * Sets the value of the utmiPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtmiPart(String value) {
        this.utmiPart = value;
    }

}
