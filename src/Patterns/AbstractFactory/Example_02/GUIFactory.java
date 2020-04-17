package Patterns.AbstractFactory.Example_02;

public interface GUIFactory {
    Button createButton();
    Select createSelect();
    TextField createTextField();
}
