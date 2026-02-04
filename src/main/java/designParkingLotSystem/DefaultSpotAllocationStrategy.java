package designParkingLotSystem;

import java.util.List;

public class DefaultSpotAllocationStrategy implements  SpotAllocationStrategy{
    public ParkingSpot allocateSpot(Vehicle vehicle, List<ParkingSpot> spots) {
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable() &&
                    spot.getType().name().equals(vehicle.getType().name())) {
                spot.occupy();
                return spot;
            }
        }
        throw new RuntimeException("No spot available");
    }
}
