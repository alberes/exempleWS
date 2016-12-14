
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderItemPriceTagDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderItemPriceTagDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderItemPriceTagDto" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}OrderItemPriceTagDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderItemPriceTagDto", propOrder = {
    "orderItemPriceTagDto"
})
public class ArrayOfOrderItemPriceTagDto {

    @XmlElement(name = "OrderItemPriceTagDto", nillable = true)
    protected List<OrderItemPriceTagDto> orderItemPriceTagDto;

    /**
     * Gets the value of the orderItemPriceTagDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemPriceTagDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemPriceTagDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemPriceTagDto }
     * 
     * 
     */
    public List<OrderItemPriceTagDto> getOrderItemPriceTagDto() {
        if (orderItemPriceTagDto == null) {
            orderItemPriceTagDto = new ArrayList<OrderItemPriceTagDto>();
        }
        return this.orderItemPriceTagDto;
    }

}
