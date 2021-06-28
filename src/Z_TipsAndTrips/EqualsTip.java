package Z_TipsAndTrips;

import java.util.HashMap;
import java.util.Map;

public class EqualsTip {
    public static void main(String[] args) {
        Map<String, String> validationFields = new HashMap<>();
        validationFields.put("bank_name", "ПАО Сбербанк");
        String bankName = "ПАО Сбербанк";
        if (validationFields.get("bank_name") != null) {
            if (!bankName.equalsIgnoreCase(validationFields.get("bank_name")));
                System.out.println("NOT EQUAL");
        }

        //why console print NOT EQUAL?
        //i know answer))
    }
}
