package Lambdas.Theory.Example_12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Word");

        reverse(str -> str.toLowerCase(), list);
    }

    private static void reverse(Stringer stringer, List<String> list){
        List<String> reverse = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            s = sb.append(s).reverse().toString();
            reverse.add(stringer.func(s));
        }

        System.out.println(reverse);
    }
}
