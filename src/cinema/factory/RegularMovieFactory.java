package cinema.factory;

import cinema.movie.Movie;
import cinema.movie.RegularMovie;

public class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}
