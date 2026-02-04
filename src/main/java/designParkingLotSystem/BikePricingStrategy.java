package designParkingLotSystem;

public class BikePricingStrategy implements  PricingStrategy {

    public double calculateFee(ParkingTicket ticket) {
        return 20.0;
    }
}
