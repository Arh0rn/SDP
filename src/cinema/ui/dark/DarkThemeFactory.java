package cinema.ui.dark;

import cinema.ui.Button;
import cinema.ui.TextField;
import cinema.ui.UIFactory;

public class DarkThemeFactory implements UIFactory {

    public Button createButton() {
        return new DarkThemeButton();
    }

    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}
