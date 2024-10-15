package assignment1.cinema.schedule;

import assignment1.cinema.movie.Movie;

public class StandardSchedule implements MovieSchedule {
    private Movie movie;
    private String time;

    public StandardSchedule() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StandardSchedule clone() {
        try {
            return (StandardSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
