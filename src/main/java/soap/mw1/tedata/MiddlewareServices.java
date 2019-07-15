package soap.mw1.tedata;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5.redhat-00001
 * 2019-07-14T13:51:29.816+04:00
 * Generated source version: 3.2.5.redhat-00001
 *
 */
@WebService(targetNamespace = "tedata.mw1.soap", name = "MiddlewareServices")
@XmlSeeAlso({custom_types.wservices.ObjectFactory.class, ObjectFactory.class})
public interface MiddlewareServices {

    @WebMethod(action = "getUserQuota")
    @RequestWrapper(localName = "getUserQuota", targetNamespace = "tedata.mw1.soap", className = "soap.mw1.tedata.GetUserQuota")
    @ResponseWrapper(localName = "getUserQuotaResponse", targetNamespace = "tedata.mw1.soap", className = "soap.mw1.tedata.GetUserQuotaResponse")
    @WebResult(name = "getUserQuotaResult", targetNamespace = "tedata.mw1.soap")
    public custom_types.wservices.QuotaReturn getUserQuota(
        @WebParam(name = "key", targetNamespace = "tedata.mw1.soap")
        java.lang.String key,
        @WebParam(name = "userName", targetNamespace = "tedata.mw1.soap")
        java.lang.String userName
    );

    
}
