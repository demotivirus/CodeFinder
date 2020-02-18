package OOP.theory.PassByReferenceOrByValue.Example_04;

import OOP.theory.PassByReferenceOrByValue.Example_03.Example_03;

public class Main {
    public static void main(String[] args) {
        int x = 18;
        Example_04 ex = new Example_04(x);
        ex.setX(20);
        System.out.println(x);

//        StringBuilder name = new StringBuilder("Leon");
//        Example_03 ex2 = new Example_03(name.toString());
//        ex2.switchName(name.toString());
//        System.out.println(ex2.getName());

        String name = "Leon";
        Example_03 ex2 = new Example_03(name);
        ex2.switchName(name);
        System.out.println(ex2.getName());
    }
}
