package threadexample;

public class Subtractor implements Runnable {
    @Override
    public void run() {
        System.out.println("Subtractor");
    }
}
