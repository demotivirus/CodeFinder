package Jenerics.Theory.Example_10;

public class Main {
    public static void main(String[] args) {
        BoxSon<String, String> boxSon = new BoxSon<>("War", "Peace");
        System.out.println(boxSon.getVal());
        System.out.println(boxSon.getVal2());
    }
}
