package Streams.Theory;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsCreateMethods {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("Hello", "collections", "streams");
        Stream<String> streamFromCollection = collection.stream();
        System.out.println(streamFromCollection.collect(Collectors.toList()));

        Stream<String> streamFromValues = Stream.of("Hello", "values", "streams");
        System.out.println(streamFromValues.collect(Collectors.toList()));

        String[] arr = {"Hello", "arrays", "streams"};
        Stream<String> streamFromArrays = Arrays.stream(arr);
        System.out.println(streamFromArrays.collect(Collectors.toList()));

        IntStream streamFromText = "Your message wos here".chars();
        System.out.print("Your message wos here = ");
        streamFromText.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.Builder<String> build = Stream.builder();
        Stream<String> streamFromBuilder = build.add("And").add("here").build();
        System.out.println(streamFromBuilder.collect(Collectors.toList()));

        Stream<String> parallelStream = collection.parallelStream();
        System.out.println("Parallel " + parallelStream.collect(Collectors.toList()));

        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 2);
        System.out.println(streamFromIterate.limit(5).collect(Collectors.toList()));

        Stream<String> streamFromGenerate = Stream.generate(() -> "Java");
        System.out.println(streamFromGenerate.limit(5).collect(Collectors.toList()));

        Stream<String> emptyStream = Stream.empty();
        System.out.println(emptyStream.collect(Collectors.toList()));
    }
}
