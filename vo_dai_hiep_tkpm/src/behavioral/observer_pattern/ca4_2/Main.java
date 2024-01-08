package behavioral.observer_pattern.ca4_2;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA tva = new ThanhVienA(topic);
        ThanhVienB tvb = new ThanhVienB(topic);
        System.out.println("Lan 1: ");
        topic.tinMoi(new Tin(1, "Co giao Tuyen Quang bi hoc sinh don vao tuong"));
        System.out.println("\nLan 2: ");
        topic.tinMoi(new Tin(2, "Tien si bang gia day 6 nam o Hutech"));
    }
}
