package designParkingLotSystem;

public  abstract class Vehicle {

    private String vehicleNumber;
    private VehicleType type;
    private VehicleSize size;

    public Vehicle(String vehicleNumber, VehicleType type, VehicleSize size){

        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.size = size;


    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public VehicleSize getSize() {
        return size;
    }
}
