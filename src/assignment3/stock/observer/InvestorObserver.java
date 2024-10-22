package assignment3.stock.observer;

public class InvestorObserver implements StockObserver {
    private String investorName;

    public InvestorObserver(String investorName) {
        this.investorName = investorName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Investor " + investorName + " notified: " + stockName + " price changed to $" + price);
    }
}
