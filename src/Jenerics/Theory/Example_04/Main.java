package Jenerics.Theory.Example_04;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {8, 18, 36, 54, 81, 91, 15, 18, 99, 101};
        Box<Integer> box = new Box<>(arr);
        System.out.println(box.sum());
        System.out.println(box.average());
    }
}
