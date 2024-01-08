package behavioral.decorator.b3;

public class Center extends WidgetDecorator{

    public Center(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("<center>");
        child.show();
        System.out.println("</center>");
    }
}
