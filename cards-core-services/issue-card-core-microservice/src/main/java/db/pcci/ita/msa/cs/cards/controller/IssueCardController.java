package db.pcci.ita.msa.cs.cards.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardRequestType;
import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardResponseType;
import db.pcci.ita.msa.cs.cards.service.IssueCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * Created by oprecos on 06.11.2017.
 */

@RestController
public class IssueCardController {

    @Autowired
    private IssueCardService issueCardService;

    @PostMapping("/cards")
    public IssuePrimaryCardResponseType getIssuePrimaryCardResponse(IssuePrimaryCardRequestType issuePrimaryCardRequestType) throws Exception {

        return issueCardService.getIssuePrimaryCardResponse(issuePrimaryCardRequestType);
    }
}
