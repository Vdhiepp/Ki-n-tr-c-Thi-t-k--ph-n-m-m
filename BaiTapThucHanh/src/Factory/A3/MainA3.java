package Factory.A3;

public class MainA3 {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape rectangle = factory.createShape(ShapeType.Rectangle, "white ", "A4 ", "bamboo");
        System.out.println(rectangle.draw());
    }
}
