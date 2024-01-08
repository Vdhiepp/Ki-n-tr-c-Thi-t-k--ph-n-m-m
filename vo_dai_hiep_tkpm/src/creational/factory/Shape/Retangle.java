package creational.factory.Shape;

public class Retangle extends Shape{
    public Retangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "Drawing a Rectangle with brush: " + brush + ", on paper: " + paper + ", in frame: " + frame;
    }
}
