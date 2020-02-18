package OOP.theory.PassByReferenceOrByValue.Example_06;

public class Example_06 {
    private int[] arr;

    public Example_06(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public int[] switchArray(){
        return this.arr = new int[]{10, 10, 10, 10, 10};
    }
}
