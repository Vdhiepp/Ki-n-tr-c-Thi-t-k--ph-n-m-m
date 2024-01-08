package structural.decorator.beverage;

// Cả 2 thành phần decorate và thành phần đc decorated phải kế thừa từ 1 class
// Thành phần decorate phải chứa thành phần được decorated
public abstract class Beverage {
    String description;
    public abstract int cost();

    public String getDescription() {
        return description;
    }
}
