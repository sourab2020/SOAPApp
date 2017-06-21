
package trng.soap.service.loan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processLoanResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processLoanResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibilitymessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eligibilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processLoanResponse", propOrder = {
    "eligibilitymessage",
    "eligibilityCode"
})
public class ProcessLoanResponse {

    @XmlElement(required = true)
    protected String eligibilitymessage;
    @XmlElement(required = true)
    protected String eligibilityCode;

    /**
     * Gets the value of the eligibilitymessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilitymessage() {
        return eligibilitymessage;
    }

    /**
     * Sets the value of the eligibilitymessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilitymessage(String value) {
        this.eligibilitymessage = value;
    }

    /**
     * Gets the value of the eligibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityCode() {
        return eligibilityCode;
    }

    /**
     * Sets the value of the eligibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityCode(String value) {
        this.eligibilityCode = value;
    }

}
