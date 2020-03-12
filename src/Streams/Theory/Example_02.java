package Streams.Theory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example_02 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>(){{
            add("Hello");
            add("it's");
            add("anonymous");
            add("class");
            add("we");
            add("use");
            add("usually");
            add("Java");
            add("methods");
            add("and");
            add("you");
            add("?");
        }};

        stringList.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>1");

        stringList.stream().sorted().filter(s -> s.startsWith("a")).forEach(System.out::println);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>2");

        System.out.println(stringList);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>3");

        stringList.stream()
                .map(String::toUpperCase)
                .sorted((x, y) -> x.compareTo(y))
                .forEach(str -> System.out.print(str + " "));
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>4");

        boolean anyStartWithA = stringList.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println(anyStartWithA);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>5");

        boolean allStartsWithA = stringList.stream().allMatch(s -> s.startsWith("a"));
        System.out.println(allStartsWithA);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>6");

        boolean nonStartsWithZ = stringList.stream().noneMatch(s -> s.startsWith("z"));
        System.out.println(nonStartsWithZ);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>7");

        long wordsInCollection = stringList.stream().count();
        System.out.println(wordsInCollection);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>8");

        stringList.stream().map(str -> str.toLowerCase()).forEach(str -> System.out.print(str.concat(" | ")));
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>9");

        Optional<String> optional = stringList.stream().reduce((x, y) -> x.concat(y));
        System.out.println(optional.get());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>10");

        String first = stringList.stream().findFirst().orElse("Null");
        System.out.println(first);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>11");

        String last = stringList.stream().skip(stringList.size() - 1).findAny().orElse("Null");
        System.out.println(last);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>12");

        List<String> newArray = stringList.stream().map(s -> s + "_1").collect(Collectors.toList());
        System.out.println(newArray);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>13");

        stringList.stream().sorted().forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>14");

        stringList.stream().sorted((x, y) -> y.compareTo(x)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>15");
    }
}
