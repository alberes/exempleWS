
package br.com.cea.ebs.cea.ecommerce.tracking.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.com.cea.ebo.cea.ecommerce.tracking.v1.TrackingList;


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
 *         &lt;element name="trackingList" type="{http://www.cea.com.br/EBO/CEA/ecommerce/tracking/v1}TrackingList"/>
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
    "trackingList"
})
@XmlRootElement(name = "TrackingRequest")
public class TrackingRequest {

    @XmlElement(required = true)
    protected TrackingList trackingList;

    /**
     * Gets the value of the trackingList property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingList }
     *     
     */
    public TrackingList getTrackingList() {
        return trackingList;
    }

    /**
     * Sets the value of the trackingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingList }
     *     
     */
    public void setTrackingList(TrackingList value) {
        this.trackingList = value;
    }

}
