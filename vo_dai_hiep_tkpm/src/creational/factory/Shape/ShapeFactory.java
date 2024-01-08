package creational.factory.Shape;

public class ShapeFactory {
    public Shape createShape(ShapeType type, String brush, String paper, String frame){
        return switch (type) {
            case Rectangle -> new Retangle(brush, paper, frame);
            case Triangle -> new Triangle(brush, paper, frame);
            case Circle -> new Circle(brush, paper, frame);
            default -> null;
        };
    }
}
