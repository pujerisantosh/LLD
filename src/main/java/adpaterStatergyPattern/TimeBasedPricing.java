package adpaterStatergyPattern;

public class TimeBasedPricing implements PricingStrategy{

    private static final double BASE_FARE = 5.0;
    private static final double PER_MINUTE_RATE = 0.5;

    @Override
    public double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + (PER_MINUTE_RATE * rideDetails.getDuration());
    }
}
