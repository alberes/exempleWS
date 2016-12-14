
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderLogisticsInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderLogisticsInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderLogisticsInfoDto" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}OrderLogisticsInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderLogisticsInfoDto", propOrder = {
    "orderLogisticsInfoDto"
})
public class ArrayOfOrderLogisticsInfoDto {

    @XmlElement(name = "OrderLogisticsInfoDto", nillable = true)
    protected List<OrderLogisticsInfoDto> orderLogisticsInfoDto;

    /**
     * Gets the value of the orderLogisticsInfoDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLogisticsInfoDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLogisticsInfoDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLogisticsInfoDto }
     * 
     * 
     */
    public List<OrderLogisticsInfoDto> getOrderLogisticsInfoDto() {
        if (orderLogisticsInfoDto == null) {
            orderLogisticsInfoDto = new ArrayList<OrderLogisticsInfoDto>();
        }
        return this.orderLogisticsInfoDto;
    }

}
