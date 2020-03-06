package Jenerics.Theory.Wildcard_01;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(88);
        Box<StringBuilder> sb = new Box<>(new StringBuilder("Text"));

        //err
        //if (box instanceof Box<Integer>)

        if (box instanceof Box<?>)
            System.out.println("This is box");

        if (sb instanceof Box<?>)
            System.out.println("This is box too");
    }
}
