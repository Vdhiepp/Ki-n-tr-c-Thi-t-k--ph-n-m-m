package behavioral.stratery.duck_example;

public class Squack implements IQuackBehavior{
    @Override
    public String quack() {
        return "Quack... Quack... Quack";
    }
}
