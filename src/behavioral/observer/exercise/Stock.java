package behavioral.observer.exercise;

public class Stock extends Subject {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }
}
