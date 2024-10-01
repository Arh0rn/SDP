package cinema.ui.light;

import cinema.ui.Button;
import cinema.ui.TextField;
import cinema.ui.UIFactory;

public class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }

    public TextField createTextField() {
        return new LightThemeTextField();
    }
}
