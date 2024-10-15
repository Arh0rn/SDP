package assignment2.texteditor;

import java.awt.*;

public class Character {
    private final char value;
    private final String font;
    private final int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public char getValue() {
        return value;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public void render(int x, int y) {
        System.out.println("Rendering character '" + value + "' at (" + x + ", " + y + ") with font: " + font + ", size: " + size);
    }
}
