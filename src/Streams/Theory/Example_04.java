package Streams.Theory;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Example_04 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 2, 9, 4, 39, -1, 99, 67);

        IntSummaryStatistics intStream = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(intStream);
    }
}
