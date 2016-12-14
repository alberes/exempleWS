
package br.com.cea.ebo.cea.ecommerce.order.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChangesDataItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChangesDataItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangesDataItem" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}ChangesDataItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChangesDataItem", propOrder = {
    "changesDataItem"
})
public class ArrayOfChangesDataItem {

    @XmlElement(name = "ChangesDataItem")
    protected List<ChangesDataItem> changesDataItem;

    /**
     * Gets the value of the changesDataItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changesDataItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangesDataItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangesDataItem }
     * 
     * 
     */
    public List<ChangesDataItem> getChangesDataItem() {
        if (changesDataItem == null) {
            changesDataItem = new ArrayList<ChangesDataItem>();
        }
        return this.changesDataItem;
    }

}
