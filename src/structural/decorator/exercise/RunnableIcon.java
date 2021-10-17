package structural.decorator.exercise;

public class RunnableIcon implements Icon {
    private Icon icon;

    public RunnableIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public void render() {
        System.out.print("runnable ");
        icon.render();
    }
}
