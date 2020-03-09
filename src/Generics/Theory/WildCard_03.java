package Generics.Theory;

import java.util.ArrayList;
import java.util.List;

public class WildCard_03 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);

//        List<? extends Number> nums = integers;
//        nums.add(4);

        List<? super Integer> nums = integers;
        nums.add(8);
        System.out.println(nums.get(1));

        List<? extends Number> numbers = integers;
        System.out.println(numbers.get(1));
        //numbers.add(9);
    }
}
