package Patterns.Decorator.Example_03;

public class Main {
    public static void main(String[] args) {
        PrinterInterface printer = new Printer("Hello world");
        printer.print();
        System.out.println();

        PrinterInterface printer2 = new QuoteDecorator(new Printer("Hello world"));
        printer2.print();
    }
}
