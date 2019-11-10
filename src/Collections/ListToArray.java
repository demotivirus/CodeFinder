package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Winter");
        list.add("Spring");
        list.add("Summer");
        list.add("Autumn");

        String[] array = list.toArray(new String[list.size()]);
        for (String str : array)
            System.out.println(str);
    }
}
