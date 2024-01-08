package structural.decorator.beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }
}
