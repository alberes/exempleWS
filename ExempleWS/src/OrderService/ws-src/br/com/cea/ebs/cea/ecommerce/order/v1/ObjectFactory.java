
package br.com.cea.ebs.cea.ecommerce.order.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.cea.ebs.cea.ecommerce.order.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.cea.ebs.cea.ecommerce.order.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link OrderRequest }
     * 
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link OrderConfirmRequest }
     * 
     */
    public OrderConfirmRequest createOrderConfirmRequest() {
        return new OrderConfirmRequest();
    }

    /**
     * Create an instance of {@link OrderConfirmResponse }
     * 
     */
    public OrderConfirmResponse createOrderConfirmResponse() {
        return new OrderConfirmResponse();
    }

}