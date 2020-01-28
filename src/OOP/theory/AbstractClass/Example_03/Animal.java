package OOP.theory.AbstractClass.Example_03;

public abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void doSomething(){
        System.out.println("This is static method in abstract class");
    }

    public void doSomethingToo(){
        System.out.println("This is NON-static method in abstract class");
    }
}
