package Jenerics.Theory.RawType_02;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(88);
        Box<String> stringBox = new Box<>("Text");

        //RAW TYPES
        Box raw = new Box(98.6);
        double d = (double) raw.getVal();

        //err
        //int i = (int) raw.getVal();

        //err
//        stringBox = raw;
//        String str = stringBox.getVal();

        //err
//        raw = integerBox;
//        d = (double) raw.getVal();
    }
}
