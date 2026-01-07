package threadexample;

public class Client {
    public static void main(String[] args) {

        System.out.println("i'm the main class");


        ScalerThread t1= new ScalerThread(new Adder());
        ScalerThread t2 = new ScalerThread( new Subtractor());

        t1.start();
        t2.start();

    }
}
