
package br.com.cea.ebo.cea.ecommerce.order.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTotals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Totals" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}Totals" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTotals", propOrder = {
    "totals"
})
public class ArrayOfTotals {

    @XmlElement(name = "Totals")
    protected List<Totals> totals;

    /**
     * Gets the value of the totals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Totals }
     * 
     * 
     */
    public List<Totals> getTotals() {
        if (totals == null) {
            totals = new ArrayList<Totals>();
        }
        return this.totals;
    }

}
