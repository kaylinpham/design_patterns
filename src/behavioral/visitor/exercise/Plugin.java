package behavioral.visitor.exercise;

public interface Plugin {
    void apply(WavFile wavFile);

    void apply(AudioFile audioFile);
}
