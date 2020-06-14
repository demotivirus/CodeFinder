package Patterns.Builder.Example_01;

public class Director {
    public void constructSportCar(Builder builder){
        builder.setMaxSpeed(250);
        builder.setNumOfSeats(2);
        builder.setType(Type.SPORT_CAR);
    }

    public void constructLuxCar(Builder builder){
        builder.setType(Type.LUX_CAR);
        builder.setNumOfSeats(4);
        builder.setMaxSpeed(220);
    }

    public void constructFamilyCar(Builder builder){
        builder.setType(Type.FAMILY_CAR);
        builder.setMaxSpeed(180);
        builder.setNumOfSeats(7);
    }
}
