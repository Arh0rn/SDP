package assignment2.remote;

public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Basic Remote: Power toggle.");
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
        System.out.println("Basic Remote: Set channel to " + channel);
        device.setChannel(channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Basic Remote: Set volume to " + volume);
        device.setVolume(volume);
    }
}