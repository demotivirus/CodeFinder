package Jenerics.Theory.Example_03;

public class Box<T> {
    private T val1;
    private T val2;
    private T val3;

    public Box(T val1, T val2, T val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    @Override
    public String toString() {
        return "Box: " +
                "val1 = " + val1 +
                ", val2 = " + val2 +
                ", val3 = " + val3;
    }
}
