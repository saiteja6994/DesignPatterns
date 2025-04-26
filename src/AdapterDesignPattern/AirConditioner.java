package AdapterDesignPattern;

public class AirConditioner{

    public void connectViaBluetooth(){
        System.out.println("Conditioner connecting with bluetooth");
    }

    public void startCooling(){
        System.out.println("starts cooling");
    }

    public void stopCooling(){
        System.out.println("stops cooling");
    }

    public void disconnectViaBluetooth(){
        System.out.println("disconnecting from bluetooth");
    }

}
