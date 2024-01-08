package creational.factory.Shape;

public class Circle extends Shape{

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "Drawing a Circle with brush: " + brush + ", on paper: " + paper + ", in frame: " + frame;
    }
}
