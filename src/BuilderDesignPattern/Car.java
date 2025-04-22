package BuilderDesignPattern;

public class Car {
    private String engine;
    private String car;
    private int wheels;
    private String brand;
    private boolean Sunroof;
    private boolean setNavigationSystem;

    private Car(CarBuilder carBuilder){
        this.engine=carBuilder.engine;
        this.wheels=carBuilder.wheels;
        this.car=carBuilder.car;
        this.brand=carBuilder.brand;
        this.Sunroof=carBuilder.Sunroof;
        this.setNavigationSystem=carBuilder.setNavigationSystem;
    }

    public String getEngine() {
        return engine;
    }

    public String getCar() {
        return car;
    }

    public int getWheels() {
        return wheels;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isSunroof() {
        return Sunroof;
    }

    public boolean isSetNavigationSystem() {
        return setNavigationSystem;
    }

    public static class CarBuilder{
        private String engine;
        private String car;
        private int wheels;
        private String brand;
        private boolean Sunroof;
        private boolean setNavigationSystem;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setCar(String car) {
            this.car = car;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            Sunroof = sunroof;
            return this;
        }

        public CarBuilder setSetNavigationSystem(boolean setNavigationSystem) {
            this.setNavigationSystem = setNavigationSystem;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
