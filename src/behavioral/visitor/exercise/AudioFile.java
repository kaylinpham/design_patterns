package behavioral.visitor.exercise;

public class AudioFile implements File {
    @Override
    public void execute(Plugin plugin) {
        plugin.apply(this);
    }
}
