package behavioral.memento.execise;

public class Document {
    private String content;
    private int fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFontName() {
        return fontName;
    }

    public void setFontName(int fontName) {
        if (fontName <= 0) throw new IllegalArgumentException("Font name must be greater than 0");
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        if (fontSize <= 0) throw new IllegalArgumentException("Font size must be greater than 0");
        this.fontSize = fontSize;
    }

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restore(DocumentState state) {
        content = state.getContent();
        fontName = state.getFontName();
        fontSize = state.getFontSize();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName=" + fontName +
                ", fontSize=" + fontSize +
                '}';
    }
}
