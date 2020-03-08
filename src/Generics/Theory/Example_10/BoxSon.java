package Generics.Theory.Example_10;

public class BoxSon<T, U> extends Box<T>{
    private U val2;

    public BoxSon(T val, U val1) {
        super(val);
        this.val2 = val1;
    }

    public U getVal2() {
        return val2;
    }
}
