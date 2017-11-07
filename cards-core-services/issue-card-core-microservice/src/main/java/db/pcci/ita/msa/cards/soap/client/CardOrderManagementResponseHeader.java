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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for CardOrderManagementResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOrderManagementResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.equens.com/cards/issuing/types/v1.0}Max36Text"/&gt;
 *         &lt;element name="ExecutionEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ExecutionTimestamp" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOrderManagementResponseHeader", propOrder = {
    "requestID",
    "executionEffectiveDate",
    "executionTimestamp"
})
public class CardOrderManagementResponseHeader implements ToString2
{

    @XmlElement(name = "RequestID", required = true)
    protected String requestID;
    @XmlElement(name = "ExecutionEffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executionEffectiveDate;
    @XmlElement(name = "ExecutionTimestamp", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar executionTimestamp;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the executionEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionEffectiveDate() {
        return executionEffectiveDate;
    }

    /**
     * Sets the value of the executionEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutionEffectiveDate(XMLGregorianCalendar value) {
        this.executionEffectiveDate = value;
    }

    /**
     * Gets the value of the executionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionTimestamp() {
        return executionTimestamp;
    }

    /**
     * Sets the value of the executionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutionTimestamp(XMLGregorianCalendar value) {
        this.executionTimestamp = value;
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
            String theRequestID;
            theRequestID = this.getRequestID();
            strategy.appendField(locator, this, "requestID", buffer, theRequestID, (this.requestID!= null));
        }
        {
            XMLGregorianCalendar theExecutionEffectiveDate;
            theExecutionEffectiveDate = this.getExecutionEffectiveDate();
            strategy.appendField(locator, this, "executionEffectiveDate", buffer, theExecutionEffectiveDate, (this.executionEffectiveDate!= null));
        }
        {
            XMLGregorianCalendar theExecutionTimestamp;
            theExecutionTimestamp = this.getExecutionTimestamp();
            strategy.appendField(locator, this, "executionTimestamp", buffer, theExecutionTimestamp, (this.executionTimestamp!= null));
        }
        return buffer;
    }

}
