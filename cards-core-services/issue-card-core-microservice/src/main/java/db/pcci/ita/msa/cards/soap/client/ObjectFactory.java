//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.07 at 04:16:53 PM EET 
//


package db.pcci.ita.msa.cards.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the db.pcci.ita.msa.cards.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IssuePrimaryCard_QNAME = new QName("http://www.equens.com/cards/issuing/cardordermanagement", "IssuePrimaryCard");
    private final static QName _IssuePrimaryCardResponse_QNAME = new QName("http://www.equens.com/cards/issuing/cardordermanagement", "IssuePrimaryCardResponse");
    private final static QName _IssueSupplementaryCard_QNAME = new QName("http://www.equens.com/cards/issuing/cardordermanagement", "IssueSupplementaryCard");
    private final static QName _IssueSupplementaryCardResponse_QNAME = new QName("http://www.equens.com/cards/issuing/cardordermanagement", "IssueSupplementaryCardResponse");
    private final static QName _WebServiceSystemException_QNAME = new QName("http://www.equens.com/cards/issuing/cardordermanagement", "WebServiceSystemException");
    private final static QName _WebServiceApplicationException_QNAME = new QName("http://www.equens.com/cards/issuing/cardordermanagement", "WebServiceApplicationException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: db.pcci.ita.msa.cards.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebServiceApplicationFault }
     * 
     */
    public WebServiceApplicationFault createWebServiceApplicationFault() {
        return new WebServiceApplicationFault();
    }

    /**
     * Create an instance of {@link WebServiceSystemFault }
     * 
     */
    public WebServiceSystemFault createWebServiceSystemFault() {
        return new WebServiceSystemFault();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType }
     * 
     */
    public IssueSupplementaryCardResponseType createIssueSupplementaryCardResponseType() {
        return new IssueSupplementaryCardResponseType();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.AdditionalData }
     * 
     */
    public IssueSupplementaryCardResponseType.AdditionalData createIssueSupplementaryCardResponseTypeAdditionalData() {
        return new IssueSupplementaryCardResponseType.AdditionalData();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType }
     * 
     */
    public IssueSupplementaryCardRequestType createIssueSupplementaryCardRequestType() {
        return new IssueSupplementaryCardRequestType();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.AdditionalData }
     * 
     */
    public IssueSupplementaryCardRequestType.AdditionalData createIssueSupplementaryCardRequestTypeAdditionalData() {
        return new IssueSupplementaryCardRequestType.AdditionalData();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.CardData }
     * 
     */
    public IssueSupplementaryCardRequestType.CardData createIssueSupplementaryCardRequestTypeCardData() {
        return new IssueSupplementaryCardRequestType.CardData();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.CustomerData }
     * 
     */
    public IssueSupplementaryCardRequestType.CustomerData createIssueSupplementaryCardRequestTypeCustomerData() {
        return new IssueSupplementaryCardRequestType.CustomerData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType }
     * 
     */
    public IssuePrimaryCardResponseType createIssuePrimaryCardResponseType() {
        return new IssuePrimaryCardResponseType();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.AdditionalData }
     * 
     */
    public IssuePrimaryCardResponseType.AdditionalData createIssuePrimaryCardResponseTypeAdditionalData() {
        return new IssuePrimaryCardResponseType.AdditionalData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType }
     * 
     */
    public IssuePrimaryCardRequestType createIssuePrimaryCardRequestType() {
        return new IssuePrimaryCardRequestType();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.AdditionalData }
     * 
     */
    public IssuePrimaryCardRequestType.AdditionalData createIssuePrimaryCardRequestTypeAdditionalData() {
        return new IssuePrimaryCardRequestType.AdditionalData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.CardData }
     * 
     */
    public IssuePrimaryCardRequestType.CardData createIssuePrimaryCardRequestTypeCardData() {
        return new IssuePrimaryCardRequestType.CardData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.CustomerData }
     * 
     */
    public IssuePrimaryCardRequestType.CustomerData createIssuePrimaryCardRequestTypeCustomerData() {
        return new IssuePrimaryCardRequestType.CustomerData();
    }

    /**
     * Create an instance of {@link CardOrderManagementHeader }
     * 
     */
    public CardOrderManagementHeader createCardOrderManagementHeader() {
        return new CardOrderManagementHeader();
    }

    /**
     * Create an instance of {@link CardOrderManagementResponseHeader }
     * 
     */
    public CardOrderManagementResponseHeader createCardOrderManagementResponseHeader() {
        return new CardOrderManagementResponseHeader();
    }

    /**
     * Create an instance of {@link CardKeyType }
     * 
     */
    public CardKeyType createCardKeyType() {
        return new CardKeyType();
    }

    /**
     * Create an instance of {@link Counters }
     * 
     */
    public Counters createCounters() {
        return new Counters();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link CAMSCobolError }
     * 
     */
    public CAMSCobolError createCAMSCobolError() {
        return new CAMSCobolError();
    }

    /**
     * Create an instance of {@link ScndryAdr }
     * 
     */
    public ScndryAdr createScndryAdr() {
        return new ScndryAdr();
    }

    /**
     * Create an instance of {@link Adr }
     * 
     */
    public Adr createAdr() {
        return new Adr();
    }

    /**
     * Create an instance of {@link WebServiceApplicationFault.Result }
     * 
     */
    public WebServiceApplicationFault.Result createWebServiceApplicationFaultResult() {
        return new WebServiceApplicationFault.Result();
    }

    /**
     * Create an instance of {@link WebServiceSystemFault.Result }
     * 
     */
    public WebServiceSystemFault.Result createWebServiceSystemFaultResult() {
        return new WebServiceSystemFault.Result();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.ProductKey }
     * 
     */
    public IssueSupplementaryCardResponseType.ProductKey createIssueSupplementaryCardResponseTypeProductKey() {
        return new IssueSupplementaryCardResponseType.ProductKey();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.CustomerKey }
     * 
     */
    public IssueSupplementaryCardResponseType.CustomerKey createIssueSupplementaryCardResponseTypeCustomerKey() {
        return new IssueSupplementaryCardResponseType.CustomerKey();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.CardKey }
     * 
     */
    public IssueSupplementaryCardResponseType.CardKey createIssueSupplementaryCardResponseTypeCardKey() {
        return new IssueSupplementaryCardResponseType.CardKey();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.DeviceKey }
     * 
     */
    public IssueSupplementaryCardResponseType.DeviceKey createIssueSupplementaryCardResponseTypeDeviceKey() {
        return new IssueSupplementaryCardResponseType.DeviceKey();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.AccountKey }
     * 
     */
    public IssueSupplementaryCardResponseType.AccountKey createIssueSupplementaryCardResponseTypeAccountKey() {
        return new IssueSupplementaryCardResponseType.AccountKey();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.CardData }
     * 
     */
    public IssueSupplementaryCardResponseType.CardData createIssueSupplementaryCardResponseTypeCardData() {
        return new IssueSupplementaryCardResponseType.CardData();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.PaymentData }
     * 
     */
    public IssueSupplementaryCardResponseType.PaymentData createIssueSupplementaryCardResponseTypePaymentData() {
        return new IssueSupplementaryCardResponseType.PaymentData();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.AdditionalData.ProcessingRelationship }
     * 
     */
    public IssueSupplementaryCardResponseType.AdditionalData.ProcessingRelationship createIssueSupplementaryCardResponseTypeAdditionalDataProcessingRelationship() {
        return new IssueSupplementaryCardResponseType.AdditionalData.ProcessingRelationship();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.AdditionalData.CardStatus }
     * 
     */
    public IssueSupplementaryCardResponseType.AdditionalData.CardStatus createIssueSupplementaryCardResponseTypeAdditionalDataCardStatus() {
        return new IssueSupplementaryCardResponseType.AdditionalData.CardStatus();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardResponseType.AdditionalData.AccountStatus }
     * 
     */
    public IssueSupplementaryCardResponseType.AdditionalData.AccountStatus createIssueSupplementaryCardResponseTypeAdditionalDataAccountStatus() {
        return new IssueSupplementaryCardResponseType.AdditionalData.AccountStatus();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.ProductKey }
     * 
     */
    public IssueSupplementaryCardRequestType.ProductKey createIssueSupplementaryCardRequestTypeProductKey() {
        return new IssueSupplementaryCardRequestType.ProductKey();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.CustomerKey }
     * 
     */
    public IssueSupplementaryCardRequestType.CustomerKey createIssueSupplementaryCardRequestTypeCustomerKey() {
        return new IssueSupplementaryCardRequestType.CustomerKey();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.AddressData }
     * 
     */
    public IssueSupplementaryCardRequestType.AddressData createIssueSupplementaryCardRequestTypeAddressData() {
        return new IssueSupplementaryCardRequestType.AddressData();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.AccountKey }
     * 
     */
    public IssueSupplementaryCardRequestType.AccountKey createIssueSupplementaryCardRequestTypeAccountKey() {
        return new IssueSupplementaryCardRequestType.AccountKey();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.AdditionalData.ExternalReference }
     * 
     */
    public IssueSupplementaryCardRequestType.AdditionalData.ExternalReference createIssueSupplementaryCardRequestTypeAdditionalDataExternalReference() {
        return new IssueSupplementaryCardRequestType.AdditionalData.ExternalReference();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.AdditionalData.OccupationData }
     * 
     */
    public IssueSupplementaryCardRequestType.AdditionalData.OccupationData createIssueSupplementaryCardRequestTypeAdditionalDataOccupationData() {
        return new IssueSupplementaryCardRequestType.AdditionalData.OccupationData();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.CardData.CardSpendingLimit }
     * 
     */
    public IssueSupplementaryCardRequestType.CardData.CardSpendingLimit createIssueSupplementaryCardRequestTypeCardDataCardSpendingLimit() {
        return new IssueSupplementaryCardRequestType.CardData.CardSpendingLimit();
    }

    /**
     * Create an instance of {@link IssueSupplementaryCardRequestType.CustomerData.CustomerContact }
     * 
     */
    public IssueSupplementaryCardRequestType.CustomerData.CustomerContact createIssueSupplementaryCardRequestTypeCustomerDataCustomerContact() {
        return new IssueSupplementaryCardRequestType.CustomerData.CustomerContact();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.ProductKey }
     * 
     */
    public IssuePrimaryCardResponseType.ProductKey createIssuePrimaryCardResponseTypeProductKey() {
        return new IssuePrimaryCardResponseType.ProductKey();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.CustomerKey }
     * 
     */
    public IssuePrimaryCardResponseType.CustomerKey createIssuePrimaryCardResponseTypeCustomerKey() {
        return new IssuePrimaryCardResponseType.CustomerKey();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.CardKey }
     * 
     */
    public IssuePrimaryCardResponseType.CardKey createIssuePrimaryCardResponseTypeCardKey() {
        return new IssuePrimaryCardResponseType.CardKey();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.DeviceKey }
     * 
     */
    public IssuePrimaryCardResponseType.DeviceKey createIssuePrimaryCardResponseTypeDeviceKey() {
        return new IssuePrimaryCardResponseType.DeviceKey();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.AccountKey }
     * 
     */
    public IssuePrimaryCardResponseType.AccountKey createIssuePrimaryCardResponseTypeAccountKey() {
        return new IssuePrimaryCardResponseType.AccountKey();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.CardData }
     * 
     */
    public IssuePrimaryCardResponseType.CardData createIssuePrimaryCardResponseTypeCardData() {
        return new IssuePrimaryCardResponseType.CardData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.PaymentData }
     * 
     */
    public IssuePrimaryCardResponseType.PaymentData createIssuePrimaryCardResponseTypePaymentData() {
        return new IssuePrimaryCardResponseType.PaymentData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.AdditionalData.ProcessingRelationship }
     * 
     */
    public IssuePrimaryCardResponseType.AdditionalData.ProcessingRelationship createIssuePrimaryCardResponseTypeAdditionalDataProcessingRelationship() {
        return new IssuePrimaryCardResponseType.AdditionalData.ProcessingRelationship();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.AdditionalData.CardStatus }
     * 
     */
    public IssuePrimaryCardResponseType.AdditionalData.CardStatus createIssuePrimaryCardResponseTypeAdditionalDataCardStatus() {
        return new IssuePrimaryCardResponseType.AdditionalData.CardStatus();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardResponseType.AdditionalData.AccountStatus }
     * 
     */
    public IssuePrimaryCardResponseType.AdditionalData.AccountStatus createIssuePrimaryCardResponseTypeAdditionalDataAccountStatus() {
        return new IssuePrimaryCardResponseType.AdditionalData.AccountStatus();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.ProductKey }
     * 
     */
    public IssuePrimaryCardRequestType.ProductKey createIssuePrimaryCardRequestTypeProductKey() {
        return new IssuePrimaryCardRequestType.ProductKey();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.CustomerKey }
     * 
     */
    public IssuePrimaryCardRequestType.CustomerKey createIssuePrimaryCardRequestTypeCustomerKey() {
        return new IssuePrimaryCardRequestType.CustomerKey();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.CardMData }
     * 
     */
    public IssuePrimaryCardRequestType.CardMData createIssuePrimaryCardRequestTypeCardMData() {
        return new IssuePrimaryCardRequestType.CardMData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.AddressData }
     * 
     */
    public IssuePrimaryCardRequestType.AddressData createIssuePrimaryCardRequestTypeAddressData() {
        return new IssuePrimaryCardRequestType.AddressData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.AccountData }
     * 
     */
    public IssuePrimaryCardRequestType.AccountData createIssuePrimaryCardRequestTypeAccountData() {
        return new IssuePrimaryCardRequestType.AccountData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.AdditionalData.ExternalReference }
     * 
     */
    public IssuePrimaryCardRequestType.AdditionalData.ExternalReference createIssuePrimaryCardRequestTypeAdditionalDataExternalReference() {
        return new IssuePrimaryCardRequestType.AdditionalData.ExternalReference();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.AdditionalData.OccupationData }
     * 
     */
    public IssuePrimaryCardRequestType.AdditionalData.OccupationData createIssuePrimaryCardRequestTypeAdditionalDataOccupationData() {
        return new IssuePrimaryCardRequestType.AdditionalData.OccupationData();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.CardData.CardSpendingLimit }
     * 
     */
    public IssuePrimaryCardRequestType.CardData.CardSpendingLimit createIssuePrimaryCardRequestTypeCardDataCardSpendingLimit() {
        return new IssuePrimaryCardRequestType.CardData.CardSpendingLimit();
    }

    /**
     * Create an instance of {@link IssuePrimaryCardRequestType.CustomerData.CustomerContact }
     * 
     */
    public IssuePrimaryCardRequestType.CustomerData.CustomerContact createIssuePrimaryCardRequestTypeCustomerDataCustomerContact() {
        return new IssuePrimaryCardRequestType.CustomerData.CustomerContact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuePrimaryCardRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.equens.com/cards/issuing/cardordermanagement", name = "IssuePrimaryCard")
    public JAXBElement<IssuePrimaryCardRequestType> createIssuePrimaryCard(IssuePrimaryCardRequestType value) {
        return new JAXBElement<IssuePrimaryCardRequestType>(_IssuePrimaryCard_QNAME, IssuePrimaryCardRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuePrimaryCardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.equens.com/cards/issuing/cardordermanagement", name = "IssuePrimaryCardResponse")
    public JAXBElement<IssuePrimaryCardResponseType> createIssuePrimaryCardResponse(IssuePrimaryCardResponseType value) {
        return new JAXBElement<IssuePrimaryCardResponseType>(_IssuePrimaryCardResponse_QNAME, IssuePrimaryCardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueSupplementaryCardRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.equens.com/cards/issuing/cardordermanagement", name = "IssueSupplementaryCard")
    public JAXBElement<IssueSupplementaryCardRequestType> createIssueSupplementaryCard(IssueSupplementaryCardRequestType value) {
        return new JAXBElement<IssueSupplementaryCardRequestType>(_IssueSupplementaryCard_QNAME, IssueSupplementaryCardRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueSupplementaryCardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.equens.com/cards/issuing/cardordermanagement", name = "IssueSupplementaryCardResponse")
    public JAXBElement<IssueSupplementaryCardResponseType> createIssueSupplementaryCardResponse(IssueSupplementaryCardResponseType value) {
        return new JAXBElement<IssueSupplementaryCardResponseType>(_IssueSupplementaryCardResponse_QNAME, IssueSupplementaryCardResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceSystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.equens.com/cards/issuing/cardordermanagement", name = "WebServiceSystemException")
    public JAXBElement<WebServiceSystemFault> createWebServiceSystemException(WebServiceSystemFault value) {
        return new JAXBElement<WebServiceSystemFault>(_WebServiceSystemException_QNAME, WebServiceSystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceApplicationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.equens.com/cards/issuing/cardordermanagement", name = "WebServiceApplicationException")
    public JAXBElement<WebServiceApplicationFault> createWebServiceApplicationException(WebServiceApplicationFault value) {
        return new JAXBElement<WebServiceApplicationFault>(_WebServiceApplicationException_QNAME, WebServiceApplicationFault.class, null, value);
    }

}
