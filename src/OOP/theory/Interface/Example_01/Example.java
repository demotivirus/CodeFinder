package OOP.theory.Interface.Example_01;

public class Example implements InterfaceC {
    @Override
    public void methodC() {
        System.out.println("Method C");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodA() {
        System.out.println("Method A");
    }
}
