package Factory.A3;

public class Circle extends Shape{
    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "draw circle: " + brush + paper + frame;
    }
}
