package Decorator.B3;

public class IconWidget implements IWidget{
    String iconName;

    public IconWidget(String icon) {
        this.iconName = icon;
    }

    @Override
    public void show() {
        System.out.println("Icon: " + iconName);
    }
}
