import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import db.pcci.ita.msa.cards.soap.client.IssuePrimaryCardRequestType;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by oprecos on 06.11.2017.
 */

@RunWith(SpringRunner.class)
public class JsonSchemaValidationTest {

    @Test
    public void testJsonSchemaValidation(){
//    	String myString = "{\"cardOrderManagementHeader\":null,\"productKey\":null,\"customerKey\":null,\"customerData\":null,\"cardData\":null,\"cardMData\":null,\"addressData\":[],\"accountData\":{\"statementCode\":null,\"productCode\":null,\"iban\":null,"+
//"\"bankAcctDescription\":null,\"referenceID\":null,\"minPaymentOption\":null,\"minPaymentAmount\":null,\"minPaymentPercentage\":null,\"paymentDueDay\":null,\"guaranteeInd\":null,\"additionalProductCode\":\"AdditionalProductCode_Test\","+
//"\"additionalIBAN\":\"IBAN_Test\",\"additionalAcctDescription\":\"AdditionalAcctDescription_Test\",\"additionalReferenceID\":null,\"issuingBranch\":null,\"ownerBranch\":null,\"clbaseAmount\":null},\"additionalData\":null}";
    	String myString = "{\n" +
				"  \"foo\" : \"3\",\n" +
				"  \"fooooo\" : 2\n" +
				"}";
//    	InputStream is = new ByteArrayInputStream( myString.getBytes());new JSONTokener(arg0)
//    	 JSONObject jsonSchema = new JSONObject(
//    		      new JSONTokener(JsonSchemaValidationTest.class.getResourceAsStream("jsonschema/com_equens_cards_issuing_messages.jsonschema")));
//    		    JSONObject jsonSubject = new JSONObject(
//    		      new JSONTokener(is);
//    		     
//    		    Schema schema = SchemaLoader.load(jsonSchema);
//    		    jsonSchema.validate(jsonSubject);
    	JsonNode fstabSchema;
		try {
			fstabSchema = JsonLoader.fromResource("/jsonschema/schema.jsonschema");
		
    	JsonNode subject = JsonLoader.fromString(myString);
    	JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
    	JsonSchema schema = factory.getJsonSchema(fstabSchema);
    	System.out.println("Validate instance ---->" + schema.validInstance(subject));
    	ProcessingReport report;
			boolean b = schema.validInstanceUnchecked(subject);
			System.out.println(b);
			report = schema.validate(subject, true); System.out.println("RESULT ---->" + report.isSuccess());
    	//System.out.println(report);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    @Test
	public void testJsonSchemaValidationSecond(){

		try (InputStream inputStream = getClass().getResourceAsStream("jsonschema/com_equens_cards_issuing_messages.jsonschema")) {
			JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
			Schema schema = SchemaLoader.load(rawSchema);
			schema.validate(new JSONObject("{\"hello\" : world\"}")); // throws a ValidationException if this object is invalid
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
