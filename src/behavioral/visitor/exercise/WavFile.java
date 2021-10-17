package behavioral.visitor.exercise;

public class WavFile implements File {
    @Override
    public void execute(Plugin plugin) {
        plugin.apply(this);
    }
}
