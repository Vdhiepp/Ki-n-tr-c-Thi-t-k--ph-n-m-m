package creational.builder.hoadon2;

public class Main {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder("HD001", "2023-10-22", "Khách hàng A")
                .addChiTiet(new CTHD("Sản phẩm 1", 5, 100.0, 10.0))
                .addChiTiet(new CTHD("Sản phẩm 2", 3, 50.0, 5.0))
                .build();

        hoaDon.display();
    }


}
