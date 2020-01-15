package OOP.theory.abstractClass.Example_04;

/*
 * Methods in an abstract class,
 * unlike an interface,
 * can have different access modifiers
 */
public abstract class Animal {

    private void mainMethod(){}

    void defaultMethod(){}

    protected void protectedMethod(){}

    protected abstract void abstractMethod();

    private static void staticPrivateMethod(){}
}
