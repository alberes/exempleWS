
package br.com.cea.ebs.cea.ecommerce.cartaopl.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CartaoPL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CartaoPL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdPgto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumPedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumSeqPedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DtMovLog" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TipTransac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PlnCredit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01000"/>
 *               &lt;enumeration value="03002"/>
 *               &lt;enumeration value="03003"/>
 *               &lt;enumeration value="03004"/>
 *               &lt;enumeration value="03005"/>
 *               &lt;enumeration value="03032"/>
 *               &lt;enumeration value="03033"/>
 *               &lt;enumeration value="03034"/>
 *               &lt;enumeration value="03035"/>
 *               &lt;enumeration value="03036"/>
 *               &lt;enumeration value="03037"/>
 *               &lt;enumeration value="03038"/>
 *               &lt;enumeration value="03039"/>
 *               &lt;enumeration value="03040"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumCartao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VlrPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodOrpag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="010"/>
 *               &lt;enumeration value="011"/>
 *               &lt;enumeration value="013"/>
 *               &lt;enumeration value="016"/>
 *               &lt;enumeration value="017"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumParc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RespCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodAutorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FoneCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartaoPL", propOrder = {
    "idPgto",
    "numPedido",
    "numSeqPedido",
    "dtMovLog",
    "tipTransac",
    "plnCredit",
    "numCartao",
    "vlrPago",
    "data",
    "codOrpag",
    "numParc",
    "respCode",
    "retCode",
    "reasonCode",
    "codAutorizacao",
    "cpf",
    "foneCliente",
    "descRetorno"
})
public class CartaoPL {

    @XmlElement(name = "IdPgto", required = true)
    protected String idPgto;
    @XmlElement(name = "NumPedido", required = true)
    protected String numPedido;
    @XmlElement(name = "NumSeqPedido", required = true)
    protected String numSeqPedido;
    @XmlElement(name = "DtMovLog", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtMovLog;
    @XmlElement(name = "TipTransac", required = true)
    protected String tipTransac;
    @XmlElement(name = "PlnCredit", required = true)
    protected String plnCredit;
    @XmlElement(name = "NumCartao", required = true)
    protected String numCartao;
    @XmlElement(name = "VlrPago", required = true)
    protected String vlrPago;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "CodOrpag", required = true)
    protected String codOrpag;
    @XmlElement(name = "NumParc")
    protected int numParc;
    @XmlElement(name = "RespCode")
    protected String respCode;
    @XmlElement(name = "RetCode")
    protected String retCode;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "CodAutorizacao")
    protected String codAutorizacao;
    protected String cpf;
    @XmlElement(name = "FoneCliente")
    protected String foneCliente;
    @XmlElement(name = "DescRetorno")
    protected String descRetorno;

    /**
     * Gets the value of the idPgto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPgto() {
        return idPgto;
    }

    /**
     * Sets the value of the idPgto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPgto(String value) {
        this.idPgto = value;
    }

    /**
     * Gets the value of the numPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPedido() {
        return numPedido;
    }

    /**
     * Sets the value of the numPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPedido(String value) {
        this.numPedido = value;
    }

    /**
     * Gets the value of the numSeqPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSeqPedido() {
        return numSeqPedido;
    }

    /**
     * Sets the value of the numSeqPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSeqPedido(String value) {
        this.numSeqPedido = value;
    }

    /**
     * Gets the value of the dtMovLog property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtMovLog() {
        return dtMovLog;
    }

    /**
     * Sets the value of the dtMovLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtMovLog(XMLGregorianCalendar value) {
        this.dtMovLog = value;
    }

    /**
     * Gets the value of the tipTransac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipTransac() {
        return tipTransac;
    }

    /**
     * Sets the value of the tipTransac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipTransac(String value) {
        this.tipTransac = value;
    }

    /**
     * Gets the value of the plnCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlnCredit() {
        return plnCredit;
    }

    /**
     * Sets the value of the plnCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlnCredit(String value) {
        this.plnCredit = value;
    }

    /**
     * Gets the value of the numCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCartao() {
        return numCartao;
    }

    /**
     * Sets the value of the numCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCartao(String value) {
        this.numCartao = value;
    }

    /**
     * Gets the value of the vlrPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlrPago() {
        return vlrPago;
    }

    /**
     * Sets the value of the vlrPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlrPago(String value) {
        this.vlrPago = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the codOrpag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrpag() {
        return codOrpag;
    }

    /**
     * Sets the value of the codOrpag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrpag(String value) {
        this.codOrpag = value;
    }

    /**
     * Gets the value of the numParc property.
     * 
     */
    public int getNumParc() {
        return numParc;
    }

    /**
     * Sets the value of the numParc property.
     * 
     */
    public void setNumParc(int value) {
        this.numParc = value;
    }

    /**
     * Gets the value of the respCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCode(String value) {
        this.respCode = value;
    }

    /**
     * Gets the value of the retCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCode() {
        return retCode;
    }

    /**
     * Sets the value of the retCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCode(String value) {
        this.retCode = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the codAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAutorizacao() {
        return codAutorizacao;
    }

    /**
     * Sets the value of the codAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAutorizacao(String value) {
        this.codAutorizacao = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
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
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the foneCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoneCliente() {
        return foneCliente;
    }

    /**
     * Sets the value of the foneCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoneCliente(String value) {
        this.foneCliente = value;
    }

    /**
     * Gets the value of the descRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRetorno() {
        return descRetorno;
    }

    /**
     * Sets the value of the descRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRetorno(String value) {
        this.descRetorno = value;
    }

}
