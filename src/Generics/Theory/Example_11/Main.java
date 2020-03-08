package Generics.Theory.Example_11;

public class Main {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>("String");
        Box<String> stringBox = new Box<>("String");

        //objectBox = stringBox;
    }
}
