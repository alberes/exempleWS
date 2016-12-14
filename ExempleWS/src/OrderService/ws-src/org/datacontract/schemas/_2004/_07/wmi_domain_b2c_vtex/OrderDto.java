
package org.datacontract.schemas._2004._07.wmi_domain_b2c_vtex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffiliateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallCenterOperatorDataEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallCenterOperatorDataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallCenterOperatorDataUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangesAttachment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataCorporateDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataCorporateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataCorporatePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataIsCorporate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataStateInscription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataTradeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientProfileDataUserProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataHoraInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FollowUpEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdInstancia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataCoupon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataUtmCampaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataUtmMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataUtmPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataUtmSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataUtmiCampaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataUtmiPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataUtmiPart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketplaceOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketplaceServicesEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenTextField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderChangesData" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderChangesDataDto" minOccurs="0"/>
 *         &lt;element name="OrderDetailJson" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderDetailJsonDto" minOccurs="0"/>
 *         &lt;element name="OrderGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderItem" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderItemDto" minOccurs="0"/>
 *         &lt;element name="OrderLogisticsInfo" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderLogisticsInfoDto" minOccurs="0"/>
 *         &lt;element name="OrderPackage" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderPackageDto" minOccurs="0"/>
 *         &lt;element name="OrderRatesAndBenefits" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderRatesAndBenefitsDto" minOccurs="0"/>
 *         &lt;element name="OrderSeller" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderSellerDto" minOccurs="0"/>
 *         &lt;element name="OrderTotal" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderTotalDto" minOccurs="0"/>
 *         &lt;element name="OrderTransaction" type="{http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto}ArrayOfOrderTransactionDto" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingDataAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataComplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataNeighborhood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingDataStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDto", propOrder = {
    "affiliateId",
    "callCenterOperatorDataEmail",
    "callCenterOperatorDataId",
    "callCenterOperatorDataUserName",
    "changesAttachment",
    "clientProfileDataCorporateDocument",
    "clientProfileDataCorporateName",
    "clientProfileDataCorporatePhone",
    "clientProfileDataDocument",
    "clientProfileDataDocumentType",
    "clientProfileDataEmail",
    "clientProfileDataFirstName",
    "clientProfileDataId",
    "clientProfileDataIsCorporate",
    "clientProfileDataLastName",
    "clientProfileDataPhone",
    "clientProfileDataStateInscription",
    "clientProfileDataTradeName",
    "clientProfileDataUserProfileId",
    "creationDate",
    "dataHoraInclusao",
    "followUpEmail",
    "hostname",
    "idInstancia",
    "lastChange",
    "lastMessage",
    "marketingDataCoupon",
    "marketingDataId",
    "marketingDataUtmCampaign",
    "marketingDataUtmMedium",
    "marketingDataUtmPartner",
    "marketingDataUtmSource",
    "marketingDataUtmiCampaign",
    "marketingDataUtmiPage",
    "marketingDataUtmiPart",
    "marketplaceOrderId",
    "marketplaceServicesEndpoint",
    "merchantName",
    "openTextField",
    "orderChangesData",
    "orderDetailJson",
    "orderGroup",
    "orderId",
    "orderItem",
    "orderLogisticsInfo",
    "orderPackage",
    "orderRatesAndBenefits",
    "orderSeller",
    "orderTotal",
    "orderTransaction",
    "origin",
    "salesChannel",
    "sellerOrderId",
    "sequence",
    "shippingDataAddressId",
    "shippingDataAddressType",
    "shippingDataCity",
    "shippingDataComplement",
    "shippingDataCountry",
    "shippingDataNeighborhood",
    "shippingDataNumber",
    "shippingDataPostalCode",
    "shippingDataReceiverName",
    "shippingDataReference",
    "shippingDataState",
    "shippingDataStreet",
    "status",
    "statusDescription",
    "value"
})
public class OrderDto {

