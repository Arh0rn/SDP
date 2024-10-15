package assignment1.cinema.factory;

import assignment1.cinema.movie.Movie;

public abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}
