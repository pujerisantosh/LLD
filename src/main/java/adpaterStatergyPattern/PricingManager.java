package adpaterStatergyPattern;

public class PricingManager {

    private PricingStrategy pricingStrategy;

    public PricingManager(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculatePrice(RideDetails rideDetails) {
        return pricingStrategy.calculatePrice(rideDetails);
    }
}
