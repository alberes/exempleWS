
package org.datacontract.schemas._2004._07.vtex_commerce_webapps_adminwcfservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.vtex_commerce_webapps_adminwcfservice package. 
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

    private final static QName _StockKeepingUnitEanDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitEanDTO");
    private final static QName _ArrayOfProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfProductDTO");
    private final static QName _StockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitDTO");
    private final static QName _ArrayOfStockKeepingUnitDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStockKeepingUnitDTO");
    private final static QName _ArrayOfStockKeepingUnitEanDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ArrayOfStockKeepingUnitEanDTO");
    private final static QName _ProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductDTO");
    private final static QName _StockKeepingUnitEanDTOEan_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Ean");
    private final static QName _StockKeepingUnitDTOWidth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Width");
    private final static QName _StockKeepingUnitDTOProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductName");
    private final static QName _StockKeepingUnitDTORealWidth_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RealWidth");
    private final static QName _StockKeepingUnitDTOCommercialConditionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CommercialConditionId");
    private final static QName _StockKeepingUnitDTORealHeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RealHeight");
    private final static QName _StockKeepingUnitDTORefId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RefId");
    private final static QName _StockKeepingUnitDTOIsActive_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsActive");
    private final static QName _StockKeepingUnitDTORewardValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RewardValue");
    private final static QName _StockKeepingUnitDTOCubicWeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CubicWeight");
    private final static QName _StockKeepingUnitDTORealWeightKg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RealWeightKg");
    private final static QName _StockKeepingUnitDTOListPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ListPrice");
    private final static QName _StockKeepingUnitDTOId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Id");
    private final static QName _StockKeepingUnitDTOWeightKg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "WeightKg");
    private final static QName _StockKeepingUnitDTODateUpdated_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DateUpdated");
    private final static QName _StockKeepingUnitDTOUnitMultiplier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "UnitMultiplier");
    private final static QName _StockKeepingUnitDTOStockKeepingUnitEans_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "StockKeepingUnitEans");
    private final static QName _StockKeepingUnitDTOIsAvaiable_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsAvaiable");
    private final static QName _StockKeepingUnitDTOCostPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CostPrice");
    private final static QName _StockKeepingUnitDTOName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Name");
    private final static QName _StockKeepingUnitDTOLength_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Length");
    private final static QName _StockKeepingUnitDTOPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Price");
    private final static QName _StockKeepingUnitDTOModalType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ModalType");
    private final static QName _StockKeepingUnitDTOHeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Height");
    private final static QName _StockKeepingUnitDTOManufacturerCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ManufacturerCode");
    private final static QName _StockKeepingUnitDTOProductId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ProductId");
    private final static QName _StockKeepingUnitDTOEstimatedDateArrival_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "EstimatedDateArrival");
    private final static QName _StockKeepingUnitDTOModalId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ModalId");
    private final static QName _StockKeepingUnitDTOMeasurementUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "MeasurementUnit");
    private final static QName _StockKeepingUnitDTOInternalNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "InternalNote");
    private final static QName _StockKeepingUnitDTOIsKit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsKit");
    private final static QName _StockKeepingUnitDTORealLength_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "RealLength");
    private final static QName _ProductDTODescriptionShort_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DescriptionShort");
    private final static QName _ProductDTOShowWithoutStock_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ShowWithoutStock");
    private final static QName _ProductDTOIsVisible_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "IsVisible");
    private final static QName _ProductDTOReleaseDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ReleaseDate");
    private final static QName _ProductDTOSupplierId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "SupplierId");
    private final static QName _ProductDTODepartmentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "DepartmentId");
    private final static QName _ProductDTOLomadeeCampaignCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "LomadeeCampaignCode");
    private final static QName _ProductDTOCategoryId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "CategoryId");
    private final static QName _ProductDTOMetaTagDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "MetaTagDescription");
    private final static QName _ProductDTOBrandId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "BrandId");
    private final static QName _ProductDTOListStoreId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "ListStoreId");
    private final static QName _ProductDTOKeyWords_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "KeyWords");
    private final static QName _ProductDTOTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Title");
    private final static QName _ProductDTOLinkId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "LinkId");
    private final static QName _ProductDTOAdWordsRemarketingCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "AdWordsRemarketingCode");
    private final static QName _ProductDTODescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "Description");
    private final static QName _ProductDTOTaxCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", "TaxCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.vtex_commerce_webapps_adminwcfservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockKeepingUnitEanDTO }
     * 
     */
    public StockKeepingUnitEanDTO createStockKeepingUnitEanDTO() {
        return new StockKeepingUnitEanDTO();
    }

    /**
     * Create an instance of {@link ArrayOfStockKeepingUnitEanDTO }
     * 
     */
    public ArrayOfStockKeepingUnitEanDTO createArrayOfStockKeepingUnitEanDTO() {
        return new ArrayOfStockKeepingUnitEanDTO();
    }

    /**
     * Create an instance of {@link ProductDTO }
     * 
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
    }

    /**
     * Create an instance of {@link StockKeepingUnitDTO }
     * 
     */
    public StockKeepingUnitDTO createStockKeepingUnitDTO() {
        return new StockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link ArrayOfProductDTO }
     * 
     */
    public ArrayOfProductDTO createArrayOfProductDTO() {
        return new ArrayOfProductDTO();
    }

    /**
     * Create an instance of {@link ArrayOfStockKeepingUnitDTO }
     * 
     */
    public ArrayOfStockKeepingUnitDTO createArrayOfStockKeepingUnitDTO() {
        return new ArrayOfStockKeepingUnitDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitEanDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitEanDTO")
    public JAXBElement<StockKeepingUnitEanDTO> createStockKeepingUnitEanDTO(StockKeepingUnitEanDTO value) {
        return new JAXBElement<StockKeepingUnitEanDTO>(_StockKeepingUnitEanDTO_QNAME, StockKeepingUnitEanDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfProductDTO")
    public JAXBElement<ArrayOfProductDTO> createArrayOfProductDTO(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_ArrayOfProductDTO_QNAME, ArrayOfProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitDTO")
    public JAXBElement<StockKeepingUnitDTO> createStockKeepingUnitDTO(StockKeepingUnitDTO value) {
        return new JAXBElement<StockKeepingUnitDTO>(_StockKeepingUnitDTO_QNAME, StockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStockKeepingUnitDTO")
    public JAXBElement<ArrayOfStockKeepingUnitDTO> createArrayOfStockKeepingUnitDTO(ArrayOfStockKeepingUnitDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitDTO>(_ArrayOfStockKeepingUnitDTO_QNAME, ArrayOfStockKeepingUnitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitEanDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ArrayOfStockKeepingUnitEanDTO")
    public JAXBElement<ArrayOfStockKeepingUnitEanDTO> createArrayOfStockKeepingUnitEanDTO(ArrayOfStockKeepingUnitEanDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitEanDTO>(_ArrayOfStockKeepingUnitEanDTO_QNAME, ArrayOfStockKeepingUnitEanDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductDTO")
    public JAXBElement<ProductDTO> createProductDTO(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductDTO_QNAME, ProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Ean", scope = StockKeepingUnitEanDTO.class)
    public JAXBElement<String> createStockKeepingUnitEanDTOEan(String value) {
        return new JAXBElement<String>(_StockKeepingUnitEanDTOEan_QNAME, String.class, StockKeepingUnitEanDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Width", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOWidth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOWidth_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductName", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOProductName(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOProductName_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RealWidth", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORealWidth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORealWidth_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CommercialConditionId", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitDTOCommercialConditionId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitDTOCommercialConditionId_QNAME, Integer.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RealHeight", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORealHeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORealHeight_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RefId", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTORefId(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTORefId_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Boolean> createStockKeepingUnitDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StockKeepingUnitDTOIsActive_QNAME, Boolean.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RewardValue", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORewardValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORewardValue_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CubicWeight", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOCubicWeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOCubicWeight_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RealWeightKg", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORealWeightKg(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORealWeightKg_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ListPrice", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOListPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOListPrice_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitDTOId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitDTOId_QNAME, Integer.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "WeightKg", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOWeightKg(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOWeightKg_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DateUpdated", scope = StockKeepingUnitDTO.class)
    public JAXBElement<XMLGregorianCalendar> createStockKeepingUnitDTODateUpdated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StockKeepingUnitDTODateUpdated_QNAME, XMLGregorianCalendar.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "UnitMultiplier", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOUnitMultiplier(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOUnitMultiplier_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockKeepingUnitEanDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "StockKeepingUnitEans", scope = StockKeepingUnitDTO.class)
    public JAXBElement<ArrayOfStockKeepingUnitEanDTO> createStockKeepingUnitDTOStockKeepingUnitEans(ArrayOfStockKeepingUnitEanDTO value) {
        return new JAXBElement<ArrayOfStockKeepingUnitEanDTO>(_StockKeepingUnitDTOStockKeepingUnitEans_QNAME, ArrayOfStockKeepingUnitEanDTO.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsAvaiable", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Boolean> createStockKeepingUnitDTOIsAvaiable(Boolean value) {
        return new JAXBElement<Boolean>(_StockKeepingUnitDTOIsAvaiable_QNAME, Boolean.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CostPrice", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOCostPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOCostPrice_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOName(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOName_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Length", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOLength(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOLength_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Price", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOPrice_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ModalType", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOModalType(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOModalType_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Height", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTOHeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTOHeight_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ManufacturerCode", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOManufacturerCode(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOManufacturerCode_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ProductId", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitDTOProductId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitDTOProductId_QNAME, Integer.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "EstimatedDateArrival", scope = StockKeepingUnitDTO.class)
    public JAXBElement<XMLGregorianCalendar> createStockKeepingUnitDTOEstimatedDateArrival(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StockKeepingUnitDTOEstimatedDateArrival_QNAME, XMLGregorianCalendar.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ModalId", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Integer> createStockKeepingUnitDTOModalId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitDTOModalId_QNAME, Integer.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "MeasurementUnit", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOMeasurementUnit(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOMeasurementUnit_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "InternalNote", scope = StockKeepingUnitDTO.class)
    public JAXBElement<String> createStockKeepingUnitDTOInternalNote(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOInternalNote_QNAME, String.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsKit", scope = StockKeepingUnitDTO.class)
    public JAXBElement<Boolean> createStockKeepingUnitDTOIsKit(Boolean value) {
        return new JAXBElement<Boolean>(_StockKeepingUnitDTOIsKit_QNAME, Boolean.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RealLength", scope = StockKeepingUnitDTO.class)
    public JAXBElement<BigDecimal> createStockKeepingUnitDTORealLength(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StockKeepingUnitDTORealLength_QNAME, BigDecimal.class, StockKeepingUnitDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DescriptionShort", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTODescriptionShort(String value) {
        return new JAXBElement<String>(_ProductDTODescriptionShort_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Id", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTOId(Integer value) {
        return new JAXBElement<Integer>(_StockKeepingUnitDTOId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ShowWithoutStock", scope = ProductDTO.class)
    public JAXBElement<Boolean> createProductDTOShowWithoutStock(Boolean value) {
        return new JAXBElement<Boolean>(_ProductDTOShowWithoutStock_QNAME, Boolean.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsVisible", scope = ProductDTO.class)
    public JAXBElement<Boolean> createProductDTOIsVisible(Boolean value) {
        return new JAXBElement<Boolean>(_ProductDTOIsVisible_QNAME, Boolean.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ReleaseDate", scope = ProductDTO.class)
    public JAXBElement<XMLGregorianCalendar> createProductDTOReleaseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductDTOReleaseDate_QNAME, XMLGregorianCalendar.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "SupplierId", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTOSupplierId(Integer value) {
        return new JAXBElement<Integer>(_ProductDTOSupplierId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "DepartmentId", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTODepartmentId(Integer value) {
        return new JAXBElement<Integer>(_ProductDTODepartmentId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "LomadeeCampaignCode", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOLomadeeCampaignCode(String value) {
        return new JAXBElement<String>(_ProductDTOLomadeeCampaignCode_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "CategoryId", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTOCategoryId(Integer value) {
        return new JAXBElement<Integer>(_ProductDTOCategoryId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "MetaTagDescription", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOMetaTagDescription(String value) {
        return new JAXBElement<String>(_ProductDTOMetaTagDescription_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Name", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOName(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTOName_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "BrandId", scope = ProductDTO.class)
    public JAXBElement<Integer> createProductDTOBrandId(Integer value) {
        return new JAXBElement<Integer>(_ProductDTOBrandId_QNAME, Integer.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "ListStoreId", scope = ProductDTO.class)
    public JAXBElement<ArrayOfint> createProductDTOListStoreId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ProductDTOListStoreId_QNAME, ArrayOfint.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "RefId", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTORefId(String value) {
        return new JAXBElement<String>(_StockKeepingUnitDTORefId_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "IsActive", scope = ProductDTO.class)
    public JAXBElement<Boolean> createProductDTOIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_StockKeepingUnitDTOIsActive_QNAME, Boolean.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "KeyWords", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOKeyWords(String value) {
        return new JAXBElement<String>(_ProductDTOKeyWords_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Title", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOTitle(String value) {
        return new JAXBElement<String>(_ProductDTOTitle_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "LinkId", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOLinkId(String value) {
        return new JAXBElement<String>(_ProductDTOLinkId_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "AdWordsRemarketingCode", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOAdWordsRemarketingCode(String value) {
        return new JAXBElement<String>(_ProductDTOAdWordsRemarketingCode_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "Description", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTODescription(String value) {
        return new JAXBElement<String>(_ProductDTODescription_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", name = "TaxCode", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOTaxCode(String value) {
        return new JAXBElement<String>(_ProductDTOTaxCode_QNAME, String.class, ProductDTO.class, value);
    }

}