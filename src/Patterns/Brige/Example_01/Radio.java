package Patterns.Brige.Example_01;

public class Radio implements Device{
    private boolean isEnable;
    private int volume;
    private int channel;

    public Radio(){
        isEnable = false;
        volume = 30;
        channel = 1;
    }


    @Override
    public boolean isEnable() {
        return isEnable;
    }

    @Override
    public void enable() {
        isEnable = true;
    }

    @Override
    public void disable() {
        isEnable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100)
            this.volume = 100;
        else if (volume < 0)
            this.volume = 0;
        else this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("This is radio");
        System.out.println("Radio status is " + isEnable);
        System.out.println("Volume = " + volume);
        System.out.println("Channel = " + channel);
    }
}
