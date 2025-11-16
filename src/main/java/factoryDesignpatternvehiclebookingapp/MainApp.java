package factoryDesignpatternvehiclebookingapp;

public class MainApp {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehocle("car");
        car.start();
        car.start();
    }
}
