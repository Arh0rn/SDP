package assignment2.smarthome;

public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        light.turnOff();
        thermostat.setTemperature(18);
        entertainmentSystem.turnOff();
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        light.turnOn();
        thermostat.setTemperature(22);
    }

    public void nightMode() {
        System.out.println("Night mode activated...");
        thermostat.setTemperature(20);
        entertainmentSystem.turnOff();
    }

    public void movieMode(String movie) {
        System.out.println("Movie mode activated...");
        thermostat.setTemperature(22);
        entertainmentSystem.turnOn();
        entertainmentSystem.playMovie(movie);
    }
}
