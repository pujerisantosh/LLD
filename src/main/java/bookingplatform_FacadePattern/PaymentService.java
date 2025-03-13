package bookingplatform_FacadePattern;

public class PaymentService {

    public boolean processPyament(String customer , double amount){
        System.out.println("Payment of $" + amount + " processed for " + customer);
        return true;
    }
}
