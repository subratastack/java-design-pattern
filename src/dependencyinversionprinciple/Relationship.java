package dependencyinversionprinciple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Relationship implements RelationshipBrowser { // low-level

    private final List<StoreRelationship> listOfRelationships = new ArrayList<>();

    public List<StoreRelationship> getListOfRelationships() {
        return listOfRelationships;
    }

    public void addRelation(Person parent, Person child) {
        listOfRelationships.add(new StoreRelationship(parent.name, child.name, Relation.PARENT));
        listOfRelationships.add(new StoreRelationship(child.name, parent.name, Relation.CHILD));
    }

    @Override
    public List<String> findAllChildOfParent(String parent) {
        return listOfRelationships.stream()
                .filter(x -> x.person1.equals(parent)
                        && x.relation == Relation.PARENT)
                .map(x -> x.person2)
                .collect(Collectors.toList());
    }
}
