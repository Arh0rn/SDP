package assignment1.cinema.ui.dark;

import assignment1.cinema.ui.Button;
import assignment1.cinema.ui.TextField;
import assignment1.cinema.ui.UIFactory;

public class DarkThemeFactory implements UIFactory {

    public Button createButton() {
        return new DarkThemeButton();
    }

    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}
