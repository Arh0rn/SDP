package assignment1.cinema.ui.light;

import assignment1.cinema.ui.Button;
import assignment1.cinema.ui.TextField;
import assignment1.cinema.ui.UIFactory;

public class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }

    public TextField createTextField() {
        return new LightThemeTextField();
    }
}
