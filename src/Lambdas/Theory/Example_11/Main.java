package Lambdas.Theory.Example_11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        list.add(4);

        processElement(x -> x * x, list);
    }

    private static void processElement(Processor processor, List<Integer> list){
        List<Double> doubleList = new ArrayList<>();
        for (Integer i : list)
            doubleList.add(processor.process(i));

        System.out.println(doubleList);
    }
}
