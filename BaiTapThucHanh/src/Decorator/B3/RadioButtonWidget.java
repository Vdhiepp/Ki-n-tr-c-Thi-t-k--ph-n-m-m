package Decorator.B3;

public class RadioButtonWidget implements IWidget {
    String label;

    public RadioButtonWidget(String label) {
        this.label = label;
    }

    @Override
    public void show() {
        System.out.println("RadioButton: " + label);
    }
}
