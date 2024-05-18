package designpattern.creational.factories;

import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

interface HotDrink {
    void consume();
}

class Tea implements HotDrink {

    @Override
    public void consume() {
        System.out.println("Tea is delicious");
    }
}

class Coffee implements HotDrink {

    @Override
    public void consume() {
        System.out.println("Coffee is delicious");
    }
}

interface HotDrinkFactory {
    HotDrink prepare(int amount);
}

class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Tea is being prepared... for " + amount + " ml");
        return new Tea();
    }
}

class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Coffee is being prepared... for " + amount + " ml");
        return new Coffee();
    }
}

class HotDrinkMachine {
    private List<Map<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> types = new Reflections().getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> type: types) {
            HashMap<String, HotDrinkFactory> map = new HashMap<>();
            map.put(type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            );
            namedFactories.add(map);
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available drinks: ");
        for (int index = 0; index < namedFactories.size(); index++) {
            Map<String, HotDrinkFactory> item = namedFactories.get(index);
            for (Map.Entry m: item.entrySet()) {
                System.out.println("" + index + ": " + m.getKey());
            }
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i, amount;

            if ((s = reader.readLine()) != null && (i = Integer.parseInt(s)) > 0 && i < namedFactories.size()) {
                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null && (amount = Integer.parseInt(s)) > 0) {
                    Map<String, HotDrinkFactory> item = namedFactories.get(i);
                    Map.Entry<String, HotDrinkFactory> m = (Map.Entry<String, HotDrinkFactory>) item.entrySet();
                    return m.getValue().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again");
        }
    }
}

public class AbstractFactory {

    public static void main(String[] args) throws Exception {

        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink drink = machine.makeDrink();
        drink.consume();
    }

}
