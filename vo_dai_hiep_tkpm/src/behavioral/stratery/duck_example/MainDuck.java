package behavioral.stratery.duck_example;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck = new VitQuay();
        duck.setFlyBehavior(new BayVongTron());
        duck.setQuackBehavior(new Squack());
        duck.display();

        Duck duck1 = new VitTroi();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.setQuackBehavior(new Squack());
        duck1.display();
    }
}
