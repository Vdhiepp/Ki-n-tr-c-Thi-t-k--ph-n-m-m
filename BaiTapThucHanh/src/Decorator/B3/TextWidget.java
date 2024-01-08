package Decorator.B3;

public class TextWidget implements IWidget {
    String text;

    public TextWidget(String text) {
        this.text = text;
    }

    @Override
    public void show() {
        System.out.println("Text: " + text);
    }
}
