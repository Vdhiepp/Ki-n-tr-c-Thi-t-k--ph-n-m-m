package creational.builder.hoadon;

public class HoaDonHeader {
    String maHD, ngayBan, tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "Hoa Don Header: \n" + "Ma HD: " + maHD + "\n" +
                "Ngay Ban: " + ngayBan + "\n" +
                "Ten Khach Hang: " + tenKH + "\n";
    }
}
