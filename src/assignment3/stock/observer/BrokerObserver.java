package assignment3.stock.observer;

public class BrokerObserver implements StockObserver {
    private String brokerName;

    public BrokerObserver(String brokerName) {
        this.brokerName = brokerName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Broker " + brokerName + " notified: " + stockName + " price changed to $" + price);
    }
}
