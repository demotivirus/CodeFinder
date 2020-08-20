package Streams.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example_05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 6, 8, 14, 24, 18, 0);
        System.out.println(findMax(numbers));
    }

    public static int findMax(List<Integer> numbers){
        return numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new NullPointerException("List of numbers is empty"));
    }
}
