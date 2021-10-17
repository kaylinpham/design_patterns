package behavioral.observer.exercise;

public class Main {
    public static void main(String[] args) {
        var stock = new Stock();
        var status = new StatusBar(stock);
        var view = new StockListView(stock);
        stock.addObserver(status);
        stock.addObserver(view);

        stock.setPrice(2);
    }
}
