package Exceptions.theory.CarExample;

public class Car implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Машина закрывается...");
    }

    public void drive(){
        System.out.println("Машина поехала.");
    }
}