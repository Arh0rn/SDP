Here’s an expanded explanation of each class for all seven assignments, now including small code snippets to illustrate
their functionality:

### Assignment 1: Adapter Pattern - Audio Player

1. **AudioPlayer Interface**:
    - Defines the method for playing audio files.
   ```java
   public interface AudioPlayer {
       void play(String audioType, String fileName);
   }
   ```

2. **MP3Player Class**:
    - Implements the `AudioPlayer` interface for playing MP3 files.
   ```java
   public class MP3Player implements AudioPlayer {
       @Override
       public void play(String audioType, String fileName) {
           if(audioType.equalsIgnoreCase("mp3")) {
               System.out.println("Playing MP3 file. Name: " + fileName);
           } else {
               System.out.println("Invalid format for MP3 player.");
           }
       }
   }
   ```

3. **WAVPlayer Interface**:
    - Defines the method for playing WAV files.
   ```java
   public interface WAVPlayer {
       void playWAV(String fileName);
   }
   ```

4. **AACPlayer Interface**:
    - Defines the method for playing AAC files.
   ```java
   public interface AACPlayer {
       void playAAC(String fileName);
   }
   ```

5. **AdvancedAudioPlayer Class**:
    - Implements both `WAVPlayer` and `AACPlayer`.
   ```java
   public class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
       @Override
       public void playWAV(String fileName) {
           System.out.println("Playing WAV file. Name: " + fileName);
       }

       @Override
       public void playAAC(String fileName) {
           System.out.println("Playing AAC file. Name: " + fileName);
       }
   }
   ```

6. **AudioAdapter Class**:
    - Adapts the `AdvancedAudioPlayer` to the `AudioPlayer` interface.
   ```java
   public class AudioAdapter implements AudioPlayer {
       AdvancedAudioPlayer advancedAudioPlayer;

       public AudioAdapter(String audioType) {
           if(audioType.equalsIgnoreCase("wav")) {
               advancedAudioPlayer = new AdvancedAudioPlayer();
           } else if(audioType.equalsIgnoreCase("aac")) {
               advancedAudioPlayer = new AdvancedAudioPlayer();
           }
       }

       @Override
       public void play(String audioType, String fileName) {
           if(audioType.equalsIgnoreCase("wav")) {
               advancedAudioPlayer.playWAV(fileName);
           } else if(audioType.equalsIgnoreCase("aac")) {
               advancedAudioPlayer.playAAC(fileName);
           }
       }
   }
   ```

7. **MusicPlayerApp Class**:
    - Demonstrates the audio player functionality.
   ```java
   public class MusicPlayerApp {
       public static void main(String[] args) {
           AudioPlayer audioPlayer = new MP3Player();
           audioPlayer.play("mp3", "song1.mp3");
           AudioPlayer wavPlayer = new AudioAdapter("wav");
           wavPlayer.play("wav", "song2.wav");
           AudioPlayer aacPlayer = new AudioAdapter("aac");
           aacPlayer.play("aac", "song3.aac");
       }
   }
   ```

### Assignment 2: Bridge Pattern - Remote Control System

1. **Device Interface**:
    - Defines methods for controlling devices.
   ```java
   public interface Device {
       void powerOn();
       void powerOff();
       void setChannel(int channel);
       void setVolume(int volume);
   }
   ```

2. **TVDevice Class**:
    - Implements the `Device` interface for a TV.
   ```java
   public class TVDevice implements Device {
       private boolean powerOn = false;

       @Override
       public void powerOn() {
           powerOn = true;
           System.out.println("TV is now ON.");
       }

       @Override
       public void powerOff() {
           powerOn = false;
           System.out.println("TV is now OFF.");
       }
       
       @Override
       public void setChannel(int channel) {
           System.out.println("TV channel set to " + channel);
       }

       @Override
       public void setVolume(int volume) {
           System.out.println("TV volume set to " + volume);
       }
   }
   ```

3. **DVDDevice Class**:
    - Implements the `Device` interface for a DVD player.
   ```java
   public class DVDDevice implements Device {
       @Override
       public void powerOn() {
           System.out.println("DVD Player is now ON.");
       }

       @Override
       public void powerOff() {
           System.out.println("DVD Player is now OFF.");
       }

       // Other methods remain unimplemented for channels
   }
   ```

