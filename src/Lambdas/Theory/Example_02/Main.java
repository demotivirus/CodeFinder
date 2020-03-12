package Lambdas.Theory.Example_02;

public class Main {
    public static void main(String[] args) {

    }

    public static NumberGenerator<? super Number> getGenerator() {
        NumberGenerator<?> numberGenerator = (n) -> n.intValue() > 0 ? true : false;
        return (NumberGenerator<? super Number>) numberGenerator;
    }
}
