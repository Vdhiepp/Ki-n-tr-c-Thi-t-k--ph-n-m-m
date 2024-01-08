package structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage; // Tham chieu den doi tuong duoc trang tri

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
