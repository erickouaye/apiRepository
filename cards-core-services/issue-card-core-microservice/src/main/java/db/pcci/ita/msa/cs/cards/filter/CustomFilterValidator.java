package db.pcci.ita.msa.cs.cards.filter;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 * Created by oprecos on 07.11.2017.
 */
@Component
public class CustomFilterValidator implements FilterValidator {
    @Override
    public boolean validate(String body) {
        /*
        * Check if requestID field exists, you can add more fields to validate
        * */
        try {
            JSONObject jsonObject = new JSONObject(body);
            JSONObject cardOrderManagementHeader = jsonObject.getJSONObject("cardOrderManagementHeader");
            cardOrderManagementHeader.getString("requestID");
        }catch (JSONException e){
            return false;
        }
        return true;
    }
}
