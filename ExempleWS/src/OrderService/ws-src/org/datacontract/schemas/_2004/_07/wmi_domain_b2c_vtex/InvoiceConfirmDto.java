
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceConfirmDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceConfirmDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FiscalDocumentAcessKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentAttachmentContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentAttachmentContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentAttachmentFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentAttachmentUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentEmbeddedDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentIssuanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalDocumentValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceConfirmDto", propOrder = {
    "fiscalDocumentAcessKey",
    "fiscalDocumentAttachmentContent",
    "fiscalDocumentAttachmentContentType",
    "fiscalDocumentAttachmentFileName",
    "fiscalDocumentAttachmentUrl",
    "fiscalDocumentEmbeddedDocument",
    "fiscalDocumentId",
    "fiscalDocumentIssuanceDate",
    "fiscalDocumentUrl",
    "fiscalDocumentValue",
    "id"
})
public class InvoiceConfirmDto {

    @XmlElementRef(name = "FiscalDocumentAcessKey", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentAcessKey;
    @XmlElementRef(name = "FiscalDocumentAttachmentContent", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentAttachmentContent;
    @XmlElementRef(name = "FiscalDocumentAttachmentContentType", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentAttachmentContentType;
    @XmlElementRef(name = "FiscalDocumentAttachmentFileName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentAttachmentFileName;
    @XmlElementRef(name = "FiscalDocumentAttachmentUrl", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentAttachmentUrl;
    @XmlElementRef(name = "FiscalDocumentEmbeddedDocument", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentEmbeddedDocument;
    @XmlElementRef(name = "FiscalDocumentId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentId;
    @XmlElementRef(name = "FiscalDocumentIssuanceDate", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentIssuanceDate;
    @XmlElementRef(name = "FiscalDocumentUrl", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> fiscalDocumentUrl;
    @XmlElement(name = "FiscalDocumentValue")
    protected Integer fiscalDocumentValue;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> id;

    /**
     * Gets the value of the fiscalDocumentAcessKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentAcessKey() {
        return fiscalDocumentAcessKey;
    }

    /**
     * Sets the value of the fiscalDocumentAcessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentAcessKey(JAXBElement<String> value) {
        this.fiscalDocumentAcessKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentAttachmentContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentAttachmentContent() {
        return fiscalDocumentAttachmentContent;
    }

    /**
     * Sets the value of the fiscalDocumentAttachmentContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentAttachmentContent(JAXBElement<String> value) {
        this.fiscalDocumentAttachmentContent = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentAttachmentContentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentAttachmentContentType() {
        return fiscalDocumentAttachmentContentType;
    }

    /**
     * Sets the value of the fiscalDocumentAttachmentContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentAttachmentContentType(JAXBElement<String> value) {
        this.fiscalDocumentAttachmentContentType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentAttachmentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentAttachmentFileName() {
        return fiscalDocumentAttachmentFileName;
    }

    /**
     * Sets the value of the fiscalDocumentAttachmentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentAttachmentFileName(JAXBElement<String> value) {
        this.fiscalDocumentAttachmentFileName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentAttachmentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentAttachmentUrl() {
        return fiscalDocumentAttachmentUrl;
    }

    /**
     * Sets the value of the fiscalDocumentAttachmentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentAttachmentUrl(JAXBElement<String> value) {
        this.fiscalDocumentAttachmentUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentEmbeddedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentEmbeddedDocument() {
        return fiscalDocumentEmbeddedDocument;
    }

    /**
     * Sets the value of the fiscalDocumentEmbeddedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentEmbeddedDocument(JAXBElement<String> value) {
        this.fiscalDocumentEmbeddedDocument = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentId() {
        return fiscalDocumentId;
    }

    /**
     * Sets the value of the fiscalDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentId(JAXBElement<String> value) {
        this.fiscalDocumentId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentIssuanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentIssuanceDate() {
        return fiscalDocumentIssuanceDate;
    }

    /**
     * Sets the value of the fiscalDocumentIssuanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentIssuanceDate(JAXBElement<String> value) {
        this.fiscalDocumentIssuanceDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalDocumentUrl() {
        return fiscalDocumentUrl;
    }

    /**
     * Sets the value of the fiscalDocumentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalDocumentUrl(JAXBElement<String> value) {
        this.fiscalDocumentUrl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscalDocumentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFiscalDocumentValue() {
        return fiscalDocumentValue;
    }

    /**
     * Sets the value of the fiscalDocumentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFiscalDocumentValue(Integer value) {
        this.fiscalDocumentValue = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = ((JAXBElement<String> ) value);
    }

}
