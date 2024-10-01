package cinema.factory;

import cinema.movie.Movie;

public abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}
