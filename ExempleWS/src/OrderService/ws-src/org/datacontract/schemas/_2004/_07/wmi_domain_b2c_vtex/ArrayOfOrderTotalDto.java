
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderTotalDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderTotalDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderTotalDto" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}OrderTotalDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderTotalDto", propOrder = {
    "orderTotalDto"
})
public class ArrayOfOrderTotalDto {

    @XmlElement(name = "OrderTotalDto", nillable = true)
    protected List<OrderTotalDto> orderTotalDto;

    /**
     * Gets the value of the orderTotalDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderTotalDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderTotalDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderTotalDto }
     * 
     * 
     */
    public List<OrderTotalDto> getOrderTotalDto() {
        if (orderTotalDto == null) {
            orderTotalDto = new ArrayList<OrderTotalDto>();
        }
        return this.orderTotalDto;
    }

}
