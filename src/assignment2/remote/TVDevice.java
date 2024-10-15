package assignment2.remote;

public class TVDevice implements Device {
    private boolean powerOn = false;
    private int channel = 1;
    private int volume = 10;

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("TV is now ON.");
    }

    @Override
    public void powerOff() {
        powerOn = false;
        System.out.println("TV is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }
}