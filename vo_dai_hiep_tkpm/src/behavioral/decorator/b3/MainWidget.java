package behavioral.decorator.b3;

public class MainWidget {
    public static void main(String[] args) {
        System.out.println("Căn giữa chữ 'Hello World!': ");
        Widget text1 = new Text("Hello World!");
        WidgetDecorator center1 = new Center(text1);
        center1.show();
        System.out.println();
        System.out.println("Một nút bấm có chữ 'Nut Bam' nằm giữa: ");
        Widget text = new Text("Nut Bam");
        WidgetDecorator center = new Center(text);
        WidgetDecorator button = new Button(center);
        button.show();
    }
}
