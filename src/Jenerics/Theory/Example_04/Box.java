package Jenerics.Theory.Example_04;

public class Box<T extends Number> {
    private T[] nums;

    public Box(T[] nums){
        this.nums = nums;
    }

    public double average(){
        double res = 0.0;
        for (Number number : nums)
            res += number.doubleValue();
        return res / nums.length;
    }

    public double sum(){
        double res = 0.0;
        for (Number number : nums)
            res += number.doubleValue();
        return res;
    }
}
