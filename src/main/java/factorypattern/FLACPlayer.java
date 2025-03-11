package factorypattern;

public class FLACPlayer extends  AudioPlayer{
    public FLACPlayer(String fileName) {
        super(fileName);
    }

    @Override
    public void play() {
        System.out.println("FLAC : " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("FLAC : " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("FLAC : " + fileName);
    }
}
