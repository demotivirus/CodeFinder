package Generics.Theory.Example_10;

public class Box<T> {
    private T val;

    public Box(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}
