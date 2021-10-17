package structural.composite;

import java.util.LinkedList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new LinkedList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {
        for (var component : components) component.render();
    }
}
