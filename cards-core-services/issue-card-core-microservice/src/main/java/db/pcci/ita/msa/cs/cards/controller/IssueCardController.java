package db.pcci.ita.msa.cs.cards.controller;

import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardRequestType;
import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardResponseType;
import db.pcci.ita.msa.cards.soap.client.ObjectFactory;
import db.pcci.ita.msa.cs.cards.service.IssueCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBElement;

/**
 * Created by oprecos on 06.11.2017.
 */

@RestController
public class IssueCardController {

    @Autowired
    private IssueCardService issueCardService;

    @PostMapping("/cards")
    @ExceptionHandler(Exception.class)
    public JAXBElement<IssuePrimaryCardResponseType> getIssuePrimaryCardResponse(@RequestBody IssuePrimaryCardRequestType issuePrimaryCardRequestType) throws Exception {
        IssuePrimaryCardRequestType.CustomerData customerData = issuePrimaryCardRequestType.getCustomerData();

        return issueCardService.getIssuePrimaryCardResponse(createIssuePrimaryCardRequestType(issuePrimaryCardRequestType));
    }

    private JAXBElement<IssuePrimaryCardRequestType> createIssuePrimaryCardRequestType(IssuePrimaryCardRequestType issuePrimaryCardRequestType) {
        ObjectFactory issuePrimaryCardObjectFactory = new ObjectFactory();
        return issuePrimaryCardObjectFactory.createIssuePrimaryCard(issuePrimaryCardRequestType);
    }
}