4. **SoundSystemDevice Class**:
    - Implements the `Device` interface for a sound system.
   ```java
   public class SoundSystemDevice implements Device {
       @Override
       public void powerOn() {
           System.out.println("Sound System is now ON.");
       }

       @Override
       public void powerOff() {
           System.out.println("Sound System is now OFF.");
       }

       // Other methods remain unimplemented for channels
   }
   ```

5. **RemoteControl Abstract Class**:
    - Holds a reference to a `Device`.
   ```java
   public abstract class RemoteControl {
       protected Device device;

       public RemoteControl(Device device) {
           this.device = device;
       }

       public abstract void togglePower();
       public abstract void setChannel(int channel);
       public abstract void setVolume(int volume);
   }
   ```

6. **BasicRemote Class**:
    - Extends `RemoteControl` for basic functionality.
   ```java
   public class BasicRemote extends RemoteControl {
       public BasicRemote(Device device) {
           super(device);
       }

       @Override
       public void togglePower() {
           System.out.println("Basic Remote: Power toggle.");
           if (device instanceof TVDevice) {
               device.powerOn();
           } else {
               device.powerOff();
           }
       }

       @Override
       public void setChannel(int channel) {
           device.setChannel(channel);
       }

       @Override
       public void setVolume(int volume) {
           device.setVolume(volume);
       }
   }
   ```

7. **AdvancedRemote Class**:
    - Extends `RemoteControl` for advanced functionality.
   ```java
   public class AdvancedRemote extends RemoteControl {
       public AdvancedRemote(Device device) {
           super(device);
       }

       public void mute() {
           System.out.println("Advanced Remote: Muting volume.");
           device.setVolume(0);
       }

       // Other methods implemented similarly as in BasicRemote
   }
   ```

8. **HomeEntertainmentSystem Class**:
    - Demonstrates functionality of remotes and devices.
   ```java
   public class HomeEntertainmentSystem {
       public static void main(String[] args) {
           Device tv = new TVDevice();
           BasicRemote basicRemote = new BasicRemote(tv);
           basicRemote.togglePower();
           basicRemote.setChannel(5);
           basicRemote.setVolume(15);
       }
   }
   ```

### Assignment 3: Composite Pattern - Menu System

1. **MenuComponent Abstract Class**:
    - Defines common methods for menu items and menus.
   ```java
   public abstract class MenuComponent {
       public void add(MenuComponent menuComponent) {
           throw new UnsupportedOperationException();
       }

       public void print() {
           throw new UnsupportedOperationException();
       }
   }
   ```

2. **MenuItem Class**:
    - Represents individual dishes.
   ```java
   public class MenuItem extends MenuComponent {
       private String name;
       private String description;
       private double price;

       public MenuItem(String name, String description, double price) {
           this.name = name;
           this.description = description;
           this.price = price;
       }

       @Override
       public void print() {
           System.out.println(name + ", " + price + " -- " + description);
       }
   }
   ```

3. **Menu Class**:
    - Represents a composite menu that can hold multiple `MenuComponent` objects.
   ```java
   import java.util.ArrayList;
   import java.util.List;

   public class Menu extends MenuComponent {
       private List<MenuComponent> menuComponents = new ArrayList<>();
       private String name;

       public Menu(String name) {
           this.name = name;
       }

       @Override
       public void add(MenuComponent menuComponent) {
           menuComponents.add(menuComponent);
       }

       @Override
       public void print() {
           System.out.println("\n" + name);
           for (MenuComponent component : menuComponents) {
               component.print();
           }
       }
   }
   ```

4. **RestaurantApp Class**:
    - Demonstrates the composite pattern with menus and dishes.
   ```java
   public class RestaurantApp {
       public static void main(String[] args) {
           MenuComponent breakfastMenu = new Menu("Breakfast Menu");
           breakfastMenu.add(new MenuItem("Pancakes", "Pancakes with syrup", 6));
           breakfastMenu.add(new MenuItem("Omelette", "Cheese Omelette", 7));

           MenuComponent lunchMenu = new Menu("Lunch Menu");
           lunchMenu.add(new MenuItem("Burger", "Beef Burger", 10));
           lunchMenu.add(new MenuItem("Salad", "Fresh Salad", 5));

           MenuComponent allMenus = new Menu("All Menus");
           allMenus.add(breakfastMenu);
           allMenus.add(lunchMenu);

           allMenus.print();
       }
   }
   ```

### Assignment 4:

Decorator Pattern - Pizza Ordering System

