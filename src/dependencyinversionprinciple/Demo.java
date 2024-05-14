package dependencyinversionprinciple;

public class Demo {

    public static void main(String[] args) {
        Person mother = new Person("Anna");
        Person child1 = new Person("Adam");
        Person child2 = new Person("Mary");

        Relationship relationship = new Relationship();
        relationship.addRelation(mother, child1);
        relationship.addRelation(mother, child2);

        new Research(relationship);
    }

}
