package Patterns.AbstractFactory.Example_02;

import Patterns.AbstractFactory.Example_02.Windows.WindowsButton;
import Patterns.AbstractFactory.Example_02.Windows.WindowsSelect;
import Patterns.AbstractFactory.Example_02.Windows.WindowsTextField;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        System.out.println("Create button for Windows os");
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Create select for Windows os");
        return new WindowsSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Create text field for Windows os");
        return new WindowsTextField();
    }
}
