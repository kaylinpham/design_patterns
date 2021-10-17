package structural.decorator.exercise;

public class Artefact {
    private String name;
    private Icon icon;

    public Artefact(String name, Icon icon) {
        this.name = name;
        this.icon = icon;
    }

    public void render() {
        System.out.print(name + " is ");
        icon.render();
    }
}
