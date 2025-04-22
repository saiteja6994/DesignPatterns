package AbstractFactoryPAttern;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicle1=new HondaFactory();
        Vehicle honda= vehicle1.createVehicle();
        honda.start();
        honda.stop();

        VehicleFactory vehicle2=new BMWFactory();
        Vehicle BMW= vehicle2.createVehicle();
        BMW.start();
        BMW.stop();
    }
}
