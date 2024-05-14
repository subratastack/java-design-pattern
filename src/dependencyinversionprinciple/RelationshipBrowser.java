package dependencyinversionprinciple;

import java.util.List;

public interface RelationshipBrowser {
    public List<String> findAllChildOfParent(String parent);
}
