package adpaterStatergyPattern;

public class Main {

    public static void main(String[] args) {
        RideDetails rideDetails = new RideDetails(10, 15); // 10 km, 15 min

        PricingStrategy distanceStrategy = new DistanceBasedPricing();
        PricingStrategy timeStrategy = new TimeBasedPricing();
        PricingStrategy surgeStrategy = new SurgePricing();

        PricingManager distanceManager = new PricingManager(distanceStrategy);
        PricingManager timeManager = new PricingManager(timeStrategy);
        PricingManager surgeManager = new PricingManager(surgeStrategy);

        System.out.println("Ride Details -> Distance: " + rideDetails.getDistance() + " km, Duration: " + rideDetails.getDuration() + " min");
        System.out.println("Distance-Based Price: $" + distanceManager.calculatePrice(rideDetails));
        System.out.println("Time-Based Price: $" + timeManager.calculatePrice(rideDetails));
        System.out.println("Surge Price: $" + surgeManager.calculatePrice(rideDetails));
    }
}
