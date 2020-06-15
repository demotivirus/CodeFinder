package Patterns.Factory.Example_03;

public class App {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();
        factory.createTransport("car");
        factory.createTransport("sdf");
    }
}
