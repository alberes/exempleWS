
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.vtex_commerce_webapps_adminwcfservice.ArrayOfProductDTO;
import org.datacontract.schemas._2004._07.vtex_commerce_webapps_adminwcfservice.ArrayOfStockKeepingUnitDTO;
import org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex.ArrayOfInvoiceConfirmDto;
import org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex.ArrayOfInvoiceDto;
import org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex.ArrayOfOrderDto;
import org.datacontract.schemas._2004._07.wmi_domain_business.ServiceResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ProductInsertProductCollection_QNAME = new QName("http://tempuri.org/", "productCollection");
    private final static QName _ProductInsertInstanceId_QNAME = new QName("http://tempuri.org/", "instanceId");
    private final static QName _OrderConfirmResponseOrderConfirmResult_QNAME = new QName("http://tempuri.org/", "OrderConfirmResult");
    private final static QName _InvoiceGetNewResponseInvoiceGetNewResult_QNAME = new QName("http://tempuri.org/", "InvoiceGetNewResult");
    private final static QName _ProductInsertResponseProductInsertResult_QNAME = new QName("http://tempuri.org/", "ProductInsertResult");
    private final static QName _OrderConfirmListOrderIdConfirmation_QNAME = new QName("http://tempuri.org/", "listOrderIdConfirmation");
    private final static QName _InvoiceConfirmListId_QNAME = new QName("http://tempuri.org/", "listId");
    private final static QName _OrderGetNewResponseOrderGetNewResult_QNAME = new QName("http://tempuri.org/", "OrderGetNewResult");
    private final static QName _SkuInsertSkuCollection_QNAME = new QName("http://tempuri.org/", "skuCollection");
    private final static QName _InvoiceConfirmResponseInvoiceConfirmResult_QNAME = new QName("http://tempuri.org/", "InvoiceConfirmResult");
    private final static QName _SkuInsertResponseSkuInsertResult_QNAME = new QName("http://tempuri.org/", "SkuInsertResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderConfirmResponse }
     * 
     */
    public OrderConfirmResponse createOrderConfirmResponse() {
        return new OrderConfirmResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetNew }
     * 
     */
    public InvoiceGetNew createInvoiceGetNew() {
        return new InvoiceGetNew();
    }

    /**
     * Create an instance of {@link OrderGetNewResponse }
     * 
     */
    public OrderGetNewResponse createOrderGetNewResponse() {
        return new OrderGetNewResponse();
    }

    /**
     * Create an instance of {@link InvoiceConfirm }
     * 
     */
    public InvoiceConfirm createInvoiceConfirm() {
        return new InvoiceConfirm();
    }

    /**
     * Create an instance of {@link OrderGetNew }
     * 
     */
    public OrderGetNew createOrderGetNew() {
        return new OrderGetNew();
    }

    /**
     * Create an instance of {@link ProductInsert }
     * 
     */
    public ProductInsert createProductInsert() {
        return new ProductInsert();
    }

    /**
     * Create an instance of {@link InvoiceGetNewResponse }
     * 
     */
    public InvoiceGetNewResponse createInvoiceGetNewResponse() {
        return new InvoiceGetNewResponse();
    }

    /**
     * Create an instance of {@link ProductInsertResponse }
     * 
     */
    public ProductInsertResponse createProductInsertResponse() {
        return new ProductInsertResponse();
    }

    /**
     * Create an instance of {@link OrderConfirm }
     * 
     */
    public OrderConfirm createOrderConfirm() {
        return new OrderConfirm();
    }

    /**
     * Create an instance of {@link SkuInsert }
     * 
     */
    public SkuInsert createSkuInsert() {
        return new SkuInsert();
    }

    /**
     * Create an instance of {@link InvoiceConfirmResponse }
     * 
     */
    public InvoiceConfirmResponse createInvoiceConfirmResponse() {
        return new InvoiceConfirmResponse();
    }

    /**
     * Create an instance of {@link SkuInsertResponse }
     * 
     */
    public SkuInsertResponse createSkuInsertResponse() {
        return new SkuInsertResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "productCollection", scope = ProductInsert.class)
    public JAXBElement<ArrayOfProductDTO> createProductInsertProductCollection(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_ProductInsertProductCollection_QNAME, ArrayOfProductDTO.class, ProductInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "instanceId", scope = ProductInsert.class)
    public JAXBElement<String> createProductInsertInstanceId(String value) {
        return new JAXBElement<String>(_ProductInsertInstanceId_QNAME, String.class, ProductInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderConfirmResult", scope = OrderConfirmResponse.class)
    public JAXBElement<ServiceResponse> createOrderConfirmResponseOrderConfirmResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_OrderConfirmResponseOrderConfirmResult_QNAME, ServiceResponse.class, OrderConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "instanceId", scope = InvoiceGetNew.class)
    public JAXBElement<String> createInvoiceGetNewInstanceId(String value) {
        return new JAXBElement<String>(_ProductInsertInstanceId_QNAME, String.class, InvoiceGetNew.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InvoiceGetNewResult", scope = InvoiceGetNewResponse.class)
    public JAXBElement<ArrayOfInvoiceDto> createInvoiceGetNewResponseInvoiceGetNewResult(ArrayOfInvoiceDto value) {
        return new JAXBElement<ArrayOfInvoiceDto>(_InvoiceGetNewResponseInvoiceGetNewResult_QNAME, ArrayOfInvoiceDto.class, InvoiceGetNewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProductInsertResult", scope = ProductInsertResponse.class)
    public JAXBElement<ServiceResponse> createProductInsertResponseProductInsertResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ProductInsertResponseProductInsertResult_QNAME, ServiceResponse.class, ProductInsertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listOrderIdConfirmation", scope = OrderConfirm.class)
    public JAXBElement<ArrayOfstring> createOrderConfirmListOrderIdConfirmation(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_OrderConfirmListOrderIdConfirmation_QNAME, ArrayOfstring.class, OrderConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "instanceId", scope = OrderConfirm.class)
    public JAXBElement<String> createOrderConfirmInstanceId(String value) {
        return new JAXBElement<String>(_ProductInsertInstanceId_QNAME, String.class, OrderConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInvoiceConfirmDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "listId", scope = InvoiceConfirm.class)
    public JAXBElement<ArrayOfInvoiceConfirmDto> createInvoiceConfirmListId(ArrayOfInvoiceConfirmDto value) {
        return new JAXBElement<ArrayOfInvoiceConfirmDto>(_InvoiceConfirmListId_QNAME, ArrayOfInvoiceConfirmDto.class, InvoiceConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "instanceId", scope = InvoiceConfirm.class)
    public JAXBElement<String> createInvoiceConfirmInstanceId(String value) {
        return new JAXBElement<String>(_ProductInsertInstanceId_QNAME, String.class, InvoiceConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OrderGetNewResult", scope = OrderGetNewResponse.class)
    public JAXBElement<ArrayOfOrderDto> createOrderGetNewResponseOrderGetNewResult(ArrayOfOrderDto value) {
        return new JAXBElement<ArrayOfOrderDto>(_OrderGetNewResponseOrderGetNewResult_QNAME, ArrayOfOrderDto.class, OrderGetNewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "instanceId", scope = OrderGetNew.class)
    public JAXBElement<String> createOrderGetNewInstanceId(String value) {
        return new JAXBElement<String>(_ProductInsertInstanceId_QNAME, String.class, OrderGetNew.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "skuCollection", scope = SkuInsert.class)
    public JAXBElement<ArrayOfStockKeepingUnitDTO> createSkuInsertSkuCollection(ArrayOfStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitDTO>(_SkuInsertSkuCollection_QNAME, ArrayOfStockKeepingUnitDTO.class, SkuInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "instanceId", scope = SkuInsert.class)
    public JAXBElement<String> createSkuInsertInstanceId(String value) {
        return new JAXBElement<String>(_ProductInsertInstanceId_QNAME, String.class, SkuInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InvoiceConfirmResult", scope = InvoiceConfirmResponse.class)
    public JAXBElement<ServiceResponse> createInvoiceConfirmResponseInvoiceConfirmResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_InvoiceConfirmResponseInvoiceConfirmResult_QNAME, ServiceResponse.class, InvoiceConfirmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SkuInsertResult", scope = SkuInsertResponse.class)
    public JAXBElement<ServiceResponse> createSkuInsertResponseSkuInsertResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SkuInsertResponseSkuInsertResult_QNAME, ServiceResponse.class, SkuInsertResponse.class, value);
    }

}
