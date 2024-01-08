package creational.factory.pizza;

public class PizzaMamNem extends Pizza{
    @Override
    public void prepare() {
        description.append("1 ");
    }

    @Override
    public void bake() {
        description.append(" ");
    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
