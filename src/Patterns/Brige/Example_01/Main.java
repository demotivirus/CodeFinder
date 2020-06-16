package Patterns.Brige.Example_01;

public class Main {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new TV());
    }

    private static void testDevice(Device device){
        System.out.println("Test with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("============================");

        System.out.println("Test with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("============================");
    }
}
