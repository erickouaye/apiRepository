package db.pcci.ita.msa.cs.cards.service;

import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardRequestType;
import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardResponseType;
import javafx.util.Pair;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;

import javax.xml.bind.JAXBElement;

/**
 * Created by oprecos on 06.11.2017.
 */
@Service
public class IssueCardService {
    //TO DO

    @Value("${application.soap.url}")
    private String SOAP_URL;

    @Value("${application.soap.action}")
    private String SOAP_ACTION;

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    private static Logger LOGGER = Logger.getLogger(IssueCardService.class);

    public JAXBElement<IssuePrimaryCardResponseType> getIssuePrimaryCardResponse(JAXBElement<IssuePrimaryCardRequestType> issuePrimaryCardRequestType) throws Exception {
        JAXBElement<IssuePrimaryCardResponseType> response;
        LOGGER.info(issuePrimaryCardRequestType);
        try {
            response = (JAXBElement<IssuePrimaryCardResponseType>) webServiceTemplate.marshalSendAndReceive(
                    SOAP_URL,
                    issuePrimaryCardRequestType,
                    message -> ((SoapMessage) message).setSoapAction(SOAP_ACTION)
            );
        } catch (SoapFaultClientException ex) {
            throw new Exception();
        }

        return response;
    }
}
