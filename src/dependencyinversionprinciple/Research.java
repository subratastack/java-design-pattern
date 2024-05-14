package dependencyinversionprinciple;

public class Research { // high-level

    /*public Research(Relationship relationship) {

        relationship.getListOfRelationships().stream()
                .filter(x -> x.person1.equals("Anna")
                && x.relation == Relation.PARENT)
                .forEach(p -> System.out.println(p.person2));
    }*/

    public Research(RelationshipBrowser browser) {
        browser.findAllChildOfParent("Anna")
                .forEach(System.out::println);
    }
}
