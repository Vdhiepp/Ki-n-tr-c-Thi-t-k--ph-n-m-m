package behavioral.stratery.duck_example;

public class VitTroi extends Duck{
    @Override
    public void display() {
        System.out.println("Vịt trời");
        this.swim();
        this.performFly();
        this.performQuack();
    }
}
