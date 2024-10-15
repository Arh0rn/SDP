package assignment2.smarthome;

public class SmartHomeApp {
    public static void main(String[] args) {
        // Создаём устройства умного дома
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        // Создаём фасад для управления умным домом
        SmartHomeFacade smartHome = new SmartHomeFacade(light, thermostat, entertainmentSystem);

        // Симуляция работы
        smartHome.arriveHome();
        System.out.println("-----------------");
        smartHome.movieMode("Inception");
        System.out.println("-----------------");
        smartHome.nightMode();
        System.out.println("-----------------");
        smartHome.leaveHome();
    }
}
