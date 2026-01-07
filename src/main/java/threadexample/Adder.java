package threadexample;

public class Adder implements  Runnable{
    @Override
    public void run() {
        System.out.println("I am the Subtractor class");
    }
}
