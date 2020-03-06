package Jenerics.Theory.Example_08;

import java.util.Arrays;

public class Box<T extends Comparable<T>> implements MinMax<T>{
    private T[] nums;

    public Box(T[] nums){
        this.nums = nums;
    }

    @Override
    public T min() {
        T min = nums[0];

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i].compareTo(min) < 0)
//                min = nums[i];
//        }

        for (T t : nums){
            if (t.compareTo(min) < 0)
                min = t;
        }
        return min;
    }

    @Override
    public T max() {
        T max = nums[0];
        for (T t : nums){
            if (t.compareTo(max) > 0)
                max = t;
        }
        return max;
    }

    @Override
    public String toString() {
        return "Box: " +
                "nums = " + Arrays.toString(nums) + " " +
                "min = " + min() + ", " +
                "max = " + max();
    }
}
