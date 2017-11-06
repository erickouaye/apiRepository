package db.pcci.ita.msa.cs.cards.service;

import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardRequestType;
import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardResponseType;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;

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

    public IssuePrimaryCardResponseType getIssuePrimaryCardResponse(IssuePrimaryCardRequestType issuePrimaryCardRequestType) throws Exception {
        IssuePrimaryCardResponseType response;
        try {
            response = (IssuePrimaryCardResponseType) webServiceTemplate.marshalSendAndReceive(
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
