package creational.factory.pizza2;

public class VN_PizzaChicken extends Pizza{
    @Override
    public void prepare() {
        builder.append("gà, bột mì, nước mắm,...");
    }

    @Override
    public void bake() {
        builder.append("nướng trên bếp than");
    }

    @Override
    public void cut() {
        builder.append("cắt 6 mảnh");
    }

    @Override
    public void box() {
        builder.append("đóng hộp giấy");
    }
}
