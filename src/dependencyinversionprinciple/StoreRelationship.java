package dependencyinversionprinciple;

public class StoreRelationship {

    public String person1;
    public String person2;
    public Relation relation;

    public StoreRelationship(String person1, String person2, Relation relation) {
        this.person1 = person1;
        this.person2 = person2;
        this.relation = relation;
    }
}