    @XmlElementRef(name = "AffiliateId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> affiliateId;
    @XmlElementRef(name = "CallCenterOperatorDataEmail", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> callCenterOperatorDataEmail;
    @XmlElementRef(name = "CallCenterOperatorDataId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> callCenterOperatorDataId;
    @XmlElementRef(name = "CallCenterOperatorDataUserName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> callCenterOperatorDataUserName;
    @XmlElementRef(name = "ChangesAttachment", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> changesAttachment;
    @XmlElementRef(name = "ClientProfileDataCorporateDocument", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataCorporateDocument;
    @XmlElementRef(name = "ClientProfileDataCorporateName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataCorporateName;
    @XmlElementRef(name = "ClientProfileDataCorporatePhone", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataCorporatePhone;
    @XmlElementRef(name = "ClientProfileDataDocument", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataDocument;
    @XmlElementRef(name = "ClientProfileDataDocumentType", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataDocumentType;
    @XmlElementRef(name = "ClientProfileDataEmail", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataEmail;
    @XmlElementRef(name = "ClientProfileDataFirstName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataFirstName;
    @XmlElementRef(name = "ClientProfileDataId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataId;
    @XmlElementRef(name = "ClientProfileDataIsCorporate", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Boolean> clientProfileDataIsCorporate;
    @XmlElementRef(name = "ClientProfileDataLastName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataLastName;
    @XmlElementRef(name = "ClientProfileDataPhone", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataPhone;
    @XmlElementRef(name = "ClientProfileDataStateInscription", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataStateInscription;
    @XmlElementRef(name = "ClientProfileDataTradeName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataTradeName;
    @XmlElementRef(name = "ClientProfileDataUserProfileId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> clientProfileDataUserProfileId;
    @XmlElementRef(name = "CreationDate", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> creationDate;
    @XmlElement(name = "DataHoraInclusao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraInclusao;
    @XmlElementRef(name = "FollowUpEmail", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> followUpEmail;
    @XmlElementRef(name = "Hostname", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> hostname;
    @XmlElement(name = "IdInstancia")
    protected Integer idInstancia;
    @XmlElementRef(name = "LastChange", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> lastChange;
    @XmlElementRef(name = "LastMessage", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> lastMessage;
    @XmlElementRef(name = "MarketingDataCoupon", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataCoupon;
    @XmlElementRef(name = "MarketingDataId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataId;
    @XmlElementRef(name = "MarketingDataUtmCampaign", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataUtmCampaign;
    @XmlElementRef(name = "MarketingDataUtmMedium", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataUtmMedium;
    @XmlElementRef(name = "MarketingDataUtmPartner", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataUtmPartner;
    @XmlElementRef(name = "MarketingDataUtmSource", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataUtmSource;
    @XmlElementRef(name = "MarketingDataUtmiCampaign", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataUtmiCampaign;
    @XmlElementRef(name = "MarketingDataUtmiPage", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataUtmiPage;
    @XmlElementRef(name = "MarketingDataUtmiPart", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketingDataUtmiPart;
    @XmlElementRef(name = "MarketplaceOrderId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketplaceOrderId;
    @XmlElementRef(name = "MarketplaceServicesEndpoint", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> marketplaceServicesEndpoint;
    @XmlElementRef(name = "MerchantName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> merchantName;
    @XmlElementRef(name = "OpenTextField", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> openTextField;
    @XmlElementRef(name = "OrderChangesData", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderChangesDataDto> orderChangesData;
    @XmlElementRef(name = "OrderDetailJson", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderDetailJsonDto> orderDetailJson;
    @XmlElementRef(name = "OrderGroup", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> orderGroup;
    @XmlElementRef(name = "OrderId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> orderId;
    @XmlElementRef(name = "OrderItem", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderItemDto> orderItem;
    @XmlElementRef(name = "OrderLogisticsInfo", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderLogisticsInfoDto> orderLogisticsInfo;
    @XmlElementRef(name = "OrderPackage", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderPackageDto> orderPackage;
    @XmlElementRef(name = "OrderRatesAndBenefits", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderRatesAndBenefitsDto> orderRatesAndBenefits;
    @XmlElementRef(name = "OrderSeller", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderSellerDto> orderSeller;
    @XmlElementRef(name = "OrderTotal", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderTotalDto> orderTotal;
    @XmlElementRef(name = "OrderTransaction", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<ArrayOfOrderTransactionDto> orderTransaction;
    @XmlElementRef(name = "Origin", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> origin;
    @XmlElementRef(name = "SalesChannel", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> salesChannel;
    @XmlElementRef(name = "SellerOrderId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> sellerOrderId;
    @XmlElementRef(name = "Sequence", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> sequence;
    @XmlElementRef(name = "ShippingDataAddressId", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataAddressId;
    @XmlElementRef(name = "ShippingDataAddressType", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataAddressType;
    @XmlElementRef(name = "ShippingDataCity", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataCity;
    @XmlElementRef(name = "ShippingDataComplement", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataComplement;
    @XmlElementRef(name = "ShippingDataCountry", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataCountry;
    @XmlElementRef(name = "ShippingDataNeighborhood", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataNeighborhood;
    @XmlElementRef(name = "ShippingDataNumber", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataNumber;
    @XmlElementRef(name = "ShippingDataPostalCode", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataPostalCode;
    @XmlElementRef(name = "ShippingDataReceiverName", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataReceiverName;
    @XmlElementRef(name = "ShippingDataReference", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataReference;
    @XmlElementRef(name = "ShippingDataState", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataState;
    @XmlElementRef(name = "ShippingDataStreet", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> shippingDataStreet;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "StatusDescription", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<String> statusDescription;
    @XmlElementRef(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/WMI.Domain.B2C.VTEX.Dto", type = JAXBElement.class)
    protected JAXBElement<Integer> value;

    /**
     * Gets the value of the affiliateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAffiliateId() {
        return affiliateId;
    }

    /**
     * Sets the value of the affiliateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAffiliateId(JAXBElement<String> value) {
        this.affiliateId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callCenterOperatorDataEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallCenterOperatorDataEmail() {
        return callCenterOperatorDataEmail;
    }

    /**
     * Sets the value of the callCenterOperatorDataEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallCenterOperatorDataEmail(JAXBElement<String> value) {
        this.callCenterOperatorDataEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callCenterOperatorDataId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallCenterOperatorDataId() {
        return callCenterOperatorDataId;
    }

    /**
     * Sets the value of the callCenterOperatorDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallCenterOperatorDataId(JAXBElement<String> value) {
        this.callCenterOperatorDataId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callCenterOperatorDataUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallCenterOperatorDataUserName() {
        return callCenterOperatorDataUserName;
    }

    /**
     * Sets the value of the callCenterOperatorDataUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallCenterOperatorDataUserName(JAXBElement<String> value) {
        this.callCenterOperatorDataUserName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the changesAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChangesAttachment() {
        return changesAttachment;
    }

    /**
     * Sets the value of the changesAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChangesAttachment(JAXBElement<String> value) {
        this.changesAttachment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataCorporateDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataCorporateDocument() {
        return clientProfileDataCorporateDocument;
    }

    /**
     * Sets the value of the clientProfileDataCorporateDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataCorporateDocument(JAXBElement<String> value) {
        this.clientProfileDataCorporateDocument = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataCorporateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataCorporateName() {
        return clientProfileDataCorporateName;
    }

    /**
     * Sets the value of the clientProfileDataCorporateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataCorporateName(JAXBElement<String> value) {
        this.clientProfileDataCorporateName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataCorporatePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataCorporatePhone() {
        return clientProfileDataCorporatePhone;
    }

    /**
     * Sets the value of the clientProfileDataCorporatePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataCorporatePhone(JAXBElement<String> value) {
        this.clientProfileDataCorporatePhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataDocument() {
        return clientProfileDataDocument;
    }

    /**
     * Sets the value of the clientProfileDataDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataDocument(JAXBElement<String> value) {
        this.clientProfileDataDocument = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataDocumentType() {
        return clientProfileDataDocumentType;
    }

    /**
     * Sets the value of the clientProfileDataDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataDocumentType(JAXBElement<String> value) {
        this.clientProfileDataDocumentType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataEmail() {
        return clientProfileDataEmail;
    }

    /**
     * Sets the value of the clientProfileDataEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataEmail(JAXBElement<String> value) {
        this.clientProfileDataEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataFirstName() {
        return clientProfileDataFirstName;
    }

    /**
     * Sets the value of the clientProfileDataFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataFirstName(JAXBElement<String> value) {
        this.clientProfileDataFirstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataId() {
        return clientProfileDataId;
    }

    /**
     * Sets the value of the clientProfileDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataId(JAXBElement<String> value) {
        this.clientProfileDataId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataIsCorporate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getClientProfileDataIsCorporate() {
        return clientProfileDataIsCorporate;
    }

    /**
     * Sets the value of the clientProfileDataIsCorporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setClientProfileDataIsCorporate(JAXBElement<Boolean> value) {
        this.clientProfileDataIsCorporate = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the clientProfileDataLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataLastName() {
        return clientProfileDataLastName;
    }

    /**
     * Sets the value of the clientProfileDataLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataLastName(JAXBElement<String> value) {
        this.clientProfileDataLastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataPhone() {
        return clientProfileDataPhone;
    }

    /**
     * Sets the value of the clientProfileDataPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataPhone(JAXBElement<String> value) {
        this.clientProfileDataPhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataStateInscription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataStateInscription() {
        return clientProfileDataStateInscription;
    }

    /**
     * Sets the value of the clientProfileDataStateInscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataStateInscription(JAXBElement<String> value) {
        this.clientProfileDataStateInscription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataTradeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataTradeName() {
        return clientProfileDataTradeName;
    }

    /**
     * Sets the value of the clientProfileDataTradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataTradeName(JAXBElement<String> value) {
        this.clientProfileDataTradeName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clientProfileDataUserProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientProfileDataUserProfileId() {
        return clientProfileDataUserProfileId;
    }

    /**
     * Sets the value of the clientProfileDataUserProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientProfileDataUserProfileId(JAXBElement<String> value) {
        this.clientProfileDataUserProfileId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreationDate(JAXBElement<String> value) {
        this.creationDate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataHoraInclusao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraInclusao() {
        return dataHoraInclusao;
    }

    /**
     * Sets the value of the dataHoraInclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraInclusao(XMLGregorianCalendar value) {
        this.dataHoraInclusao = value;
    }

    /**
     * Gets the value of the followUpEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFollowUpEmail() {
        return followUpEmail;
    }

    /**
     * Sets the value of the followUpEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFollowUpEmail(JAXBElement<String> value) {
        this.followUpEmail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostname(JAXBElement<String> value) {
        this.hostname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the idInstancia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdInstancia() {
        return idInstancia;
    }

    /**
     * Sets the value of the idInstancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdInstancia(Integer value) {
        this.idInstancia = value;
    }

    /**
     * Gets the value of the lastChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastChange() {
        return lastChange;
    }

    /**
     * Sets the value of the lastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastChange(JAXBElement<String> value) {
        this.lastChange = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastMessage() {
        return lastMessage;
    }

    /**
     * Sets the value of the lastMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastMessage(JAXBElement<String> value) {
        this.lastMessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataCoupon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataCoupon() {
        return marketingDataCoupon;
    }

    /**
     * Sets the value of the marketingDataCoupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataCoupon(JAXBElement<String> value) {
        this.marketingDataCoupon = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataId() {
        return marketingDataId;
    }

    /**
     * Sets the value of the marketingDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataId(JAXBElement<String> value) {
        this.marketingDataId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataUtmCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataUtmCampaign() {
        return marketingDataUtmCampaign;
    }

    /**
     * Sets the value of the marketingDataUtmCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataUtmCampaign(JAXBElement<String> value) {
        this.marketingDataUtmCampaign = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataUtmMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataUtmMedium() {
        return marketingDataUtmMedium;
    }

    /**
     * Sets the value of the marketingDataUtmMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataUtmMedium(JAXBElement<String> value) {
        this.marketingDataUtmMedium = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataUtmPartner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataUtmPartner() {
        return marketingDataUtmPartner;
    }

    /**
     * Sets the value of the marketingDataUtmPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataUtmPartner(JAXBElement<String> value) {
        this.marketingDataUtmPartner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataUtmSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataUtmSource() {
        return marketingDataUtmSource;
    }

    /**
     * Sets the value of the marketingDataUtmSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataUtmSource(JAXBElement<String> value) {
        this.marketingDataUtmSource = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataUtmiCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataUtmiCampaign() {
        return marketingDataUtmiCampaign;
    }

    /**
     * Sets the value of the marketingDataUtmiCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataUtmiCampaign(JAXBElement<String> value) {
        this.marketingDataUtmiCampaign = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataUtmiPage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataUtmiPage() {
        return marketingDataUtmiPage;
    }

    /**
     * Sets the value of the marketingDataUtmiPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataUtmiPage(JAXBElement<String> value) {
        this.marketingDataUtmiPage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingDataUtmiPart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataUtmiPart() {
        return marketingDataUtmiPart;
    }

    /**
     * Sets the value of the marketingDataUtmiPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataUtmiPart(JAXBElement<String> value) {
        this.marketingDataUtmiPart = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketplaceOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketplaceOrderId() {
        return marketplaceOrderId;
    }

    /**
     * Sets the value of the marketplaceOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketplaceOrderId(JAXBElement<String> value) {
        this.marketplaceOrderId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketplaceServicesEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketplaceServicesEndpoint() {
        return marketplaceServicesEndpoint;
    }

    /**
     * Sets the value of the marketplaceServicesEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketplaceServicesEndpoint(JAXBElement<String> value) {
        this.marketplaceServicesEndpoint = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantName(JAXBElement<String> value) {
        this.merchantName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the openTextField property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpenTextField() {
        return openTextField;
    }

    /**
     * Sets the value of the openTextField property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpenTextField(JAXBElement<String> value) {
        this.openTextField = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderChangesData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderChangesDataDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderChangesDataDto> getOrderChangesData() {
        return orderChangesData;
    }

    /**
     * Sets the value of the orderChangesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderChangesDataDto }{@code >}
     *     
     */
    public void setOrderChangesData(JAXBElement<ArrayOfOrderChangesDataDto> value) {
        this.orderChangesData = ((JAXBElement<ArrayOfOrderChangesDataDto> ) value);
    }

    /**
     * Gets the value of the orderDetailJson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderDetailJsonDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderDetailJsonDto> getOrderDetailJson() {
        return orderDetailJson;
    }

    /**
     * Sets the value of the orderDetailJson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderDetailJsonDto }{@code >}
     *     
     */
    public void setOrderDetailJson(JAXBElement<ArrayOfOrderDetailJsonDto> value) {
        this.orderDetailJson = ((JAXBElement<ArrayOfOrderDetailJsonDto> ) value);
    }

    /**
     * Gets the value of the orderGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderGroup() {
        return orderGroup;
    }

    /**
     * Sets the value of the orderGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderGroup(JAXBElement<String> value) {
        this.orderGroup = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderId(JAXBElement<String> value) {
        this.orderId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orderItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderItemDto> getOrderItem() {
        return orderItem;
    }

    /**
     * Sets the value of the orderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderItemDto }{@code >}
     *     
     */
    public void setOrderItem(JAXBElement<ArrayOfOrderItemDto> value) {
        this.orderItem = ((JAXBElement<ArrayOfOrderItemDto> ) value);
    }

    /**
     * Gets the value of the orderLogisticsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderLogisticsInfoDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderLogisticsInfoDto> getOrderLogisticsInfo() {
        return orderLogisticsInfo;
    }

    /**
     * Sets the value of the orderLogisticsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderLogisticsInfoDto }{@code >}
     *     
     */
    public void setOrderLogisticsInfo(JAXBElement<ArrayOfOrderLogisticsInfoDto> value) {
        this.orderLogisticsInfo = ((JAXBElement<ArrayOfOrderLogisticsInfoDto> ) value);
    }

    /**
     * Gets the value of the orderPackage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderPackageDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderPackageDto> getOrderPackage() {
        return orderPackage;
    }

    /**
     * Sets the value of the orderPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderPackageDto }{@code >}
     *     
     */
    public void setOrderPackage(JAXBElement<ArrayOfOrderPackageDto> value) {
        this.orderPackage = ((JAXBElement<ArrayOfOrderPackageDto> ) value);
    }

    /**
     * Gets the value of the orderRatesAndBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderRatesAndBenefitsDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderRatesAndBenefitsDto> getOrderRatesAndBenefits() {
        return orderRatesAndBenefits;
    }

    /**
     * Sets the value of the orderRatesAndBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderRatesAndBenefitsDto }{@code >}
     *     
     */
    public void setOrderRatesAndBenefits(JAXBElement<ArrayOfOrderRatesAndBenefitsDto> value) {
        this.orderRatesAndBenefits = ((JAXBElement<ArrayOfOrderRatesAndBenefitsDto> ) value);
    }

    /**
     * Gets the value of the orderSeller property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderSellerDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderSellerDto> getOrderSeller() {
        return orderSeller;
    }

    /**
     * Sets the value of the orderSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderSellerDto }{@code >}
     *     
     */
    public void setOrderSeller(JAXBElement<ArrayOfOrderSellerDto> value) {
        this.orderSeller = ((JAXBElement<ArrayOfOrderSellerDto> ) value);
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderTotalDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderTotalDto> getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderTotalDto }{@code >}
     *     
     */
    public void setOrderTotal(JAXBElement<ArrayOfOrderTotalDto> value) {
        this.orderTotal = ((JAXBElement<ArrayOfOrderTotalDto> ) value);
    }

    /**
     * Gets the value of the orderTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderTransactionDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderTransactionDto> getOrderTransaction() {
        return orderTransaction;
    }

    /**
     * Sets the value of the orderTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderTransactionDto }{@code >}
     *     
     */
    public void setOrderTransaction(JAXBElement<ArrayOfOrderTransactionDto> value) {
        this.orderTransaction = ((JAXBElement<ArrayOfOrderTransactionDto> ) value);
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigin(JAXBElement<String> value) {
        this.origin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSalesChannel(JAXBElement<Integer> value) {
        this.salesChannel = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the sellerOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellerOrderId() {
        return sellerOrderId;
    }

    /**
     * Sets the value of the sellerOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellerOrderId(JAXBElement<String> value) {
        this.sellerOrderId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSequence(JAXBElement<Integer> value) {
        this.sequence = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the shippingDataAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataAddressId() {
        return shippingDataAddressId;
    }

    /**
     * Sets the value of the shippingDataAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataAddressId(JAXBElement<String> value) {
        this.shippingDataAddressId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataAddressType() {
        return shippingDataAddressType;
    }

    /**
     * Sets the value of the shippingDataAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataAddressType(JAXBElement<String> value) {
        this.shippingDataAddressType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataCity() {
        return shippingDataCity;
    }

    /**
     * Sets the value of the shippingDataCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataCity(JAXBElement<String> value) {
        this.shippingDataCity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataComplement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataComplement() {
        return shippingDataComplement;
    }

    /**
     * Sets the value of the shippingDataComplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataComplement(JAXBElement<String> value) {
        this.shippingDataComplement = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataCountry() {
        return shippingDataCountry;
    }

    /**
     * Sets the value of the shippingDataCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataCountry(JAXBElement<String> value) {
        this.shippingDataCountry = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataNeighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataNeighborhood() {
        return shippingDataNeighborhood;
    }

    /**
     * Sets the value of the shippingDataNeighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataNeighborhood(JAXBElement<String> value) {
        this.shippingDataNeighborhood = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataNumber() {
        return shippingDataNumber;
    }

    /**
     * Sets the value of the shippingDataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataNumber(JAXBElement<String> value) {
        this.shippingDataNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataPostalCode() {
        return shippingDataPostalCode;
    }

    /**
     * Sets the value of the shippingDataPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataPostalCode(JAXBElement<String> value) {
        this.shippingDataPostalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataReceiverName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataReceiverName() {
        return shippingDataReceiverName;
    }

    /**
     * Sets the value of the shippingDataReceiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataReceiverName(JAXBElement<String> value) {
        this.shippingDataReceiverName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataReference() {
        return shippingDataReference;
    }

    /**
     * Sets the value of the shippingDataReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataReference(JAXBElement<String> value) {
        this.shippingDataReference = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataState() {
        return shippingDataState;
    }

    /**
     * Sets the value of the shippingDataState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataState(JAXBElement<String> value) {
        this.shippingDataState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingDataStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingDataStreet() {
        return shippingDataStreet;
    }

    /**
     * Sets the value of the shippingDataStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingDataStreet(JAXBElement<String> value) {
        this.shippingDataStreet = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusDescription(JAXBElement<String> value) {
        this.statusDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setValue(JAXBElement<Integer> value) {
        this.value = ((JAXBElement<Integer> ) value);
    }

}
