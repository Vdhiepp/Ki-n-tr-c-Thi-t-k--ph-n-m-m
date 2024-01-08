package bt_java.bt3;

public class MainSinhVienPoly {
    public static void main(String[] args) {
       SinhVienIT sinhVienIT = new SinhVienIT("ABC", "CNTT", 8.3, 7.5, 9.2);
       SinhVienBiz sinhVienBiz = new SinhVienBiz("XYZ", "QTKD", 7.5, 8.9);
        sinhVienIT.xuat();
        sinhVienBiz.xuat();
    }
}
