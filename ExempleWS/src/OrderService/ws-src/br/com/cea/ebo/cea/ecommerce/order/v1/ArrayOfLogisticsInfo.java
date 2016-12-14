
package br.com.cea.ebo.cea.ecommerce.order.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLogisticsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLogisticsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogisticsInfo" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}LogisticsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLogisticsInfo", propOrder = {
    "logisticsInfo"
})
public class ArrayOfLogisticsInfo {

    @XmlElement(name = "LogisticsInfo")
    protected List<LogisticsInfo> logisticsInfo;

    /**
     * Gets the value of the logisticsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logisticsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogisticsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogisticsInfo }
     * 
     * 
     */
    public List<LogisticsInfo> getLogisticsInfo() {
        if (logisticsInfo == null) {
            logisticsInfo = new ArrayList<LogisticsInfo>();
        }
        return this.logisticsInfo;
    }

}
