package designParkingLotSystem;

public class ExitGate {

    public double exit(ParkingTicket ticket) {
        PricingStrategy pricing =
                PricingStrategyFactory.getStrategy(
                        ticket.getVehicle().getType());

        double fee = pricing.calculateFee(ticket);
        ticket.getSpot().free();
        return fee;
    }
}
