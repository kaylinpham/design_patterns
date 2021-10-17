package behavioral.visitor.exercise;

public class Normalize implements Plugin {
    @Override
    public void apply(WavFile wavFile) {
        System.out.println("Normalize .wav file");
    }

    @Override
    public void apply(AudioFile audioFile) {
        System.out.println("Normalize audio file");
    }
}
