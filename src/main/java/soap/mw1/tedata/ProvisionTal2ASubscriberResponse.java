
package soap.mw1.tedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import custom_types.wservices.BasicReturn;


/**
 * <p>Java class for provisionTal2aSubscriberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisionTal2aSubscriberResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="provisionTal2aSubscriberResult" type="{wservices.custom_types}BasicReturn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisionTal2aSubscriberResponse", propOrder = {
    "provisionTal2ASubscriberResult"
})
public class ProvisionTal2ASubscriberResponse {

    @XmlElementRef(name = "provisionTal2aSubscriberResult", namespace = "tedata.mw1.soap", type = JAXBElement.class, required = false)
    protected JAXBElement<BasicReturn> provisionTal2ASubscriberResult;

    /**
     * Gets the value of the provisionTal2ASubscriberResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BasicReturn }{@code >}
     *     
     */
    public JAXBElement<BasicReturn> getProvisionTal2ASubscriberResult() {
        return provisionTal2ASubscriberResult;
    }

    /**
     * Sets the value of the provisionTal2ASubscriberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BasicReturn }{@code >}
     *     
     */
    public void setProvisionTal2ASubscriberResult(JAXBElement<BasicReturn> value) {
        this.provisionTal2ASubscriberResult = value;
    }

}
