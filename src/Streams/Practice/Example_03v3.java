package Streams.Practice;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example_03v3 {
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        bufferedReader.lines()
                .flatMap(n -> Stream.of(n.split("[^a-zA-Zа-яА-Я0-9']+")).map(m -> m.toLowerCase()))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
                    else return e2.getValue().compareTo(e1.getValue());
                })
                .limit(10)
                .forEach(f -> System.out.println(f.getKey()));

    }
}
