package factoryPatternforAudioPlayer;

public abstract class AudioPlayer {
    protected String fileName;



    public AudioPlayer(String fileName){

        this.fileName = fileName;



    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();

}
