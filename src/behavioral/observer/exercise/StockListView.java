package behavioral.observer.exercise;

public class StockListView implements Observer {
    private Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("StockListView got updated: " + stock.getPrice());
    }
}
