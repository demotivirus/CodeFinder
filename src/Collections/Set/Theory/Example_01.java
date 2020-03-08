package Collections.Set.Theory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example_01 {
    public static void main(String[] args) {
        String[] text = ("Суета сует, - сказал Проповедник, " +
        "- суета сует: всё суета.").toLowerCase().split("[ ,:\\-.]+");

        Set<String> uniques = new HashSet<>();
        for (String s : text) {
            System.out.println(uniques.add(s));
            //System.out.println(uniques.contains(s));
        }

        System.out.println(Arrays.asList(uniques));
    }
}
