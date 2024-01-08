package Factory.A3;

public abstract class Shape {
    String brush, paper, frame;
    public abstract String draw();

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
}
