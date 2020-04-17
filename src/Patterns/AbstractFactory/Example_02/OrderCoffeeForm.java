package Patterns.AbstractFactory.Example_02;

public class OrderCoffeeForm {
    private final TextField textField;
    private final Select select;
    private final Button button;

    public OrderCoffeeForm(GUIFactory factory){
        System.out.println("Create coffee form");
        textField = factory.createTextField();
        select = factory.createSelect();
        button = factory.createButton();
    }
}
