package Patterns.Brige.Example_01;

public class BasicRemote implements Remote{
    protected Device device;

    public BasicRemote(){}

    public BasicRemote(Device device){
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote power");
        if (device.isEnable())
            device.disable();
        else device.enable();
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote channel up");
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote channel down");
        if (device.getChannel() < 0)
            device.setChannel(0);
        device.setChannel(device.getChannel() - 1);
    }
}
