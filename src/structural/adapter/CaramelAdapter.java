package structural.adapter;

import structural.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    // Second way: Inheritance
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
