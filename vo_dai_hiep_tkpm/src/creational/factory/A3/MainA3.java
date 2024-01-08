package creational.factory.A3;

public class MainA3 {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.createShape(ShapeType.CIRCLE);
        System.out.println(shape1.draw());

        Shape shape2 = factory.createShape(ShapeType.RETANGLE);
        System.out.println(shape2.draw());

        Shape shape3 = factory.createShape(ShapeType.TRIANGLE);
        System.out.println(shape3.draw());
    }
}
