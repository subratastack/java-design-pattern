package designpattern.creational.singleton;

public class BasicSingleton {

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private BasicSingleton () {}

    private static BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
}

class Demo {

    public static void main(String[] args) {

        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(123);
        System.out.println("singleton: " + singleton.getValue());

        BasicSingleton singleton1 = BasicSingleton.getInstance();
        System.out.println("singleton1: " + singleton1.getValue());
    }
}
