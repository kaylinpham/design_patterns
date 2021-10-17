package structural.composite.exercise;

import java.util.LinkedList;
import java.util.List;

public class Team implements Resource {
    private List<Resource> resources = new LinkedList<>();

    public void add(Resource resource) {
        resources.add(resource);
    }

    @Override
    public void attack() {
        for (var resource : resources) resource.attack();
    }
}
