package behavioral.stratery.cc3;

public class MainGioHang {
    public static void main(String[] args) {
        GioHang gh = new GioHang();
        MatHang mh1 = new MatHang("ABC", 4,100000);
        gh.themMH(mh1);
        gh.setKhuyenMai(new KhuyenMai10Max100());
        gh.setThanhToan(new COD());
        gh.setVanChuyen(new GiaoHangNhanh());
        gh.thanhToan();
    }
}
