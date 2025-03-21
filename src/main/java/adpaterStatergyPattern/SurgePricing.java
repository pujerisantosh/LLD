package adpaterStatergyPattern;

public class SurgePricing implements  PricingStrategy{

    private static final double BASE_FARE = 5.0;
    private static final double SURGE_MULTIPLIER = 2.0;

    @Override
    public double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE * SURGE_MULTIPLIER;
    }
}
