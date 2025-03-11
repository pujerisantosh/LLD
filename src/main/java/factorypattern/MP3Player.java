package factorypattern;

public class MP3Player extends AudioPlayer {


    public MP3Player(String fileName) {
        super(fileName);
    }
    @Override
    public void play() {
        System.out.println("MP3: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("MP3 : " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("MP3 : " + fileName);
    }
}