1. **Pizza Interface**:
    - Defines methods for getting pizza description and cost.
   ```java
   public interface Pizza {
       String getDescription();
       double getCost();
   }
   ```

2. **MargheritaPizza Class**:
    - Represents a Margherita pizza.
   ```java
   public class MargheritaPizza implements Pizza {
       @Override
       public String getDescription() {
           return "Margherita Pizza";
       }

       @Override
       public double getCost() {
           return 6.00;  // Base price
       }
   }
   ```

3. **VegetarianPizza Class**:
    - Represents a Vegetarian pizza.
   ```java
   public class VegetarianPizza implements Pizza {
       @Override
       public String getDescription() {
           return "Vegetarian Pizza";
       }

       @Override
       public double getCost() {
           return 7.00;  // Base price
       }
   }
   ```

4. **ToppingDecorator Abstract Class**:
    - Adds functionality to pizza classes.
   ```java
   public abstract class ToppingDecorator implements Pizza {
       protected Pizza pizza;

       public ToppingDecorator(Pizza pizza) {
           this.pizza = pizza;
       }

       @Override
       public String getDescription() {
           return pizza.getDescription();
       }

       @Override
       public double getCost() {
           return pizza.getCost();
       }
   }
   ```

5. **CheeseTopping Class**:
    - Represents a cheese topping.
   ```java
   public class CheeseTopping extends ToppingDecorator {
       public CheeseTopping(Pizza pizza) {
           super(pizza);
       }

       @Override
       public String getDescription() {
           return pizza.getDescription() + ", Extra Cheese";
       }

       @Override
       public double getCost() {
           return pizza.getCost() + 1.50;
       }
   }
   ```

6. **MushroomTopping Class**:
    - Represents a mushroom topping.
   ```java
   public class MushroomTopping extends ToppingDecorator {
       public MushroomTopping(Pizza pizza) {
           super(pizza);
       }

       @Override
       public String getDescription() {
           return pizza.getDescription() + ", Mushrooms";
       }

       @Override
       public double getCost() {
           return pizza.getCost() + 1.00;
       }
   }
   ```

7. **PizzaShop Class**:
    - Demonstrates the pizza ordering system with decorators.
   ```java
   public class PizzaShop {
       public static void main(String[] args) {
           Pizza pizza = new MargheritaPizza();
           pizza = new CheeseTopping(pizza);
           pizza = new MushroomTopping(pizza);
           System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());
       }
   }
   ```

### Assignment 5: Facade Pattern - Smart Home System

1. **Light Class**:
    - Represents a smart light.
   ```java
   public class Light {
       public void turnOn() {
           System.out.println("Lights are ON.");
       }

       public void turnOff() {
           System.out.println("Lights are OFF.");
       }
   }
   ```

2. **Thermostat Class**:
    - Represents a smart thermostat.
   ```java
   public class Thermostat {
       public void setTemperature(int temperature) {
           System.out.println("Thermostat set to " + temperature + "°C.");
       }
   }
   ```

3. **SecuritySystem Class**:
    - Represents a security system.
   ```java
   public class SecuritySystem {
       public void arm() {
           System.out.println("Security system is ARMED.");
       }

       public void disarm() {
           System.out.println("Security system is DISARMED.");
       }
   }
   ```

4. **EntertainmentSystem Class**:
    - Represents an entertainment system.
   ```java
   public class EntertainmentSystem {
       public void turnOn() {
           System.out.println("Entertainment system is ON.");
       }

       public void turnOff() {
           System.out.println("Entertainment system is OFF.");
       }

       public void playMovie(String movie) {
           System.out.println("Now playing: " + movie);
       }
   }
   ```

5. **SmartHomeFacade Class**:
    - Provides a simplified interface for controlling all devices.
   ```java
   public class SmartHomeFacade {
       private Light light;
       private Thermostat thermostat;
       private SecuritySystem securitySystem;
       private EntertainmentSystem entertainmentSystem;

       public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
           this.light = light;
           this.thermostat = thermostat;
           this.securitySystem = securitySystem;
           this.entertainmentSystem = entertainmentSystem;
       }

       public void leaveHome() {
           System.out.println("Leaving home...");
           light.turnOff();
           thermostat.setTemperature(18);
           securitySystem.arm();
           entertainmentSystem.turnOff();
       }

       public void arriveHome() {
           System.out.println("Arriving home...");
           light.turnOn();
           thermostat.setTemperature(22);
           securitySystem.disarm();
       }
   }
   ```

