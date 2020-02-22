package Streams;

import java.util.stream.IntStream;

public class Example_01 {
    public static void main(String[] args) {
        IntStream i = pseudoRandomStream(13);
        i.limit(20).forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> ((x * x) / 10) % 1000);
    }
}
