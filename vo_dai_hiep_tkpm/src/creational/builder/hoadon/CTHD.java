package creational.builder.hoadon;

public class CTHD {
    String sanPham;
    int soLuong, donGia, chietKhau;

    public CTHD(String sanPham, int soLuong, int donGia, int chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD: \n" + "San Pham: "+ sanPham + "\n" +
                "So Luong: " + soLuong + "\n" +
                "Don Gia: " + donGia + "\n" +
                "Chiet Khau: " + chietKhau;
    }
}