6. **SmartHomeApp Class**:
    - Demonstrates the smart home system.
   ```java
   public class SmartHomeApp {
       public static void main(String[] args) {
           Light light = new Light();
           Thermostat thermostat = new Thermostat();
           SecuritySystem securitySystem = new SecuritySystem();
           EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

           SmartHomeFacade smartHome = new SmartHomeFacade(light, thermostat, securitySystem, entertainmentSystem);
           smartHome.arriveHome();
           smartHome.leaveHome();
       }
   }
   ```

### Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor

1. **Character Class**:
    - Represents a character with intrinsic state.
   ```java
   public class Character {
       private final char value;
       private final String font;
       private final int size;

       public Character(char value, String font, int size) {
           this.value = value;
           this.font = font;
           this.size = size;
       }

       public void render(int x, int y) {
           System.out.println("Rendering character '" + value + "' at (" + x + ", " + y + ") with font: " + font + ", size: " + size);
       }
   }
   ```

2. **CharacterFactory Class**:
    - Manages the creation and caching of characters.
   ```java
   import java.util.ArrayList;
   import java.util.List;

   public class CharacterFactory {
       private final List<Character> characters = new ArrayList<>();

       public Character getCharacter(char value, String font, int size) {
           for (Character character : characters) {
               if (character.getValue() == value && character.getFont().equals(font) && character.getSize() == size) {
                   return character;
               }
           }
           Character newCharacter = new Character(value, font, size);
           characters.add(newCharacter);
           return newCharacter;
       }
   }
   ```

3. **TextEditor Class**:
    - Uses the character factory to create characters and render text.
   ```java
   import java.util.ArrayList;
   import java.util.List;

   public class TextEditor {
       private final CharacterFactory characterFactory = new CharacterFactory();
       private final List<Character> characters = new ArrayList<>();

       public void addCharacter(char value, String font, int size) {
           Character character = characterFactory.getCharacter(value, font, size);
           characters.add(character);
       }

       public void render() {
           int x = 0;
           int y = 0;
           for (Character character : characters) {
               character.render(x, y);
               x += character.getSize();
           }
       }
   }
   ```

4. **TextEditorApp Class**:
    - Demonstrates the text editor's functionality.
   ```java
   public class TextEditorApp {
       public static void main(String[] args) {
           TextEditor textEditor = new TextEditor();
           textEditor.addCharacter('H', "Arial", 12);
           textEditor.addCharacter('e', "Arial", 12);
           textEditor.render();
       }
   }
   ```

### Assignment 7: Proxy Pattern - Online Learning Platform

1. **VideoLecture Interface**:
    - Defines methods for video lectures.
   ```java
   public interface VideoLecture {
       void getInfo();
       void play();
   }
   ```

2. **RealVideoLecture Class**:
    - Represents an actual video lecture.
   ```java
   public class RealVideoLecture implements VideoLecture {
       private String title;

       public RealVideoLecture(String title) {
           this.title = title;
           loadVideo();
       }

       private void loadVideo() {
           System.out.println("Loading video lecture: " + title);
       }

       @Override
       public void getInfo() {
           System.out.println("Video Lecture Title: " + title);
       }

       @Override
       public void play() {
           System.out.println("Playing video lecture: " + title);
       }
   }
   ```

3. **ProxyVideoLecture Class**:
    - Acts as a proxy for `RealVideoLecture`.
   ```java
   public class ProxyVideoLecture implements VideoLecture {
       private RealVideoLecture realVideoLecture;
       private String title;

       public ProxyVideoLecture(String title) {
           this.title = title;
       }

       @Override
       public void getInfo() {
           if (realVideo

   Lecture == null) {
   realVideoLecture = new RealVideoLecture(title);
   }
   realVideoLecture.getInfo();
   }

       @Override
       public void play() {
           if (realVideoLecture == null) {
               realVideoLecture = new RealVideoLecture(title);
           }
           realVideoLecture.play();
       }

   }

   ```

4. **LearningPlatformApp Class**:
    - Demonstrates the proxy functionality.
   ```java
   public class LearningPlatformApp {
       public static void main(String[] args) {
           VideoLecture video1 = new ProxyVideoLecture("Design Patterns in Java");
           video1.getInfo();
           video1.play();
       }
   }
   ```

