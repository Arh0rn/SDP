package assignment3.stock.subject;


import assignment3.stock.observer.StockObserver;

public interface StockSubject {
    void addObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers();
}