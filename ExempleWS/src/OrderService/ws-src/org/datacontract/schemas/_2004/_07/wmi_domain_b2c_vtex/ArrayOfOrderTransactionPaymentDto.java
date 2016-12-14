
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderTransactionPaymentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderTransactionPaymentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderTransactionPaymentDto" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}OrderTransactionPaymentDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderTransactionPaymentDto", propOrder = {
    "orderTransactionPaymentDto"
})
public class ArrayOfOrderTransactionPaymentDto {

    @XmlElement(name = "OrderTransactionPaymentDto", nillable = true)
    protected List<OrderTransactionPaymentDto> orderTransactionPaymentDto;

    /**
     * Gets the value of the orderTransactionPaymentDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderTransactionPaymentDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderTransactionPaymentDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderTransactionPaymentDto }
     * 
     * 
     */
    public List<OrderTransactionPaymentDto> getOrderTransactionPaymentDto() {
        if (orderTransactionPaymentDto == null) {
            orderTransactionPaymentDto = new ArrayList<OrderTransactionPaymentDto>();
        }
        return this.orderTransactionPaymentDto;
    }

}
