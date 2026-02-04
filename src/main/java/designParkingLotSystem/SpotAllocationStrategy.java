package designParkingLotSystem;

import java.util.List;

public interface SpotAllocationStrategy {
    ParkingSpot allocateSpot(Vehicle vehicle, List<ParkingSpot> spots);
}
