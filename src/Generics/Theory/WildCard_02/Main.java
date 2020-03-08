package Generics.Theory.WildCard_02;

import java.util.ArrayList;
import java.util.List;

//Generics is invariance
public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        //List<Animal> animals = cats;
        //List<TinyCat> tinyCats = cats;

        //BUT ? is covariance
        List<Integer> integers = new ArrayList<>();
        List<? extends Number> nums = integers;

        //& contravariant
        List<Number> numbers = new ArrayList<>();
        List<? super Integer> itgrs = numbers;
    }
}
