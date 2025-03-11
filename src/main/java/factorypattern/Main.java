package factorypattern;

public class Main {

    public static void main(String[] args) {
        // Factory ಬಳಸಿ audio player instances ಸೃಷ್ಟಿಸುತ್ತೇವೆ
        AudioPlayer mp3Player = AudioPlayerFactory.createPlayer("mp3", "song.mp3");
        AudioPlayer wavPlayer = AudioPlayerFactory.createPlayer("wav", "audio.wav");
        AudioPlayer flacPlayer = AudioPlayerFactory.createPlayer("flac", "music.flac");

        // MP3 ಪ್ಲೇ ಮಾಡೋದು
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        System.out.println("--------------------------");

        // WAV ಪ್ಲೇ ಮಾಡೋದು
        wavPlayer.play();
        wavPlayer.pause();
        wavPlayer.stop();

        System.out.println("--------------------------");

        // FLAC ಪ್ಲೇ ಮಾಡೋದು
        flacPlayer.play();
        flacPlayer.pause();
        flacPlayer.stop();
    }
}
