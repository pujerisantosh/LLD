package designParkingLotSystem;

public class EntryGate {

    private ParkingLot parkingLot;

    public EntryGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket enter(Vehicle vehicle) {
        ParkingSpot spot = parkingLot.getSpot(vehicle);
        return new ParkingTicket(vehicle, spot);
    }
}
