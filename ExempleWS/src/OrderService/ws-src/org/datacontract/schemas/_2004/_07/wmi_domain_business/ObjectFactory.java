
package org.datacontract.schemas._2004._07.wmi_domain_business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wmi_domain_business package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Detail_QNAME = new QName("http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", "Detail");
    private final static QName _ArrayOfDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", "ArrayOfDetail");
    private final static QName _ServiceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", "ServiceResponse");
    private final static QName _DetailItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", "ItemId");
    private final static QName _DetailMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", "Message");
    private final static QName _ServiceResponseDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", "Details");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wmi_domain_business
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDetail }
     * 
     */
    public ArrayOfDetail createArrayOfDetail() {
        return new ArrayOfDetail();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Detail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", name = "Detail")
    public JAXBElement<Detail> createDetail(Detail value) {
        return new JAXBElement<Detail>(_Detail_QNAME, Detail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", name = "ArrayOfDetail")
    public JAXBElement<ArrayOfDetail> createArrayOfDetail(ArrayOfDetail value) {
        return new JAXBElement<ArrayOfDetail>(_ArrayOfDetail_QNAME, ArrayOfDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", name = "ServiceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", name = "ItemId", scope = Detail.class)
    public JAXBElement<String> createDetailItemId(String value) {
        return new JAXBElement<String>(_DetailItemId_QNAME, String.class, Detail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", name = "Message", scope = Detail.class)
    public JAXBElement<String> createDetailMessage(String value) {
        return new JAXBElement<String>(_DetailMessage_QNAME, String.class, Detail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", name = "Message", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseMessage(String value) {
        return new JAXBElement<String>(_DetailMessage_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.Business.Vtex", name = "Details", scope = ServiceResponse.class)
    public JAXBElement<ArrayOfDetail> createServiceResponseDetails(ArrayOfDetail value) {
        return new JAXBElement<ArrayOfDetail>(_ServiceResponseDetails_QNAME, ArrayOfDetail.class, ServiceResponse.class, value);
    }

}
