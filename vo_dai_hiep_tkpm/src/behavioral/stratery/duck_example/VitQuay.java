package behavioral.stratery.duck_example;

public class VitQuay extends Duck{
    @Override
    public void display() {
        System.out.println("vịt quay Bắc Kinh");
        this.swim();
        this.performQuack();
        this.performFly();
    }
}
