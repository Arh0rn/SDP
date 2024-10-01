package cinema.factory;

import cinema.movie.Movie;
import cinema.movie.IMAXMovie;

public class IMAXMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}
