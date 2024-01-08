package bt_java.bt1;

public class MainBT1 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Minh", "Nha Trang", 100, 30, 13000000);
        NhanVien nv2 = new NhanVien("Mẫn", "Nha Trang", 200, 31, 13000000);
        System.out.println(nv1.getThongTin());
        System.out.println(nv1.tinhThuong());
        System.out.println(nv2.getThongTin());
        System.out.println(nv2.tinhThuong());
    }
}
