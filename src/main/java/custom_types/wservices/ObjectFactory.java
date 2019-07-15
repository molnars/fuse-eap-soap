
package custom_types.wservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the custom_types.wservices package. 
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

    private final static QName _BasicReturn_QNAME = new QName("wservices.custom_types", "BasicReturn");
    private final static QName _QuotaType_QNAME = new QName("wservices.custom_types", "QuotaType");
    private final static QName _QuotaReturn_QNAME = new QName("wservices.custom_types", "QuotaReturn");
    private final static QName _BasicReturnErrorMessage_QNAME = new QName("wservices.custom_types", "errorMessage");
    private final static QName _BasicReturnSuccess_QNAME = new QName("wservices.custom_types", "success");
    private final static QName _QuotaReturnQuota_QNAME = new QName("wservices.custom_types", "quota");
    private final static QName _QuotaTypeBasicQuota_QNAME = new QName("wservices.custom_types", "basicQuota");
    private final static QName _QuotaTypeStartDate_QNAME = new QName("wservices.custom_types", "startDate");
    private final static QName _QuotaTypeEndDate_QNAME = new QName("wservices.custom_types", "endDate");
    private final static QName _QuotaTypeRemainingTopupQuota_QNAME = new QName("wservices.custom_types", "remainingTopupQuota");
    private final static QName _QuotaTypeService_QNAME = new QName("wservices.custom_types", "service");
    private final static QName _QuotaTypeTotalConsumedQuota_QNAME = new QName("wservices.custom_types", "totalConsumedQuota");
    private final static QName _QuotaTypeTotalAllowedQuota_QNAME = new QName("wservices.custom_types", "totalAllowedQuota");
    private final static QName _QuotaTypeConsumedTopupQuota_QNAME = new QName("wservices.custom_types", "consumedTopupQuota");
    private final static QName _QuotaTypeTotalTopupQuota_QNAME = new QName("wservices.custom_types", "totalTopupQuota");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: custom_types.wservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BasicReturn }
     * 
     */
    public BasicReturn createBasicReturn() {
        return new BasicReturn();
    }

    /**
     * Create an instance of {@link QuotaType }
     * 
     */
    public QuotaType createQuotaType() {
        return new QuotaType();
    }

    /**
     * Create an instance of {@link QuotaReturn }
     * 
     */
    public QuotaReturn createQuotaReturn() {
        return new QuotaReturn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "BasicReturn")
    public JAXBElement<BasicReturn> createBasicReturn(BasicReturn value) {
        return new JAXBElement<BasicReturn>(_BasicReturn_QNAME, BasicReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "QuotaType")
    public JAXBElement<QuotaType> createQuotaType(QuotaType value) {
        return new JAXBElement<QuotaType>(_QuotaType_QNAME, QuotaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "QuotaReturn")
    public JAXBElement<QuotaReturn> createQuotaReturn(QuotaReturn value) {
        return new JAXBElement<QuotaReturn>(_QuotaReturn_QNAME, QuotaReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "errorMessage", scope = BasicReturn.class)
    public JAXBElement<String> createBasicReturnErrorMessage(String value) {
        return new JAXBElement<String>(_BasicReturnErrorMessage_QNAME, String.class, BasicReturn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "success", scope = BasicReturn.class)
    public JAXBElement<Boolean> createBasicReturnSuccess(Boolean value) {
        return new JAXBElement<Boolean>(_BasicReturnSuccess_QNAME, Boolean.class, BasicReturn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "quota", scope = QuotaReturn.class)
    public JAXBElement<QuotaType> createQuotaReturnQuota(QuotaType value) {
        return new JAXBElement<QuotaType>(_QuotaReturnQuota_QNAME, QuotaType.class, QuotaReturn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "basicQuota", scope = QuotaType.class)
    public JAXBElement<Double> createQuotaTypeBasicQuota(Double value) {
        return new JAXBElement<Double>(_QuotaTypeBasicQuota_QNAME, Double.class, QuotaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "startDate", scope = QuotaType.class)
    public JAXBElement<String> createQuotaTypeStartDate(String value) {
        return new JAXBElement<String>(_QuotaTypeStartDate_QNAME, String.class, QuotaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "endDate", scope = QuotaType.class)
    public JAXBElement<String> createQuotaTypeEndDate(String value) {
        return new JAXBElement<String>(_QuotaTypeEndDate_QNAME, String.class, QuotaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "remainingTopupQuota", scope = QuotaType.class)
    public JAXBElement<Double> createQuotaTypeRemainingTopupQuota(Double value) {
        return new JAXBElement<Double>(_QuotaTypeRemainingTopupQuota_QNAME, Double.class, QuotaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "service", scope = QuotaType.class)
    public JAXBElement<String> createQuotaTypeService(String value) {
        return new JAXBElement<String>(_QuotaTypeService_QNAME, String.class, QuotaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "totalConsumedQuota", scope = QuotaType.class)
    public JAXBElement<Double> createQuotaTypeTotalConsumedQuota(Double value) {
        return new JAXBElement<Double>(_QuotaTypeTotalConsumedQuota_QNAME, Double.class, QuotaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "totalAllowedQuota", scope = QuotaType.class)
    public JAXBElement<Double> createQuotaTypeTotalAllowedQuota(Double value) {
        return new JAXBElement<Double>(_QuotaTypeTotalAllowedQuota_QNAME, Double.class, QuotaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "consumedTopupQuota", scope = QuotaType.class)
    public JAXBElement<Double> createQuotaTypeConsumedTopupQuota(Double value) {
        return new JAXBElement<Double>(_QuotaTypeConsumedTopupQuota_QNAME, Double.class, QuotaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "wservices.custom_types", name = "totalTopupQuota", scope = QuotaType.class)
    public JAXBElement<Double> createQuotaTypeTotalTopupQuota(Double value) {
        return new JAXBElement<Double>(_QuotaTypeTotalTopupQuota_QNAME, Double.class, QuotaType.class, value);
    }

}
