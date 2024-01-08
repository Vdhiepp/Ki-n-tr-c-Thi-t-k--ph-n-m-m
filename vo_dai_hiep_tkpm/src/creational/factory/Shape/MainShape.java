package creational.factory.Shape;

public class MainShape {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape rectangle = factory.createShape(ShapeType.Rectangle, "Red brush", "White paper", "Wooden frame");
        System.out.println(rectangle.draw());
    }
}
