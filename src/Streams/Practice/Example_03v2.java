package Streams.Practice;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example_03v2 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        String text = "Lorem ipsum dolor sit amet, "
                + "consectetur 32 adipiscing elit. "
                + "Sed sodales consectetur purus at faucibus."
                + " Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. "
                + "Morbi lacinia velit blandit 32 tincidunt 32 efficitur. "
                + "Vestibulum eget metus imperdiet sapien laoreet faucibus. "
                + "Nunc eget vehicula mauris, ac auctor lorem. 32 Lorem ipsum dolor sit amet,"
                + " consectetur adipiscing elit. Integer vel odio 32 nec mi tempor dignissim.";
        ByteArrayInputStream textInput = new ByteArrayInputStream(text.getBytes());
        System.setIn(textInput);

        countOfWords(System.in, charset);
    }

    private static void countOfWords(InputStream in, Charset charset) {
        Scanner scn = new Scanner(System.in, "UTF-8").useDelimiter("[^a-zA-Zа-яА-Я0-9']+");
        List<String> list = new ArrayList<>();
        while (scn.hasNext()){
            list.add(scn.next());
        }

        list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry<String, Long>::getValue)
                .reversed()
                .thenComparing(Map.Entry::getKey))
                .limit(10)
                .forEach(f -> System.out.println(f.getKey()));
    }
}
