package creational.abstractFactory;

import creational.abstractFactory.app.ContactForm;
import creational.abstractFactory.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
    }
}
