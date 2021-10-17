package behavioral.visitor.exercise;

public class NoiseReduction implements Plugin {
    @Override
    public void apply(WavFile wavFile) {
        System.out.println("Noise reduction for .wav file");
    }

    @Override
    public void apply(AudioFile audioFile) {
        System.out.println("Noise reduction for audio file");
    }
}
