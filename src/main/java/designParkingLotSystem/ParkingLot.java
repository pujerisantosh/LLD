package designParkingLotSystem;

import java.util.List;

public class ParkingLot {

    private List<ParkingSpot> spots;
    private SpotAllocationStrategy allocationStrategy;

    public ParkingLot(List<ParkingSpot> spots,
                      SpotAllocationStrategy allocationStrategy) {
        this.spots = spots;
        this.allocationStrategy = allocationStrategy;
    }

    public ParkingSpot getSpot(Vehicle vehicle) {
        return allocationStrategy.allocateSpot(vehicle, spots);
    }
}
