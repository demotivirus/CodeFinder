package Patterns.Flyweight.Example_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(factory.createDeveloper("java"));
            list.add(factory.createDeveloper("python"));
        }

        for (Developer d : list){
            d.writeCode();
        }
    }
}
