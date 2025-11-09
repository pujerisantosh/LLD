package singletonloggerservice;

public class PaymentService {

    public void processPayment(){
        LoggerService.getInstance().log("Processing payment...");
    }


}



