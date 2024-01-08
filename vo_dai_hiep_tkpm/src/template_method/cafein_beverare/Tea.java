package template_method.cafein_beverare;

public class Tea extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Ngân túi lọc trà trong nước sôi 5 phút, sau đó lấy ra");
    }

    @Override
    public void addCondiment() {
        System.out.println("Thêm sữa ông Thọ --> Trà sữa ông Thọ");
    }
}
