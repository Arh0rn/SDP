package assignment2.remote;

public class DVDDevice implements Device {
    private boolean powerOn = false;
    private int volume = 5;

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("DVD Player is now ON.");
    }

    @Override
    public void powerOff() {
        powerOn = false;
        System.out.println("DVD Player is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD Player doesn't support channel settings.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD Player volume set to " + volume);
    }
}