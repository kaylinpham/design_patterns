package structural.decorator.exercise;

public class DefaultIcon implements Icon {
    @Override
    public void render() {
        System.out.printf("default item\n");
    }
}
