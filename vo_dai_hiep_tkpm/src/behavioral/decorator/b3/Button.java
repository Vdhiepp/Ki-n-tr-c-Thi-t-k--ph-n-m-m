package behavioral.decorator.b3;

public class Button extends WidgetDecorator{
    public Button(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("<button>");
        child.show();
        System.out.println("</button>");
    }
}
