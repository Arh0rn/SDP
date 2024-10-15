package assignment2.remote;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();

    public abstract void setChannel(int channel);

    public abstract void setVolume(int volume);
}