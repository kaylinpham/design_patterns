package behavioral.template;

public abstract class Window {
    public void close() {
        System.out.println("Close");

        doExecute();
    }

    protected abstract void doExecute();
}
