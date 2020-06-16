package Patterns.Adapter.Example_04;

public class AdapterJavaToDatabase extends JavaApp implements Database{
    @Override
    public void create() {
        createObj();
    }

    @Override
    public void read() {
        readObj();
    }

    @Override
    public void update() {
        updateObj();
    }

    @Override
    public void delete() {
        deleteObj();
    }
}
