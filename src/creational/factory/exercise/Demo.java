package creational.factory.exercise;

public class Demo {
    public static void show() {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());
    }
}
