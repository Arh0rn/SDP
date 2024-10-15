package assignment1.cinema.factory;

import assignment1.cinema.movie.Movie;
import assignment1.cinema.movie.RegularMovie;

public class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}
