package designpattern.structural.adapter;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        DatabaseDataGenerator gen = new DatabaseDataGenerator();
        DisplayDataAdapter displayDataAdapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = displayDataAdapter.convertData(
                gen.generateData()
        );

        legacyData.forEach(System.out::println);
    }
}
