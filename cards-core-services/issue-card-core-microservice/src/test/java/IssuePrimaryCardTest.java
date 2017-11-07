import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import db.pcci.ita.msa.cards.soap.client.CardOrderManagementHeader;
import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardRequestType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by oprecos on 06.11.2017.
 */

@RunWith(SpringRunner.class)
public class IssuePrimaryCardTest {

    @Test
    public void testGeneratingIssuePrimaryCard(){
        IssuePrimaryCardRequestType issuePrimaryCardRequestType = new IssuePrimaryCardRequestType();
        IssuePrimaryCardRequestType.AccountData accountData = new IssuePrimaryCardRequestType.AccountData();
        accountData.setAdditionalAcctDescription("AdditionalAcctDescription_Test");
        accountData.setAdditionalIBAN("AdditionalIBAN_Test");
        accountData.setAdditionalProductCode("AdditionalProductCode_Test");
        accountData.setAdditionalIBAN("IBAN_Test");
        CardOrderManagementHeader cardOrderManagementHeader = new CardOrderManagementHeader();
        cardOrderManagementHeader.setRequestID("idRequestTest");
        issuePrimaryCardRequestType.setCardOrderManagementHeader(cardOrderManagementHeader);
        issuePrimaryCardRequestType.setAccountData(accountData);

        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonInString = mapper.writeValueAsString(issuePrimaryCardRequestType);
            System.out.println(jsonInString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
