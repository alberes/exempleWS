
package br.com.cea.ebs.cea.ecommerce.affiliated.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Affiliated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Affiliated">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Matricula" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CPF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ATIVO"/>
 *               &lt;enumeration value="INATIVO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Affiliated", propOrder = {
    "matricula",
    "cpf",
    "status"
})
public class Affiliated {

    @XmlElement(name = "Matricula")
    protected long matricula;
    @XmlElement(name = "CPF", required = true)
    protected String cpf;
    @XmlElement(name = "Status", required = true)
    protected String status;

    /**
     * Gets the value of the matricula property.
     * 
     */
    public long getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     */
    public void setMatricula(long value) {
        this.matricula = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
