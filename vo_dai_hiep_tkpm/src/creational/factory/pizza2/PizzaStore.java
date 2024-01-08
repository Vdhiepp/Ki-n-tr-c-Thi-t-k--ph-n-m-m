package creational.factory.pizza2;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType type);
    public Pizza order(PizzaType type) {
        Pizza pizza = createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}
