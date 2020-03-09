package Generics.Theory.Wildcard_04;

public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void put(T elem){
        this.t = elem;
    }
}
