package structural.decorator.exercise;

public class Demo {
    public static void main(String[] args) {
        renderItem(new Artefact("Demo", new RunnableIcon(new DefaultIcon())));
        renderItem(new Artefact("ErrorClass", new ErrorIcon(new DefaultIcon())));
        renderItem(new Artefact("Main", new RunnableIcon(new ErrorIcon(new DefaultIcon()))));
    }

    public static void renderItem(Artefact artefact) {
        artefact.render();
    }
}
