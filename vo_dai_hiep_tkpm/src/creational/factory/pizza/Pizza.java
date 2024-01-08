package creational.factory.pizza;

public abstract class Pizza {
    StringBuilder description = new StringBuilder();
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();

    @Override
    public String toString() {
        return description.toString();
    }
}
