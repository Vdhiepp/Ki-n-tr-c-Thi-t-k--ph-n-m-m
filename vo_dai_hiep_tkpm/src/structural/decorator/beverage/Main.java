package structural.decorator.beverage;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new HouseBlend("Cafe House Blend Trung Nguyên");
        coffee = new Milk(coffee);
        coffee = new Milk(coffee);

        Beverage coffe1 = new Espresso("Cafe Espresso đậm vị");
        coffe1 = new Milk(coffe1);
        coffe1 = new Mocha(coffe1);

        System.out.println(coffee.getDescription());
        System.out.println("Giá: " + coffee.cost());

        System.out.println(coffe1.getDescription());
        System.out.println("Giá: " + coffe1.cost());
    }
}
