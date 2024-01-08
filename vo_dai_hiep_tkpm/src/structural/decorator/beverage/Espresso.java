package structural.decorator.beverage;

public class Espresso extends Beverage{
    public Espresso(String description) {
        this.description = description;
    }

    @Override
    public int cost() {
        return 20;
    }
}
