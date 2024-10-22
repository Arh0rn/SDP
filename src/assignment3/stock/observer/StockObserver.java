package assignment3.stock.observer;

public interface StockObserver {
    void update(String stockName, double price);
}
