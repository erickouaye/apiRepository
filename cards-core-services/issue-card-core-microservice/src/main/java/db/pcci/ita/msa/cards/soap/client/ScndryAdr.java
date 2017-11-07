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
 * <p>Java class for ScndryAdr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScndryAdr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClntStmtTitle1" type="{http://www.equens.com/cards/issuing/types/v1.0}Max40Text"/&gt;
 *         &lt;element name="ClntStmtTitle2" type="{http://www.equens.com/cards/issuing/types/v1.0}Max40Text"/&gt;
 *         &lt;element name="ClntStmtTitle3" type="{http://www.equens.com/cards/issuing/types/v1.0}Max40Text"/&gt;
 *         &lt;element name="ClntAdrCareOf" type="{http://www.equens.com/cards/issuing/types/v1.0}Max40Text"/&gt;
 *         &lt;element name="ClntAdrStreet" type="{http://www.equens.com/cards/issuing/types/v1.0}Max40Text"/&gt;
 *         &lt;element name="ClntAdrSuburb" type="{http://www.equens.com/cards/issuing/types/v1.0}Max40Text"/&gt;
 *         &lt;element name="ClntAdrZip" type="{http://www.equens.com/cards/issuing/types/v1.0}Max9Text"/&gt;
 *         &lt;element name="ClntAdrCity" type="{http://www.equens.com/cards/issuing/types/v1.0}Max3Text"/&gt;
 *         &lt;element name="ClntAdrProvinceCd" type="{http://www.equens.com/cards/issuing/types/v1.0}Max3Text"/&gt;
 *         &lt;element name="ClntAdrCntryCd" type="{http://www.equens.com/cards/issuing/types/v1.0}Max3Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScndryAdr", namespace = "http://www.equens.com/cards/issuing/types/v1.0", propOrder = {
    "clntStmtTitle1",
    "clntStmtTitle2",
    "clntStmtTitle3",
    "clntAdrCareOf",
    "clntAdrStreet",
    "clntAdrSuburb",
    "clntAdrZip",
    "clntAdrCity",
    "clntAdrProvinceCd",
    "clntAdrCntryCd"
})
public class ScndryAdr implements ToString2
{

    @XmlElement(name = "ClntStmtTitle1", required = true)
    protected String clntStmtTitle1;
    @XmlElement(name = "ClntStmtTitle2", required = true)
    protected String clntStmtTitle2;
    @XmlElement(name = "ClntStmtTitle3", required = true)
    protected String clntStmtTitle3;
    @XmlElement(name = "ClntAdrCareOf", required = true)
    protected String clntAdrCareOf;
    @XmlElement(name = "ClntAdrStreet", required = true)
    protected String clntAdrStreet;
    @XmlElement(name = "ClntAdrSuburb", required = true)
    protected String clntAdrSuburb;
    @XmlElement(name = "ClntAdrZip", required = true)
    protected String clntAdrZip;
    @XmlElement(name = "ClntAdrCity", required = true)
    protected String clntAdrCity;
    @XmlElement(name = "ClntAdrProvinceCd", required = true)
    protected String clntAdrProvinceCd;
    @XmlElement(name = "ClntAdrCntryCd", required = true)
    protected String clntAdrCntryCd;

