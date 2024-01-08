package creational.factory.pizza;

abstract public class PizzaStore {
    abstract protected Pizza createPizza(PizzaType t);
    public Pizza order(PizzaType t){
        Pizza p = createPizza(t);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
}
