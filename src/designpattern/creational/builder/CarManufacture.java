package designpattern.creational.builder;

public class CarManufacture {

    public static void main(String[] args) {

        // Build an Audi car with given specification (AUDI, V8, HATCHBACK, Non-Electric)
        Car audiCar = new Car.CarBuilder()
                .withBrand(Car.Brand.AUDI)
                .withEngine(Car.Engine.V8)
                .withType(Car.Type.HATCHBACK)
                .build();
        System.out.println(audiCar);

        // Build a Mercedes car with given specification (MERCEDES, V6, SPORTS, Electric)
        Car mercedesCar = new Car.CarBuilder()
                .withBrand(Car.Brand.MERCEDES)
                .withEngine(Car.Engine.V6)
                .withType(Car.Type.SPORTS)
                .withElectric(true)
                .build();
        System.out.println(mercedesCar);
    }
}
