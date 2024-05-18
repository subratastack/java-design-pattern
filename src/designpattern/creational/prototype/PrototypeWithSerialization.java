package designpattern.creational.prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.Arrays;

class AddressSer implements Serializable {

    public String streetName;
    public int houseNo;

    public AddressSer(String streetName, int houseNo) {
        this.streetName = streetName;
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "AddressSer{" +
                "streetName='" + streetName + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}

class PersonSer implements Serializable {

    public String[] names;
    public AddressSer address;

    public PersonSer(String[] names, AddressSer address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonSer{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}

public class PrototypeWithSerialization {

    public static void main(String[] args) {

        PersonSer john = new PersonSer(
                new String[]{"John", "Doe"},
                new AddressSer("Paris", 123)
        );
        PersonSer jack = SerializationUtils.roundtrip(john);

        jack.names = new String[]{"Jack", "Guy"};
        jack.address.houseNo = 130;

        System.out.println(john);
        System.out.println(jack);
    }
}
