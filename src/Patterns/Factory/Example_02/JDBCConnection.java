package Patterns.Factory.Example_02;

public class JDBCConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("JDBC connection is active");
    }
}
