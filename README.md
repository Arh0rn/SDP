# Cinema Management System

This project implements a **Cinema Management System** using five creational design patterns in Java: Singleton, Factory Method, Abstract Factory, Builder, and Prototype. Below is a description of each component and how it fits into the overall system.

## 1. Singleton Pattern: System Configuration
### Class: `CinemaConfig`
This class is implemented using the Singleton pattern to ensure that only one instance of the cinema configuration exists. It manages global settings such as the cinema name, number of screens, and operating hours.

- **Methods:**
  - `getInstance()`: Returns the singleton instance of the `CinemaConfig` class.
  - `setCinemaName(String name)`: Sets the name of the cinema.
  - `setNumberOfScreens(int screens)`: Sets the number of screens in the cinema.
  - `getCinemaName()`, `getNumberOfScreens()`: Getters for the cinema properties.

- **Example Usage:**
  ```java
  CinemaConfig config = CinemaConfig.getInstance();
  config.setCinemaName("GoldenCinema");
  config.setNumberOfScreens(20);
