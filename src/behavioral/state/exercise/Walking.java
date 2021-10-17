package behavioral.state.exercise;

public class Walking implements TravelMode {
    @Override
    public int calculateEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public int calculateDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
