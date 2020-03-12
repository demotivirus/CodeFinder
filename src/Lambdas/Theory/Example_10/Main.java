package Lambdas.Theory.Example_10;

import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Comparator<Integer> comparator = (x, y) ->{
            return (x < y) ? -1 : ((x > y) ? 1 : 0);
        };

        System.out.println(comparator.compare(50, 60));
        System.out.println(comparator.compare(100, 100));
    }
}
