package creational.factory.Shape;

public class Triangle extends Shape{
    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    @Override
    public String draw() {
        return "Drawing a Triangle with brush: " + brush + ", on paper: " + paper + ", in frame: " + frame;
    }
}