    /**
     * Gets the value of the clntStmtTitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntStmtTitle1() {
        return clntStmtTitle1;
    }

    /**
     * Sets the value of the clntStmtTitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntStmtTitle1(String value) {
        this.clntStmtTitle1 = value;
    }

    /**
     * Gets the value of the clntStmtTitle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntStmtTitle2() {
        return clntStmtTitle2;
    }

    /**
     * Sets the value of the clntStmtTitle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntStmtTitle2(String value) {
        this.clntStmtTitle2 = value;
    }

    /**
     * Gets the value of the clntStmtTitle3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntStmtTitle3() {
        return clntStmtTitle3;
    }

    /**
     * Sets the value of the clntStmtTitle3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntStmtTitle3(String value) {
        this.clntStmtTitle3 = value;
    }

    /**
     * Gets the value of the clntAdrCareOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAdrCareOf() {
        return clntAdrCareOf;
    }

    /**
     * Sets the value of the clntAdrCareOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAdrCareOf(String value) {
        this.clntAdrCareOf = value;
    }

    /**
     * Gets the value of the clntAdrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAdrStreet() {
        return clntAdrStreet;
    }

    /**
     * Sets the value of the clntAdrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAdrStreet(String value) {
        this.clntAdrStreet = value;
    }

    /**
     * Gets the value of the clntAdrSuburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAdrSuburb() {
        return clntAdrSuburb;
    }

    /**
     * Sets the value of the clntAdrSuburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAdrSuburb(String value) {
        this.clntAdrSuburb = value;
    }

    /**
     * Gets the value of the clntAdrZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAdrZip() {
        return clntAdrZip;
    }

    /**
     * Sets the value of the clntAdrZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAdrZip(String value) {
        this.clntAdrZip = value;
    }

    /**
     * Gets the value of the clntAdrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAdrCity() {
        return clntAdrCity;
    }

    /**
     * Sets the value of the clntAdrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAdrCity(String value) {
        this.clntAdrCity = value;
    }

    /**
     * Gets the value of the clntAdrProvinceCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAdrProvinceCd() {
        return clntAdrProvinceCd;
    }

    /**
     * Sets the value of the clntAdrProvinceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAdrProvinceCd(String value) {
        this.clntAdrProvinceCd = value;
    }

    /**
     * Gets the value of the clntAdrCntryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAdrCntryCd() {
        return clntAdrCntryCd;
    }

    /**
     * Sets the value of the clntAdrCntryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAdrCntryCd(String value) {
        this.clntAdrCntryCd = value;
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
            String theClntStmtTitle1;
            theClntStmtTitle1 = this.getClntStmtTitle1();
            strategy.appendField(locator, this, "clntStmtTitle1", buffer, theClntStmtTitle1, (this.clntStmtTitle1 != null));
        }
        {
            String theClntStmtTitle2;
            theClntStmtTitle2 = this.getClntStmtTitle2();
            strategy.appendField(locator, this, "clntStmtTitle2", buffer, theClntStmtTitle2, (this.clntStmtTitle2 != null));
        }
        {
            String theClntStmtTitle3;
            theClntStmtTitle3 = this.getClntStmtTitle3();
            strategy.appendField(locator, this, "clntStmtTitle3", buffer, theClntStmtTitle3, (this.clntStmtTitle3 != null));
        }
        {
            String theClntAdrCareOf;
            theClntAdrCareOf = this.getClntAdrCareOf();
            strategy.appendField(locator, this, "clntAdrCareOf", buffer, theClntAdrCareOf, (this.clntAdrCareOf!= null));
        }
        {
            String theClntAdrStreet;
            theClntAdrStreet = this.getClntAdrStreet();
            strategy.appendField(locator, this, "clntAdrStreet", buffer, theClntAdrStreet, (this.clntAdrStreet!= null));
        }
        {
            String theClntAdrSuburb;
            theClntAdrSuburb = this.getClntAdrSuburb();
            strategy.appendField(locator, this, "clntAdrSuburb", buffer, theClntAdrSuburb, (this.clntAdrSuburb!= null));
        }
        {
            String theClntAdrZip;
            theClntAdrZip = this.getClntAdrZip();
            strategy.appendField(locator, this, "clntAdrZip", buffer, theClntAdrZip, (this.clntAdrZip!= null));
        }
        {
            String theClntAdrCity;
            theClntAdrCity = this.getClntAdrCity();
            strategy.appendField(locator, this, "clntAdrCity", buffer, theClntAdrCity, (this.clntAdrCity!= null));
        }
        {
            String theClntAdrProvinceCd;
            theClntAdrProvinceCd = this.getClntAdrProvinceCd();
            strategy.appendField(locator, this, "clntAdrProvinceCd", buffer, theClntAdrProvinceCd, (this.clntAdrProvinceCd!= null));
        }
        {
            String theClntAdrCntryCd;
            theClntAdrCntryCd = this.getClntAdrCntryCd();
            strategy.appendField(locator, this, "clntAdrCntryCd", buffer, theClntAdrCntryCd, (this.clntAdrCntryCd!= null));
        }
        return buffer;
    }

}
