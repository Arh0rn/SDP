Вот пример файла `README.md`, который описывает архитектуру вашего проекта и объясняет использование всех классов и паттернов проектирования:


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


## 2. Factory Method Pattern: Movie Creation
### Classes:
- **`Movie` (Interface):** A common interface for different types of movies.
- **Concrete Classes:**
    - `RegularMovie`
    - `IMAXMovie`
- **Factories:**
    - `MovieFactory`: Abstract factory class with the method `createMovie()`.
    - `RegularMovieFactory`: Factory for creating `RegularMovie` instances.
    - `IMAXMovieFactory`: Factory for creating `IMAXMovie` instances.

- **Example Usage:**
  ```java
  MovieFactory factory = new RegularMovieFactory();
  Movie movie = factory.createMovie("Inception");
  ```

## 3. Abstract Factory Pattern: User Interface Generation
### Classes:
- **UI Components (Interfaces):**
    - `Button`: Interface for button components.
    - `TextField`: Interface for text fields.

- **Concrete Components:**
    - **Dark Theme:**
        - `DarkThemeButton`
        - `DarkThemeTextField`
    - **Light Theme:**
        - `LightThemeButton`
        - `LightThemeTextField`

- **UIFactory (Interface):** Abstract factory interface with methods `createButton()` and `createTextField()`.
- **Concrete Factories:**
    - `DarkThemeFactory`: Creates UI components for dark themes.
    - `LightThemeFactory`: Creates UI components for light themes.

- **Example Usage:**
  ```java
  UIFactory uiFactory = new DarkThemeFactory();
  Button button = uiFactory.createButton();
  TextField textField = uiFactory.createTextField();
  ```

## 4. Builder Pattern: Ticket Booking
### Classes:
- **`TicketBooking`**: Represents a ticket booking with multiple fields such as movie title, seat number, and snack combo.
- **`TicketBookingBuilder`**: Follows the Builder pattern, allowing step-by-step construction of a `TicketBooking` object.

- **Methods:**
    - `setMovieTitle(String title)`: Sets the movie title.
    - `setSeatNumber(String seat)`: Sets the seat number.
    - `setSnackCombo(String combo)`: Sets the snack combo.
    - `build()`: Returns the fully constructed `TicketBooking` object.

- **Example Usage:**
  ```java
  TicketBooking booking = new TicketBookingBuilder()
      .setMovieTitle("Inception")
      .setSeatNumber("A1")
      .setSnackCombo("Popcorn and Soda")
      .build();
  ```

## 5. Prototype Pattern: Movie Schedule
### Classes:
- **`MovieSchedule` (Interface):** Extends `Cloneable` and allows for cloning of movie schedules.
- **`StandardSchedule` (Implements `MovieSchedule`)**: Represents a standard movie schedule with fields for movie and time. Implements the `clone()` method to allow cloning of existing schedules.

- **Methods:**
    - `setMovie(Movie movie)`: Sets the movie for the schedule.
    - `setTime(String time)`: Sets the time for the schedule.
    - `clone()`: Clones the current schedule.

- **Example Usage:**
- 
  ```java
  StandardSchedule template = new StandardSchedule();
  template.setTime("18:00");

  MovieSchedule eveningSchedule = template.clone();
  eveningSchedule.setMovie(movie);
  ```

## Main Class
The `Main` class demonstrates the usage of all components and patterns:

```java
public class Main {
    public static void main(String[] args) {
        // Singleton: Cinema Configuration
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("GoldenCinema");
        config.setNumberOfScreens(20);

        // Factory Method: Movie Creation
        MovieFactory factory = new RegularMovieFactory();
        Movie movie = factory.createMovie("Inception");

        // Abstract Factory: UI Generation
        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        TextField textField = uiFactory.createTextField();

        // Builder: Ticket Booking
        TicketBooking booking = new TicketBookingBuilder()
            .setMovieTitle("Inception")
            .setSeatNumber("A1")
            .setSnackCombo("Popcorn and Soda")
            .build();

        // Prototype: Movie Schedule
        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");

        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie);

        System.out.println("Cinema Management System initialized.");
    }
}
```

## Conclusion
This Cinema Management System demonstrates the use of five creational design patterns in Java. Each pattern addresses a different component of the system, from global configuration and movie creation to user interface generation and ticket booking.


