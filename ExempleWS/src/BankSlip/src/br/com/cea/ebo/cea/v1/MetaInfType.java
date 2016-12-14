
package br.com.cea.ebo.cea.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaInfType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaInfType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transacao-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo-aplicacao-origem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo-operacao-origem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endereco-aplicacao-origem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuario-id-origem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaInfType", propOrder = {
    "transacaoId",
    "codigoAplicacaoOrigem",
    "codigoOperacaoOrigem",
    "enderecoAplicacaoOrigem",
    "usuarioIdOrigem"
})
public class MetaInfType {

    @XmlElement(name = "transacao-id", required = true)
    protected String transacaoId;
    @XmlElement(name = "codigo-aplicacao-origem", required = true)
    protected String codigoAplicacaoOrigem;
    @XmlElement(name = "codigo-operacao-origem", required = true)
    protected String codigoOperacaoOrigem;
    @XmlElement(name = "endereco-aplicacao-origem", required = true)
    protected String enderecoAplicacaoOrigem;
    @XmlElement(name = "usuario-id-origem", required = true)
    protected String usuarioIdOrigem;

    /**
     * Gets the value of the transacaoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransacaoId() {
        return transacaoId;
    }

    /**
     * Sets the value of the transacaoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransacaoId(String value) {
        this.transacaoId = value;
    }

    /**
     * Gets the value of the codigoAplicacaoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAplicacaoOrigem() {
        return codigoAplicacaoOrigem;
    }

    /**
     * Sets the value of the codigoAplicacaoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAplicacaoOrigem(String value) {
        this.codigoAplicacaoOrigem = value;
    }

    /**
     * Gets the value of the codigoOperacaoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOperacaoOrigem() {
        return codigoOperacaoOrigem;
    }

    /**
     * Sets the value of the codigoOperacaoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOperacaoOrigem(String value) {
        this.codigoOperacaoOrigem = value;
    }

    /**
     * Gets the value of the enderecoAplicacaoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoAplicacaoOrigem() {
        return enderecoAplicacaoOrigem;
    }

    /**
     * Sets the value of the enderecoAplicacaoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoAplicacaoOrigem(String value) {
        this.enderecoAplicacaoOrigem = value;
    }

    /**
     * Gets the value of the usuarioIdOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioIdOrigem() {
        return usuarioIdOrigem;
    }

    /**
     * Sets the value of the usuarioIdOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioIdOrigem(String value) {
        this.usuarioIdOrigem = value;
    }

}
