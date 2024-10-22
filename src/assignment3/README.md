### Task 1: Strategy Pattern - Payment Processing System

**Overview**:  
The **Strategy Pattern** allows a payment system to switch between multiple payment methods (strategies) without modifying the `ShoppingCart` class. Instead of hardcoding how payments are processed, the cart delegates the task to a chosen `PaymentStrategy`.

**How it works**:
- **`PaymentStrategy`** defines the common interface for all payment methods (`processPayment(double amount)`).
- **`CreditCardPayment`**, **`PayPalPayment`**, and **`CryptoPayment`** are concrete implementations of payment strategies.
- **`ShoppingCart`** is the context that holds a reference to the `PaymentStrategy`. It delegates the payment process to the chosen strategy.
- In **`Main`**, the user dynamically changes payment methods by selecting different strategies (e.g., Credit Card, PayPal, or Cryptocurrency).

**Key Benefit**:
- The system is easily extendable with new payment methods without modifying the `ShoppingCart` class. You can simply add a new strategy for any future payment method.

---

### Task 2: Observer Pattern - Stock Price Monitoring System

**Overview**:  
The **Observer Pattern** allows a stock price monitoring system to notify multiple observers (e.g., investors, brokers) when the stock price changes. The observers are automatically updated without the stock needing to know details about them.

**How it works**:
- **`StockObserver`** is an interface that defines the `update()` method for observers to receive notifications.
- **`InvestorObserver`** and **`BrokerObserver`** are concrete observers that implement `StockObserver` and define how they react to stock price changes.
- **`StockSubject`** defines an interface for managing observers and notifying them of changes.
- **`ConcreteStock`** is a concrete subject (a stock) that manages observers and triggers notifications when the stock price changes.
- In **`Main`**, different observers subscribe to a stock. When the stock price is updated, all observers are notified.

**Key Benefit**:
- The system allows for a flexible number of observers that can dynamically subscribe or unsubscribe to stock price updates. This makes the system modular and scalable.

---

