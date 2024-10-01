import cinema.config.CinemaConfig;
import cinema.factory.*;
import cinema.movie.Movie;
import cinema.ui.Button;
import cinema.ui.UIFactory;
import cinema.ui.dark.*;
import cinema.booking.TicketBooking;
import cinema.schedule.MovieSchedule;
import cinema.schedule.StandardSchedule;
public class Main {
    public static void main(String[] args) {
        // Singleton usage
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("Starlight Cinemas");
        System.out.println("Cinema Name: " + config.getCinemaName());
        // Factory Method usage
        MovieFactory regularFactory = new RegularMovieFactory();
        Movie movie = regularFactory.createMovie("Inception");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());
        // Abstract Factory usage
        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();
        // Builder usage
        TicketBooking booking = new TicketBooking.TicketBookingBuilder()
                .setMovieTitle("Inception")
                .setSeatNumber("A10")
                .setSnackCombo("Popcorn & Soda")
                .build();

        // Prototype usage
        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");
        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie);
        System.out.println("Cinema Management System initialized.");
    }
}