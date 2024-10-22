package assignment3.stock;

import assignment3.stock.observer.*;
import assignment3.stock.subject.*;

public class Main {
    public static void main(String[] args) {

        ConcreteStock appleStock = new ConcreteStock("Apple", 145.0);


        StockObserver investor1 = new InvestorObserver("John");
        StockObserver investor2 = new InvestorObserver("Mary");
        StockObserver broker1 = new BrokerObserver("Goldman Sachs");


        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);
        appleStock.addObserver(broker1);

        appleStock.setPrice(150.0);

        appleStock.removeObserver(investor2);
        appleStock.setPrice(155.0);
    }
}
