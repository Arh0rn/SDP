package assignment2.remote;

public class SoundSystemDevice implements Device {
    private boolean powerOn = false;
    private int volume = 15;

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("Sound System is now ON.");
    }

    @Override
    public void powerOff() {
        powerOn = false;
        System.out.println("Sound System is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System doesn't support channel settings.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound System volume set to " + volume);
    }
}