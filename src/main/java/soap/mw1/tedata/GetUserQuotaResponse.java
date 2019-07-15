
package soap.mw1.tedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import custom_types.wservices.QuotaReturn;


/**
 * <p>Java class for getUserQuotaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserQuotaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getUserQuotaResult" type="{wservices.custom_types}QuotaReturn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserQuotaResponse", propOrder = {
    "getUserQuotaResult"
})
public class GetUserQuotaResponse {

    @XmlElementRef(name = "getUserQuotaResult", namespace = "tedata.mw1.soap", type = JAXBElement.class, required = false)
    protected JAXBElement<QuotaReturn> getUserQuotaResult;

    /**
     * Gets the value of the getUserQuotaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuotaReturn }{@code >}
     *     
     */
    public JAXBElement<QuotaReturn> getGetUserQuotaResult() {
        return getUserQuotaResult;
    }

    /**
     * Sets the value of the getUserQuotaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuotaReturn }{@code >}
     *     
     */
    public void setGetUserQuotaResult(JAXBElement<QuotaReturn> value) {
        this.getUserQuotaResult = value;
    }

}
