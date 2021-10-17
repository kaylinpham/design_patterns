package behavioral.state.exercise;

public class Transit implements TravelMode {
    @Override
    public int calculateEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int calculateDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
