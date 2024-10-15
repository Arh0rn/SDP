package assignment2.texteditor;

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
