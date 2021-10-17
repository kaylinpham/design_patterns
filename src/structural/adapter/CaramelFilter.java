package structural.adapter;

import structural.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {
    // First way: composition
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
