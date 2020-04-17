package Patterns.AbstractFactory.Example_02;

import Patterns.AbstractFactory.Example_02.Mac.MacButton;
import Patterns.AbstractFactory.Example_02.Mac.MacSelect;
import Patterns.AbstractFactory.Example_02.Mac.MacTextField;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        System.out.println("Create button for Mac os");
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Create select for Mac os");
        return new MacSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Create text field Mac os");
        return new MacTextField();
    }
}
