package Factory.A3;

public class Triangle extends Shape{
    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "draw triangle: " + brush + paper + frame;
    }
}
