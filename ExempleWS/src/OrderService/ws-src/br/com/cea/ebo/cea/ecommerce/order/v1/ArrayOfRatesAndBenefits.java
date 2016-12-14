
package br.com.cea.ebo.cea.ecommerce.order.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRatesAndBenefits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatesAndBenefits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatesAndBenefits" type="{http://www.cea.com.br/EBO/CEA/ecommerce/order/v1}RatesAndBenefits" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRatesAndBenefits", propOrder = {
    "ratesAndBenefits"
})
public class ArrayOfRatesAndBenefits {

    @XmlElement(name = "RatesAndBenefits")
    protected List<RatesAndBenefits> ratesAndBenefits;

    /**
     * Gets the value of the ratesAndBenefits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratesAndBenefits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatesAndBenefits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatesAndBenefits }
     * 
     * 
     */
    public List<RatesAndBenefits> getRatesAndBenefits() {
        if (ratesAndBenefits == null) {
            ratesAndBenefits = new ArrayList<RatesAndBenefits>();
        }
        return this.ratesAndBenefits;
    }

}
