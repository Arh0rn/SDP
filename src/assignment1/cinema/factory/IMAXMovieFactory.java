package assignment1.cinema.factory;

import assignment1.cinema.movie.Movie;
import assignment1.cinema.movie.IMAXMovie;

public class IMAXMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}
