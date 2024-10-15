package assignment1.cinema.config;

public class CinemaConfig {
    private static CinemaConfig instance;

    private String cinemaName;
    private int numberOfScreens;
    private String operatingOurs;

    private CinemaConfig() {
    }

    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }


    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getOperatingOurs() {
        return operatingOurs;
    }

    public void setOperatingOurs(String operatingOurs) {
        this.operatingOurs = operatingOurs;
    }
}
