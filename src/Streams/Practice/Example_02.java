package Streams.Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example_02 {
    public static void main(String[] args) {

    }

    public static  <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.sorted(order).collect(Collectors.toList());

        if(list.isEmpty()){
            minMaxConsumer.accept(null, null);
            return;
        }

        minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
    }
}
