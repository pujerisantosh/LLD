package factorypattern;

public class AudioPlayerFactory {
    public static AudioPlayer createPlayer(String format, String fileName) {
        switch (format.toLowerCase()) {
            case "mp3":
                return new MP3Player(fileName);
            case "wav":
                return new WAVPlayer(fileName);
            case "flac":
                return new FLACPlayer(fileName);
            default:
                throw new IllegalArgumentException(" format: " + format);
        }
    }
}
