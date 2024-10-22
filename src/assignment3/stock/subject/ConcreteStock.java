package assignment3.stock.subject;

import assignment3.stock.observer.StockObserver;
import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements StockSubject {
    private String stockName;
    private double price;
    private List<StockObserver> observers;

    public ConcreteStock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockName, price);
        }
    }

    // Method to change stock price and notify observers
    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }
}