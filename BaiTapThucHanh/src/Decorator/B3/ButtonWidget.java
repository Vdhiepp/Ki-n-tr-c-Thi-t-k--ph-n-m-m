package Decorator.B3;

public class ButtonWidget implements IWidget {
    String label;

    public ButtonWidget(String label) {
        this.label = label;
    }

    @Override
    public void show() {
        System.out.println("Button: " + label);
    }
}
