package bt_java.bt2;

import bt_java.bt1.NhanVien;

public class MainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLyNV = new QuanLyNhanVien();
        quanLyNV.themNV(new NhanVien("Minh", "Nha Trang", 100, 30, 13000000));
        quanLyNV.themNV(new NhanVien("Mẫn", "Tuy Hòa", 120, 28, 15000000));
        quanLyNV.themNV(new NhanVien("Mộng", "Cam Ranh", 200, 32, 17500000));
        quanLyNV.themNV(new NhanVien("Mơ", "Nha Trang", 90, 31, 10000000));
        quanLyNV.themNV(new NhanVien("My", "Nha Trang", 150, 30, 14000000));
        quanLyNV.inDS();
    }
}
