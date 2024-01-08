package Factory.A3;

public class Rectangle extends Shape{

    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "draw rectangle :" + brush + paper + frame;
    }
}
