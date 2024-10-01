package cinema.movie;

public class IMAXMovie implements Movie {
    private String title;

    public IMAXMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "IMAX";
    }
}
