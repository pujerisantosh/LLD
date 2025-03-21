package adpaterStatergyPattern;

public class DistanceBasedPricing implements PricingStrategy{

    private static final double BASE_FARE = 5.0;
    private static final double PER_KILOMETER_RATE = 2.0;

    @Override
    public double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + (PER_KILOMETER_RATE * rideDetails.getDistance());
    }
}
