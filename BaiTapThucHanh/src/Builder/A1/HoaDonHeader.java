package Builder.A1;

public class HoaDonHeader {
    String maHoaDon, ngayBan, tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }
}
