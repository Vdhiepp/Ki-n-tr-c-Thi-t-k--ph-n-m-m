package creational.factory.A3;

public class ShapeFactory {
    public Shape createShape(ShapeType type){
        switch (type){
            case CIRCLE -> {
                return new Circle();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
            case RETANGLE -> {
                return new Retangle();
            }
        }
        return null;
    }
}
