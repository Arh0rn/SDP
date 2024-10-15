package assignment2.audio;

public class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    @Override
    public void playWAV(String fileName) {
        System.out.println("Playing WAV file. Name: " + fileName);
    }

    @Override
    public void playAAC(String fileName) {
        System.out.println("Playing AAC file. Name: " + fileName);
    }
}