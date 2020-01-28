package OOP.theory.AbstractClass.Example_02;

public abstract class Animal implements Greetings{
    private String name;
    private int age;

    /*
     * Abstract class not should
     * override interface method
     * and may not even declare it
     */
    public abstract void printGreeting();
}
