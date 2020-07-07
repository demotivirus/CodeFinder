package Patterns.Decorator.Example_03;

public class QuoteDecorator implements PrinterInterface{
    private PrinterInterface printerInterface;

    public QuoteDecorator(PrinterInterface printerInterface){
        this.printerInterface = printerInterface;
    }

    @Override
    public void print() {
        System.out.print("\"");
        printerInterface.print();
        System.out.println("\"");
    }
}
