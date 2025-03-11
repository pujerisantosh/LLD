package factorypattern;

public abstract class AudioPlayer {
    protected String fileName;
    protected int volume;
    protected double playbackRate;

    public AudioPlayer(String fileName){
        this.fileName = fileName;
        this.volume =100;
        this.playbackRate = 1.0;
    }


    public abstract void play();

    public abstract void pause();

    public abstract void stop();
}
