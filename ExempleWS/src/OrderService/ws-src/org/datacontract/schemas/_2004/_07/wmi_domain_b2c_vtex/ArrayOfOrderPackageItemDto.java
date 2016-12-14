
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderPackageItemDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderPackageItemDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderPackageItemDto" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}OrderPackageItemDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderPackageItemDto", propOrder = {
    "orderPackageItemDto"
})
public class ArrayOfOrderPackageItemDto {

    @XmlElement(name = "OrderPackageItemDto", nillable = true)
    protected List<OrderPackageItemDto> orderPackageItemDto;

    /**
     * Gets the value of the orderPackageItemDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderPackageItemDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderPackageItemDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderPackageItemDto }
     * 
     * 
     */
    public List<OrderPackageItemDto> getOrderPackageItemDto() {
        if (orderPackageItemDto == null) {
            orderPackageItemDto = new ArrayList<OrderPackageItemDto>();
        }
        return this.orderPackageItemDto;
    }

}
