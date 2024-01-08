package Decorator.B3;

public class CenterWidget implements IWidget {
    IWidget child;

    public CenterWidget(IWidget child) {
        this.child = child;
    }

    @Override
    public void show() {
        System.out.println("Center:");
        child.show();
    }
}
