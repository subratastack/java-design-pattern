package designpattern.structural.decorator;

public class Client {

    public static void main(String[] args) {

        NormalCoffeeMachine normalCoffeeMachine = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhancedCoffeeMachine = new EnhancedCoffeeMachine(normalCoffeeMachine);

        normalCoffeeMachine.makeSmallCoffee();
        normalCoffeeMachine.makeLargeCoffee();
        enhancedCoffeeMachine.makeSmallCoffee();
        enhancedCoffeeMachine.makeLargeCoffee();
        enhancedCoffeeMachine.makeMilkCoffee();
    }
}
