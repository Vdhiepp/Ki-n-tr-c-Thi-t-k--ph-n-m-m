package creational.builder.hoadon2;
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<CTHD> chiTietHoaDon;

    public HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.chiTietHoaDon = builder.chiTietHoaDon;
    }

    public void display() {
        // Hiển thị thông tin hóa đơn
        System.out.println("Mã hóa đơn: " + hoaDonHeader.getMaHoaDon());
        System.out.println("Ngày bán: " + hoaDonHeader.getNgayBan());
        System.out.println("Tên khách hàng: " + hoaDonHeader.getTenKhachHang());
        System.out.println("Danh sách chi tiết hóa đơn:");
        for (CTHD cthd : chiTietHoaDon) {
            System.out.println("Sản phẩm: " + cthd.getSanPham());
            System.out.println("Số lượng: " + cthd.getSoLuong());
            System.out.println("Đơn giá: " + cthd.getDonGia());
            System.out.println("Chiết khấu: " + cthd.getChietKhau());
        }
    }

    public static class Builder {
        HoaDonHeader hoaDonHeader;
        List<CTHD> chiTietHoaDon = new ArrayList<>();

        public Builder(String maHoaDon, String ngayBan, String tenKhachHang) {
            hoaDonHeader = new HoaDonHeader(maHoaDon, ngayBan, tenKhachHang);
        }

        public Builder addChiTiet(CTHD cthd) {
            this.chiTietHoaDon.add(cthd);
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
