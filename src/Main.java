import cinema.config.CinemaConfig;
import cinema.factory.MovieFactory;
import cinema.factory.RegularMovieFactory;
import cinema.factory.IMAXMovieFactory;
import cinema.movie.Movie;

public class Main {
    public static void main(String[] args) {
        CinemaConfig conf = CinemaConfig.getInstance();
        //Singleton
        conf.setCinemaName("GoldenCinema");
        conf.setNumberOfScreens(20);
        //Factory
        Movie movie = null;
        MovieFactory factory = null;
        String type = "IMAX";
        String title = "Hancock";

        if (type.equalsIgnoreCase("Regular")) {
            factory = new RegularMovieFactory();
        } else if (type.equalsIgnoreCase("IMAX")) {
            factory = new IMAXMovieFactory();
        } else {
            System.out.println("Invalid movie type.");
            return;
        }

        movie = factory.createMovie(title);
        System.out.println(movie.getTitle() + " " + movie.getType());
    }
}