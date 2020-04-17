package Patterns.Factory.Example_02;

public class HibernateConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("Hibernate connection is active");
    }
}
