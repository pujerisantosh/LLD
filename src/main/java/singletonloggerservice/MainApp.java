package singletonloggerservice;

public class MainApp {
    public static void main(String[] args) {

        PaymentService payment = new PaymentService();


        payment.processPayment();

    }
}
