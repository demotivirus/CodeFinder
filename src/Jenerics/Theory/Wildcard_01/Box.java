package Jenerics.Theory.Wildcard_01;

public class Box<T> {
    private T val;

    public Box(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}
