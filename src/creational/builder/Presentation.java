package creational.builder;

import java.util.LinkedList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new LinkedList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
        builder.addSlide(new Slide("Copyright"));
        for (Slide slide : slides) builder.addSlide(slide);
    }
}
