package designParkingLotSystem;

public class PricingStrategyFactory {

    public static PricingStrategy getStrategy(VehicleType type) {
        return switch (type) {
            case BIKE -> new BikePricingStrategy();
            case CAR -> new CarPricingStrategy();
            case TRUCK -> new TruckPricingStrategy();
        };
    }
}
