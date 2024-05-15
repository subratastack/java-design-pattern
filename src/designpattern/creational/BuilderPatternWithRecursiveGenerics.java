package designpattern.creational;

class Person {

    public String name;
    public String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person = new Person();

    public SELF withName(String name) {
        person.name = name;
        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self() {
        return (SELF) this;
    }
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder workAt(String workAt) {
        person.position = workAt;
        return self();
    }

    @Override
    public EmployeeBuilder self() {
        return this;
    }
}

public class BuilderPatternWithRecursiveGenerics {

    public static void main(String[] args) {

        EmployeeBuilder pb = new EmployeeBuilder();
        Person person = pb.withName("Subrata").workAt("Developer").build();

        System.out.println(person);
    }
}
