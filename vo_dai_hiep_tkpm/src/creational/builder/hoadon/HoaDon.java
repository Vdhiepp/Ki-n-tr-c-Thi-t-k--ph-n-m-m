package creational.builder.hoadon;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    String maHD, ngayBan, tenKH;
    private  HoaDonHeader header;
    List<CTHD> cthds = new ArrayList<>();

    public HoaDon(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "Hoa Don: " + this.maHD + "\n" +
                "Ngay Ban: " + this.ngayBan + "\n" +
                "Ten Khach Hang: " + this.tenKH ;
    }

    public HoaDon(Builder builder){
        this.maHD = builder.maHD;
        this.tenKH = builder.tenKH;
        this.ngayBan = builder.ngayBan;

    }
    public static class Builder{
        String maHD, ngayBan, tenKH;
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();
        public Builder setHeader(String maHD, String ngayBan, String tenKH){
            header = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, int donGia, int chietKhau){
            cthds.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }
        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
