package behavioral.state.abuse;

public class Stopwatch {
    private boolean isRunning;

    public void click() {
        System.out.println(isRunning ? "Stopped" : "Running");
        isRunning = !isRunning;
    }
    // simple circumstance, so don't need waste time to make code more complex :))
}
