
package soap.mw1.tedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import custom_types.wservices.BasicReturn;
import custom_types.wservices.QuotaReturn;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.mw1.tedata package. 
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

    private final static QName _ProvisionTal2ASubscriber_QNAME = new QName("tedata.mw1.soap", "provisionTal2aSubscriber");
    private final static QName _GetUserQuota_QNAME = new QName("tedata.mw1.soap", "getUserQuota");
    private final static QName _ProvisionTal2ASubscriberResponse_QNAME = new QName("tedata.mw1.soap", "provisionTal2aSubscriberResponse");
    private final static QName _GetUserQuotaResponse_QNAME = new QName("tedata.mw1.soap", "getUserQuotaResponse");
    private final static QName _GetUserQuotaResponseGetUserQuotaResult_QNAME = new QName("tedata.mw1.soap", "getUserQuotaResult");
    private final static QName _ProvisionTal2ASubscriberResponseProvisionTal2ASubscriberResult_QNAME = new QName("tedata.mw1.soap", "provisionTal2aSubscriberResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.mw1.tedata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProvisionTal2ASubscriber }
     * 
     */
    public ProvisionTal2ASubscriber createProvisionTal2ASubscriber() {
        return new ProvisionTal2ASubscriber();
    }

    /**
     * Create an instance of {@link GetUserQuota }
     * 
     */
    public GetUserQuota createGetUserQuota() {
        return new GetUserQuota();
    }

    /**
     * Create an instance of {@link ProvisionTal2ASubscriberResponse }
     * 
     */
    public ProvisionTal2ASubscriberResponse createProvisionTal2ASubscriberResponse() {
        return new ProvisionTal2ASubscriberResponse();
    }

    /**
     * Create an instance of {@link GetUserQuotaResponse }
     * 
     */
    public GetUserQuotaResponse createGetUserQuotaResponse() {
        return new GetUserQuotaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisionTal2ASubscriber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tedata.mw1.soap", name = "provisionTal2aSubscriber")
    public JAXBElement<ProvisionTal2ASubscriber> createProvisionTal2ASubscriber(ProvisionTal2ASubscriber value) {
        return new JAXBElement<ProvisionTal2ASubscriber>(_ProvisionTal2ASubscriber_QNAME, ProvisionTal2ASubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserQuota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tedata.mw1.soap", name = "getUserQuota")
    public JAXBElement<GetUserQuota> createGetUserQuota(GetUserQuota value) {
        return new JAXBElement<GetUserQuota>(_GetUserQuota_QNAME, GetUserQuota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisionTal2ASubscriberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tedata.mw1.soap", name = "provisionTal2aSubscriberResponse")
    public JAXBElement<ProvisionTal2ASubscriberResponse> createProvisionTal2ASubscriberResponse(ProvisionTal2ASubscriberResponse value) {
        return new JAXBElement<ProvisionTal2ASubscriberResponse>(_ProvisionTal2ASubscriberResponse_QNAME, ProvisionTal2ASubscriberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserQuotaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tedata.mw1.soap", name = "getUserQuotaResponse")
    public JAXBElement<GetUserQuotaResponse> createGetUserQuotaResponse(GetUserQuotaResponse value) {
        return new JAXBElement<GetUserQuotaResponse>(_GetUserQuotaResponse_QNAME, GetUserQuotaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tedata.mw1.soap", name = "getUserQuotaResult", scope = GetUserQuotaResponse.class)
    public JAXBElement<QuotaReturn> createGetUserQuotaResponseGetUserQuotaResult(QuotaReturn value) {
        return new JAXBElement<QuotaReturn>(_GetUserQuotaResponseGetUserQuotaResult_QNAME, QuotaReturn.class, GetUserQuotaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tedata.mw1.soap", name = "provisionTal2aSubscriberResult", scope = ProvisionTal2ASubscriberResponse.class)
    public JAXBElement<BasicReturn> createProvisionTal2ASubscriberResponseProvisionTal2ASubscriberResult(BasicReturn value) {
        return new JAXBElement<BasicReturn>(_ProvisionTal2ASubscriberResponseProvisionTal2ASubscriberResult_QNAME, BasicReturn.class, ProvisionTal2ASubscriberResponse.class, value);
    }

}
