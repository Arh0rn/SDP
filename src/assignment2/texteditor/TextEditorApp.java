package assignment2.texteditor;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        // Добавление символов с использованием Flyweight
        textEditor.addCharacter('H', "Times new roman", 13);
        textEditor.addCharacter('e', "Arial", 12);
        textEditor.addCharacter('l', "Arial", 12);
        textEditor.addCharacter('l', "Arial", 15);
        textEditor.addCharacter('o', "Arial", 12);
        textEditor.addCharacter(' ', "Arial", 22);
        textEditor.addCharacter('W', "Arial", 12);
        textEditor.addCharacter('o', "comic sans", 24);
        textEditor.addCharacter('r', "Arial", 12);
        textEditor.addCharacter('l', "Arial", 12);
        textEditor.addCharacter('d', "Arial", 12);

        // Рендеринг текста
        textEditor.render();
    }
}
