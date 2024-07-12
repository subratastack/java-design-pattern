package designpattern.structural.decorator;

public class NormalCoffeeMachine implements CoffeeMachine {
    @Override
    public void makeSmallCoffee() {
        System.out.println(this.getClass().getName() + ": " + "Small Coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println(this.getClass().getName() + ": " + "Large Coffee");
    }
}
