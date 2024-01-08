package creational.factory.pizza2;

public class VN_PizzaSeafood extends Pizza{
    @Override
    public void prepare() {
        builder.append("Bột mì, tôm, mực, nước mắm...");
    }

    @Override
    public void bake() {
        builder.append("\nNướng trên lửa than");
    }

    @Override
    public void cut() {
        builder.append("\nCắt làm 4");
    }

    @Override
    public void box() {
        builder.append("\nĐóng hộp lá chuối\nChúc quý khách ngon miệng, hẹn gặp lại!");
    }
}
