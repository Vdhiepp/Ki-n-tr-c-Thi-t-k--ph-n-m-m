package creational.factory.pizza2;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore store = new VN_PizzaStore();
        Pizza p = store.order(PizzaType.Seafood);
        System.out.println(p.toString());
    }
}
