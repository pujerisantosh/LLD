package factoryPatternforAudioPlayer;

import static factoryPatternforAudioPlayer.MediaFormat.*;

public class AudioPlayerFactory {

    public static  AudioPlayer createPlayer(MediaFormat format , String fileName) {
        switch (format) {
            case MP3:
                return new MP3Player(fileName);
            case WAV:
                return new WAVPlayer(fileName);
            case FLAC:
                return new FLACPlayer(fileName);
            default:
                throw new IllegalArgumentException("Unsupported format: " + format);

        }

    }
}
