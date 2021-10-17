package behavioral.visitor;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Text-Heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Text-Anchor");
    }
}
