package Jenerics.Theory.Example_02;

public class Main {
    public static void main(String[] args) {
        MultyBox<String, Byte> multyBox = new MultyBox<>("Thom", (byte) 28);
        System.out.println(multyBox);
    }
}
