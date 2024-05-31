package designpattern.creational.builder;

public class Car {

    public enum Brand {
        MERCEDES, BMW, AUDI, LAMBORGHINI
    }
    public enum Type {
        SEDAN, HATCHBACK, SUV, SPORTS
    }
    public enum Engine {
        V4, V6, V8
    }

    private Brand brand;
    private Type type;
    private Engine engine;
    private boolean electric;

    private Car(Brand brand, Type type, Engine engine, boolean electric) {
        this.brand = brand;
        this.type = type;
        this.engine = engine;
        this.electric = electric;
    }

    public static class CarBuilder {
        private Brand brand;
        private Type type;
        private Engine engine;
        private boolean electric;

        public CarBuilder() {}

        public CarBuilder withBrand(Brand brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder withType(Type type) {
            this.type = type;
            return this;
        }

        public CarBuilder withEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder withElectric(boolean isElectric) {
            this.electric = isElectric;
            return this;
        }

        public Car build() {
            return new Car(brand, type, engine, electric);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", type=" + type +
                ", engine=" + engine +
                ", electric=" + electric +
                '}';
    }
}
