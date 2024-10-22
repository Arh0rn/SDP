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

### Task 2: Observer Pattern (Weather Monitoring System):

- **`WeatherDisplay` Interface**: Defines the `update(temperature, humidity, pressure)` method that all display devices must implement.
- **`CurrentConditionsDisplay`, `StatisticsDisplay`, `ForecastDisplay`**: These classes implement the `WeatherDisplay` interface and display different types of weather data when updated.
- **`WeatherStation` Class**: Acts as the *subject* in the Observer pattern. It manages weather data and maintains a list of observers (display devices). When weather data changes, it notifies all registered observers by calling their `update()` method.
- **`WeatherData` Class**: Manages the `WeatherStation` and registers multiple display devices as observers. It also updates the weather data, which triggers the notifications to the displays.
- **`Main` Class**: Demonstrates how different displays are updated automatically when the weather data changes in the `WeatherStation`.

In short: The **Observer Pattern** allows the `WeatherStation` to notify multiple display devices (observers) whenever new weather data is available, automatically updating all displays with minimal coupling between them.

###  Task 3: Command Pattern (Remote Control System)
For **Task 3: Command Pattern (Remote Control System)**, we need to create a remote control system where different devices can be controlled using commands.

#### Package Structure for Task 3: Remote Control System

1. **Package Structure**:
    - The `command` package contains all the command classes (`TurnTVOn`, `SetVolume`, `DimLights`) that implement the `Command` interface.
    - The `devices` package contains the receiver classes (`TV`, `Stereo`, `Light`) that perform actions when commands are executed.
    - The `RemoteControl` class acts as the invoker, storing commands and executing them upon button presses.
    - The `Main` class demonstrates the functionality of the remote control, including the undo feature.

2. **Execution**:
    - The user can assign commands to slots in the remote control and execute them (turning the TV on, setting the stereo volume, dimming the lights).
    - The `undo()` feature allows the remote control to revert the last action performed.

---

