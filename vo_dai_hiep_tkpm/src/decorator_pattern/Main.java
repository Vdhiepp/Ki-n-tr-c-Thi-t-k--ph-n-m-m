package decorator_pattern;

public class Main {
    public static void main(String[] args) {
        //(6+9)*8 + 5; (8+6)/2*5 +8-4
        BieuThuc bieuThuc = new Tru(new Cong(new Nhan(new Chia(new Cong(new BieuThucDonGian(6), 8), 2), 5),8),4);

        System.out.println("Biểu thức: " + bieuThuc.bieuThuc() + " = " + bieuThuc.giaTri());
    }
}
