package Builder.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;

    public HoaDon (Builder builder){
        this.header = builder.header;
        this.cthds = builder.cthds;
    }
    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();
        public Builder(String maHoaDon, String ngayBan, String tenKhachHang){
            header = new HoaDonHeader(maHoaDon, ngayBan,tenKhachHang);
        }
        public Builder addChiTiet(CTHD cthd){
            this.cthds.add(cthd);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
    public void display(){
        System.out.println(header.getMaHoaDon());
        System.out.println(header.getNgayBan());
        System.out.println(header.getTenKhachHang());
        for (CTHD cthd : cthds) {
            System.out.println(cthd.getSanPham());
            System.out.println(cthd.getSoLuong());
            System.out.println(cthd.getDonGia());
            System.out.println(cthd.getChietKhau());
        }
    }
}
