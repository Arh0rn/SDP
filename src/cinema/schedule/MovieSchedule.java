package cinema.schedule;
import cinema.movie.*;
public interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(Movie movie);
}
