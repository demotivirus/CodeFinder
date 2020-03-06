package Jenerics.Theory.Example_01;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(10);
        System.out.println(box.getVal());

        //incompatible types
        //box.setVal("String");

        box.setVal(60);
        System.out.println(box.getVal());

        Box<String> box1 = new Box<>("JAVA");
        System.out.println(box1.getVal());
    }
}
