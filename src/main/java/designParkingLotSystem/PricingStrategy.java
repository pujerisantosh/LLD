package designParkingLotSystem;

public interface PricingStrategy {
    double calculateFee(ParkingTicket ticket);
}
