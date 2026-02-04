package designParkingLotSystem;

import java.util.spi.ToolProvider;

public class ParkingSpot {

    protected String spotId;
    protected VehicleSize size;
    protected boolean free;
    protected Vehicle parkedVehicle;

    public ParkingSpot(String spotId, VehicleSize size, boolean free, Vehicle parkedVehicle) {
        this.spotId = spotId;
        this.size = size;
        this.free = free;
        this.parkedVehicle = parkedVehicle;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public boolean isFree() {
        return free;
    }

    public VehicleSize getSize() {
        return size;
    }

    public String getSpotId() {
        return spotId;
    }


    public void free() {
    }
}
