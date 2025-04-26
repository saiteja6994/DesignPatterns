package AdapterDesignPattern;

public class SmartLightAdapter implements SmartDevice{
    private SmartLight smartLight;

    public SmartLightAdapter(SmartLight smartLight){
        this.smartLight=smartLight;
    }
    @Override
    public void turnOn() {
        smartLight.connectViaWifi();
        smartLight.startLightOn();
    }

    @Override
    public void turnOff() {
        smartLight.disconnectViaWifi();
        smartLight.stopLightoff();
    }
}
