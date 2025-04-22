package BuilderDesignPattern;

public class Clinet {
    public static void main(String[] args) {
        Car.CarBuilder builder=new Car.CarBuilder();
        Car car1=builder.setCar("GT").setBrand("Ford")
                .setSunroof(false).build();

        System.out.println(car1);

        Car car2=builder.setCar("Swift").setEngine("Turbov8")
                .setWheels(4).build();
        System.out.println(car2);

    }
}
