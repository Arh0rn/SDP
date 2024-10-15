package assignment2.learn;

public class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video lecture: " + title);
    }

    @Override
    public void getInfo() {
        System.out.println("Video Lecture Title: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing video lecture: " + title);
    }
}