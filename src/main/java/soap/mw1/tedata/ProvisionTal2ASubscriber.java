
package soap.mw1.tedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provisionTal2aSubscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisionTal2aSubscriber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{tedata.mw1.soap}MandatoryString"/&gt;
 *         &lt;element name="userName" type="{tedata.mw1.soap}MandatoryString"/&gt;
 *         &lt;element name="serviceName" type="{tedata.mw1.soap}MandatoryString"/&gt;
 *         &lt;element name="startDate" type="{tedata.mw1.soap}MandatoryString"/&gt;
 *         &lt;element name="endDate" type="{tedata.mw1.soap}MandatoryString"/&gt;
 *         &lt;element name="resetConsumedQuota" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="carryOver" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisionTal2aSubscriber", propOrder = {
    "key",
    "userName",
    "serviceName",
    "startDate",
    "endDate",
    "resetConsumedQuota",
    "carryOver"
})
public class ProvisionTal2ASubscriber {

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String serviceName;
    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(required = true)
    protected String endDate;
    protected boolean resetConsumedQuota;
    protected double carryOver;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the resetConsumedQuota property.
     * 
     */
    public boolean isResetConsumedQuota() {
        return resetConsumedQuota;
    }

    /**
     * Sets the value of the resetConsumedQuota property.
     * 
     */
    public void setResetConsumedQuota(boolean value) {
        this.resetConsumedQuota = value;
    }

    /**
     * Gets the value of the carryOver property.
     * 
     */
    public double getCarryOver() {
        return carryOver;
    }

    /**
     * Sets the value of the carryOver property.
     * 
     */
    public void setCarryOver(double value) {
        this.carryOver = value;
    }

}
