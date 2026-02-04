package designParkingLotSystem;

public class CarPricingStrategy implements PricingStrategy{
    public double calculateFee(ParkingTicket ticket) {
        return 50.0;
    }
}
