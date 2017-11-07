//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.07 at 04:16:53 PM EET 
//


package db.pcci.ita.msa.cards.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for WebServiceApplicationFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebServiceApplicationFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ResultDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceApplicationFault", namespace = "http://www.equens.com/generic/exceptions/cards/issuing", propOrder = {
    "result"
})
public class WebServiceApplicationFault implements ToString2
{

    @XmlElement(name = "Result", required = true)
    protected WebServiceApplicationFault.Result result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceApplicationFault.Result }
     *     
     */
    public WebServiceApplicationFault.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceApplicationFault.Result }
     *     
     */
    public void setResult(WebServiceApplicationFault.Result value) {
        this.result = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            WebServiceApplicationFault.Result theResult;
            theResult = this.getResult();
            strategy.appendField(locator, this, "result", buffer, theResult, (this.result!= null));
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ResultDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resultCode",
        "resultDescription"
    })
    public static class Result implements ToString2
    {

        @XmlElement(name = "ResultCode", namespace = "http://www.equens.com/generic/exceptions/cards/issuing", required = true)
        protected String resultCode;
        @XmlElement(name = "ResultDescription", namespace = "http://www.equens.com/generic/exceptions/cards/issuing", required = true)
        protected String resultDescription;

        /**
         * Gets the value of the resultCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultCode() {
            return resultCode;
        }

        /**
         * Sets the value of the resultCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultCode(String value) {
            this.resultCode = value;
        }

        /**
         * Gets the value of the resultDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultDescription() {
            return resultDescription;
        }

        /**
         * Sets the value of the resultDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultDescription(String value) {
            this.resultDescription = value;
        }

        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                String theResultCode;
                theResultCode = this.getResultCode();
                strategy.appendField(locator, this, "resultCode", buffer, theResultCode, (this.resultCode!= null));
            }
            {
                String theResultDescription;
                theResultDescription = this.getResultDescription();
                strategy.appendField(locator, this, "resultDescription", buffer, theResultDescription, (this.resultDescription!= null));
            }
            return buffer;
        }

    }

}
