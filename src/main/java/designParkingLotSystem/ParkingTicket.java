package designParkingLotSystem;

import java.time.LocalDateTime;

public class ParkingTicket {

    private Vehicle vehicle;
    private ParkingSpot spot;
    private LocalDateTime entryTime;

    public ParkingTicket(Vehicle vehicle, ParkingSpot spot ){
        this.vehicle = vehicle;
        this.spot = spot;

    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
