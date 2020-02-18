package OOP.theory.PassByReferenceOrByValue.Example_05;

public class Main {
    public static void main(String[] args) {
        String baz = "Hah!";
        foo(baz);
        System.out.println(baz);
    }

    private static void foo(Object bar) {
        bar = null;
    }
}
