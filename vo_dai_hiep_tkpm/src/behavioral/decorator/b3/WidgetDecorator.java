package behavioral.decorator.b3;

public abstract class WidgetDecorator extends Widget{
    Widget child;

    public WidgetDecorator(Widget child) {
        this.child = child;
    }

}
