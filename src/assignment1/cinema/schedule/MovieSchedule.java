package assignment1.cinema.schedule;

import assignment1.cinema.movie.*;

public interface MovieSchedule extends Cloneable {
    MovieSchedule clone();

    void setMovie(Movie movie);
}
