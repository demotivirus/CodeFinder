package Patterns.Adapter.Example_05;

public class Main {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.carWash(new Audi());

        //carWash.carWash(new Man());

        carWash.carWash(new CarWashToTrackAdapter(new Man()));

        CarWashToTrackAdapter carWashToTrackAdapter = new CarWashToTrackAdapter(new Man());
        carWashToTrackAdapter.wash();
    }
}
