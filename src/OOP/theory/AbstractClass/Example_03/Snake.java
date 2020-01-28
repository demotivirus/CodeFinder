package OOP.theory.AbstractClass.Example_03;

public class Snake extends Animal{

    //Static method can't override
    //@Override
    public static void doSomething(){
        System.out.println("This is static method in Snake class");
    }

    @Override
    public void doSomethingToo(){
        System.out.println("This is NON-static method in Snake class");
    }
}
