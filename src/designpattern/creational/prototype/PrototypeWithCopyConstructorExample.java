package designpattern.creational.prototype;

import java.util.Arrays;

class Address {

    public String streetName;
    public int houseNo;

    public Address(String streetName, int houseNo) {
        this.streetName = streetName;
        this.houseNo = houseNo;
    }

    public Address(Address other) {
        this(other.streetName, other.houseNo);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}

class Person {

    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    public Person(Person other) {
        names = other.names;
        this.address = new Address(other.address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}

public class PrototypeWithCopyConstructorExample {

    public static void main(String[] args) {

        Person john = new Person(
                new String[]{"John", "Doe"},
                new Address("Paris", 123)
        );
        Person jack = new Person(john);
        jack.names = new String[]{"Jack", "Guy"};

        System.out.println(john);
        System.out.println(jack);
    }
}
