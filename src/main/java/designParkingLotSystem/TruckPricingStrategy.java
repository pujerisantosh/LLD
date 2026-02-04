package designParkingLotSystem;

public class TruckPricingStrategy implements  PricingStrategy{
    public double calculateFee(ParkingTicket ticket) {
        return 100.0;
    }
}
