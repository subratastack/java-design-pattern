package designpattern.structural.composite;

public class Client {

    public static void main(String[] args) {

        Equipment processor = new Equipment("Processor", 1000);
        Composite memory = new Composite("Memory");
        memory.add(new Equipment("RAM", 1500)).add(new Equipment("ROM", 500));
        Equipment monitor = new Equipment("Monitor", 800);

        Composite computer = new Composite("PC-1");
        int price1 = computer
                .add(processor)
                .add(memory)
                .getPrice();

        Composite computer2 = new Composite("PC-2");
        int price2 = computer2
                .add(processor)
                .add(memory)
                .add(monitor)
                .getPrice();

        System.out.println("Price of PC-1: " + price1);
        System.out.println("Price of PC-2: " + price2);
    }
}
