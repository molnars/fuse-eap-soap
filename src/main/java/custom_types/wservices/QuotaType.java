
package custom_types.wservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicQuota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainingTopupQuota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalConsumedQuota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalAllowedQuota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consumedTopupQuota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalTopupQuota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaType", propOrder = {
    "basicQuota",
    "startDate",
    "endDate",
    "remainingTopupQuota",
    "service",
    "totalConsumedQuota",
    "totalAllowedQuota",
    "consumedTopupQuota",
    "totalTopupQuota"
})
public class QuotaType {

    @XmlElementRef(name = "basicQuota", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basicQuota;
    @XmlElementRef(name = "startDate", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDate;
    @XmlElementRef(name = "endDate", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endDate;
    @XmlElementRef(name = "remainingTopupQuota", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingTopupQuota;
    @XmlElementRef(name = "service", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<String> service;
    @XmlElementRef(name = "totalConsumedQuota", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalConsumedQuota;
    @XmlElementRef(name = "totalAllowedQuota", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalAllowedQuota;
    @XmlElementRef(name = "consumedTopupQuota", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> consumedTopupQuota;
    @XmlElementRef(name = "totalTopupQuota", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalTopupQuota;

    /**
     * Gets the value of the basicQuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBasicQuota() {
        return basicQuota;
    }

    /**
     * Sets the value of the basicQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBasicQuota(JAXBElement<Double> value) {
        this.basicQuota = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<String> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<String> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the remainingTopupQuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingTopupQuota() {
        return remainingTopupQuota;
    }

    /**
     * Sets the value of the remainingTopupQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingTopupQuota(JAXBElement<Double> value) {
        this.remainingTopupQuota = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setService(JAXBElement<String> value) {
        this.service = value;
    }

    /**
     * Gets the value of the totalConsumedQuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalConsumedQuota() {
        return totalConsumedQuota;
    }

    /**
     * Sets the value of the totalConsumedQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalConsumedQuota(JAXBElement<Double> value) {
        this.totalConsumedQuota = value;
    }

    /**
     * Gets the value of the totalAllowedQuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalAllowedQuota() {
        return totalAllowedQuota;
    }

    /**
     * Sets the value of the totalAllowedQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalAllowedQuota(JAXBElement<Double> value) {
        this.totalAllowedQuota = value;
    }

    /**
     * Gets the value of the consumedTopupQuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getConsumedTopupQuota() {
        return consumedTopupQuota;
    }

    /**
     * Sets the value of the consumedTopupQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setConsumedTopupQuota(JAXBElement<Double> value) {
        this.consumedTopupQuota = value;
    }

    /**
     * Gets the value of the totalTopupQuota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalTopupQuota() {
        return totalTopupQuota;
    }

    /**
     * Sets the value of the totalTopupQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalTopupQuota(JAXBElement<Double> value) {
        this.totalTopupQuota = value;
    }

}
