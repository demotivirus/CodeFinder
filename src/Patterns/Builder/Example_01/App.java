package Patterns.Builder.Example_01;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        System.out.println(carBuilder);

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructFamilyCar(carManualBuilder);
        System.out.println(carManualBuilder);

    }
}
