
package br.com.cea.ebs.cea.ecommerce.invoice.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.cea.ebs.cea.ecommerce.invoice.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.cea.ebs.cea.ecommerce.invoice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PreInvoiceRequest }
     * 
     */
    public PreInvoiceRequest createPreInvoiceRequest() {
        return new PreInvoiceRequest();
    }

    /**
     * Create an instance of {@link InvoiceResponse }
     * 
     */
    public InvoiceResponse createInvoiceResponse() {
        return new InvoiceResponse();
    }

    /**
     * Create an instance of {@link PreInvoiceResponse }
     * 
     */
    public PreInvoiceResponse createPreInvoiceResponse() {
        return new PreInvoiceResponse();
    }

    /**
     * Create an instance of {@link InvoiceRequest }
     * 
     */
    public InvoiceRequest createInvoiceRequest() {
        return new InvoiceRequest();
    }

}