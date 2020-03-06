package Jenerics.Theory.Example_02;

public class MultyBox<T, U> {
    private T val1;
    private U val2;

    public MultyBox(T val1, U val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public U getVal2() {
        return val2;
    }

    public void setVal2(U val2) {
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return "MultyBox: " +
                "val1 = " + val1 +
                ", val2 = " + val2;
    }
}
