package assignment2.texteditor;

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
        System.out.println("Creating new character: " + value);
        return newCharacter;
    }

}

