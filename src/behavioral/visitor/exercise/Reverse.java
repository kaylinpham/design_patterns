package behavioral.visitor.exercise;

public class Reverse implements Plugin {
    @Override
    public void apply(WavFile wavFile) {
        System.out.println("Reverse .wav file");
    }

    @Override
    public void apply(AudioFile audioFile) {
        System.out.println("Reverse audio file");
    }
}
