package Generics.Theory.Example_01;

public class Box<T> {
    private T val;

    public Box(T val){
        this.val = val;
    }

    public T getVal(){
        return val;
    }

    public void setVal(T val){
        this.val = val;
    }
}
