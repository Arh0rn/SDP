package assignment2.learn;

public class LearningPlatformApp {
    public static void main(String[] args) {
        VideoLecture video1 = new ProxyVideoLecture("Design Patterns in Java");
        VideoLecture video2 = new ProxyVideoLecture("Advanced Java Programming");

        video1.getInfo();
        video2.getInfo();

        System.out.println("----------------");
        
        video1.play();
        video2.play();
    }
}
