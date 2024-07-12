package designpattern.structural.decorator;

public class EnhancedCoffeeMachine implements CoffeeMachine {

    private final NormalCoffeeMachine machine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void makeSmallCoffee() {
        System.out.println(this.getClass().getName() + ": " + "Small Coffee");
    }

    @Override
    public void makeLargeCoffee() {
        machine.makeLargeCoffee();
    }

    // Extended behaviour
    public void makeMilkCoffee() {
        System.out.println(this.getClass().getName() + ": " + "Milk Coffee");
        machine.makeLargeCoffee();
        System.out.println(this.getClass().getName() + ": " + "Adding milk");
    }
}
