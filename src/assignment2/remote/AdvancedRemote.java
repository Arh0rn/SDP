package assignment2.remote;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Advanced Remote: Power toggle.");
        if (device != null) {
            if (device instanceof TVDevice) {
                device.powerOn();
            } else {
                device.powerOff();
            }
        }
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Advanced Remote: Set channel to " + channel);
        device.setChannel(channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Advanced Remote: Set volume to " + volume);
        device.setVolume(volume);
    }

    public void mute() {
        System.out.println("Advanced Remote: Muting volume.");
        device.setVolume(0);
    }
}
