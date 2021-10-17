package structural.decorator.exercise;

public class ErrorIcon implements Icon {
    private Icon icon;

    public ErrorIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public void render() {
        System.out.print("error ");
        icon.render();
    }
}
