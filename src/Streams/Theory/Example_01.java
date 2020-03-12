package Streams.Theory;

import java.util.*;

public class Example_01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Don't", "give", "up");
        list.stream()
                .filter(n -> n.startsWith("g"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println(list);

        List<String> arrayList = new ArrayList<>();

        for (String s : list){
            if (s.startsWith("g"))
                arrayList.add(s.toUpperCase());
        }

        Collections.sort(arrayList);

        for (String s : arrayList)
            System.out.println(s);
    }
}
