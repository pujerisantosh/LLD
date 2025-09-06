package factoryPatternforAudioPlayer;

public class AudioPlayerTest {
    public static void main(String[] args) {

        AudioPlayer mp3 = AudioPlayerFactory.createPlayer(MediaFormat.MP3, "song.mp3");
        mp3.play();
        mp3.pause();
        mp3.stop();

        AudioPlayer wav = AudioPlayerFactory.createPlayer(MediaFormat.WAV, "sound.wav");
        wav.play();

        AudioPlayer flac = AudioPlayerFactory.createPlayer(MediaFormat.FLAC, "music.flac");
        flac.play();
    }
    }

