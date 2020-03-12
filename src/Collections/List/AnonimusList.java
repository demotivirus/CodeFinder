package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class AnonimusList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>(){{
            add("Hello");
            add("it's");
            add("anonymous");
            add("class");
        }};
    }
}
