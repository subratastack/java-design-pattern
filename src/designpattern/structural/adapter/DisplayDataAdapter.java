package designpattern.structural.adapter;

import java.util.List;

public class DisplayDataAdapter implements DatabaseDataConverter {

    @Override
    public List<DisplayData3rdParty> convertData(List<DatabaseData> data) {
        return data.stream().map(item ->
                new DisplayData3rdParty(item.position, Integer.toString(item.amount)))
                .toList();
    }
}
