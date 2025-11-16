package factoryDesignpatternvehiclebookingapp;

public class VehicleFactory {

    public static Vehicle getVehocle(String type){


        if (type == null) {
            return null;



        }

        switch (type.toLowerCase()){
            case  "car":
            return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw  new IllegalArgumentException("Unknown vehicle type: " + type);


        }


    }
}
