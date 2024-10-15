package assignment2.remote;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        Device dvd = new DVDDevice();
        Device soundSystem = new SoundSystemDevice();

        // Использование BasicRemote для ТВ
        BasicRemote basicRemote = new BasicRemote(tv);
        basicRemote.togglePower();
        basicRemote.setChannel(5);
        basicRemote.setVolume(15);

        System.out.println("----------------");

        // Использование AdvancedRemote для DVD
        AdvancedRemote advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.togglePower();
        advancedRemote.setVolume(8);
        advancedRemote.mute();

        System.out.println("----------------");

        // Использование AdvancedRemote для звуковой системы
        AdvancedRemote soundRemote = new AdvancedRemote(soundSystem);
        soundRemote.togglePower();
        soundRemote.setVolume(20);
        soundRemote.mute();
    }
}