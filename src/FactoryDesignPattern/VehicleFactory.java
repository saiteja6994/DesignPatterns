package FactoryDesignPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equals("Car")){
            return new Car();
        }
        else if(vehicleType.equals("Bike")){
            return new Bike();
        }
        else if(vehicleType.equals("Truck")){
            return new Truck();
        }
        else {
            throw new IllegalArgumentException("Unknown Vehicle Type");
        }
    }
}
