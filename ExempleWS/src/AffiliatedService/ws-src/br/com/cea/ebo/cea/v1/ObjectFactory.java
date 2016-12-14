
package br.com.cea.ebo.cea.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.cea.ebo.cea.v1 package. 
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

    private final static QName _BusinessFault_QNAME = new QName("http://www.cea.com.br/EBO/CEA/v1", "BusinessFault");
    private final static QName _MetaInformacao_QNAME = new QName("http://www.cea.com.br/EBO/CEA/v1", "MetaInformacao");
    private final static QName _TechnicalFault_QNAME = new QName("http://www.cea.com.br/EBO/CEA/v1", "TechnicalFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.cea.ebo.cea.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link BusinessFaultType }
     * 
     */
    public BusinessFaultType createBusinessFaultType() {
        return new BusinessFaultType();
    }

    /**
     * Create an instance of {@link MetaInfType }
     * 
     */
    public MetaInfType createMetaInfType() {
        return new MetaInfType();
    }

    /**
     * Create an instance of {@link TechnicalFaultType }
     * 
     */
    public TechnicalFaultType createTechnicalFaultType() {
        return new TechnicalFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cea.com.br/EBO/CEA/v1", name = "BusinessFault")
    public JAXBElement<BusinessFaultType> createBusinessFault(BusinessFaultType value) {
        return new JAXBElement<BusinessFaultType>(_BusinessFault_QNAME, BusinessFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaInfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cea.com.br/EBO/CEA/v1", name = "MetaInformacao")
    public JAXBElement<MetaInfType> createMetaInformacao(MetaInfType value) {
        return new JAXBElement<MetaInfType>(_MetaInformacao_QNAME, MetaInfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cea.com.br/EBO/CEA/v1", name = "TechnicalFault")
    public JAXBElement<TechnicalFaultType> createTechnicalFault(TechnicalFaultType value) {
        return new JAXBElement<TechnicalFaultType>(_TechnicalFault_QNAME, TechnicalFaultType.class, null, value);
    }

}
