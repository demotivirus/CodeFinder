package Patterns.Factory.Example_03;

public class TransportFactory {
    public Transport createTransport(String transport){
        switch (transport.toLowerCase()){
            case "car": return new Car();
            case "helicopter": return new Helicopter();
            default: throw new IllegalArgumentException("Transport not found " + this.getClass());
        }
    }
}
