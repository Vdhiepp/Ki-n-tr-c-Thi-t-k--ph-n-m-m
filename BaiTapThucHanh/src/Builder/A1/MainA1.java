package Builder.A1;

public class MainA1 {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder("123", "20/10/2023", "Dai Hiep").addChiTiet(new CTHD("tivi", "2", "120000", "5%")).addChiTiet(new CTHD("tu lanh", "3", "150000", "10%")).build();
        hoaDon.display();
    }
}
