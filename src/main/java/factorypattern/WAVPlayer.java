package factorypattern;

public class WAVPlayer extends AudioPlayer{
    public WAVPlayer(String fileName) {
        super(fileName);
    }

    @Override
    public void play() {
        System.out.println("WAV : " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("WAV : " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("WAV : " + fileName);
    }
}


