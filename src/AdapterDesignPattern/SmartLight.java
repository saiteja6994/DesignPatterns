package AdapterDesignPattern;

public class SmartLight {
    public void connectViaWifi(){
        System.out.println("light connecting via Wi-fi");
    }

    public void startLightOn(){
        System.out.println("light is on");
    }

    public void stopLightoff(){
        System.out.println("light is off");
    }

    public void disconnectViaWifi(){
        System.out.println("disconnecting from Wi-fi");
    }

}
