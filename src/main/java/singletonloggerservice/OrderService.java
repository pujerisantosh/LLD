package singletonloggerservice;

public class OrderService {

    public void processOrder(){
        LoggerService.getInstance().log("order Processing ");
    }
}
