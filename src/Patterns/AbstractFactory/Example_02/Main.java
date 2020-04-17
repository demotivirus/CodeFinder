package Patterns.AbstractFactory.Example_02;

public class Main {
    public static void main(String[] args) {
        drawOrderCoffeeForm();
    }

    public static void drawOrderCoffeeForm(){
        String osName = System.getProperty("os.name").toLowerCase();

        GUIFactory factory;
        if (osName.startsWith("win"))
            factory = new WindowsGUIFactory();
        else if (osName.startsWith("mac"))
            factory = new MacGUIFactory();
        else {
            System.out.println("Unknown os :(");
            return;
        }

        OrderCoffeeForm orderCoffeeForm = new OrderCoffeeForm(factory);
    }
}
