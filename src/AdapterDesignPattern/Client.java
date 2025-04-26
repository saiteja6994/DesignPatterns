package AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        SmartDevice airConditioner=new AirConditionerAdapter(new AirConditioner());
        airConditioner.turnOn();

        SmartDevice smartLight=new SmartLightAdapter(new SmartLight());
        smartLight.turnOn();

        airConditioner.turnOff();
        smartLight.turnOff();
    }
}
