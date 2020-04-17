package Patterns.Factory.Example_02;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection jdbc = factory.getConnection("JDBC");
        jdbc.connect();
    }
}
