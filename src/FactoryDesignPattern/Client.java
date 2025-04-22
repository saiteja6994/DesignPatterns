package FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1=VehicleFactory.getVehicle("Car");
        vehicle1.start();
        vehicle1.stop();

        Vehicle vehicle2=VehicleFactory.getVehicle("Truck");
        vehicle2.start();
        vehicle2.stop();
    }
}
