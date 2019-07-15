
package custom_types.wservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaReturn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{wservices.custom_types}BasicReturn"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quota" type="{wservices.custom_types}QuotaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaReturn", propOrder = {
    "quota"
})
public class QuotaReturn
    extends BasicReturn
{

    @XmlElementRef(name = "quota", namespace = "wservices.custom_types", type = JAXBElement.class, required = false)
    protected JAXBElement<QuotaType> quota;

    /**
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuotaType }{@code >}
     *     
     */
    public JAXBElement<QuotaType> getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuotaType }{@code >}
     *     
     */
    public void setQuota(JAXBElement<QuotaType> value) {
        this.quota = value;
    }

}
