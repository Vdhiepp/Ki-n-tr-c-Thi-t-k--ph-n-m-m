package behavioral.stratery.cc3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    List<MatHang> list = new ArrayList<>();
    HinhThucThanhToan thanhToan;
    DonViVanChuyen vanChuyen;
    KhuyenMai khuyenMai;

    public void themMH(MatHang m){
        list.add(m);
    }

    public void thanhToan(){
        int tong = 0;
        for (MatHang m : list)
            tong += m.donGia* m.soLuong;
        float tienKM = khuyenMai.khuyenMai(tong);
        float kmThanhToan = thanhToan.thanhToan(tong - tienKM);
        System.out.println("Tổng tiền hóa đơn: " + tong);
        System.out.println("Tiền giảm khuyến mãi: " + tienKM);
        System.out.println("Tiền giảm thanh toán: " + kmThanhToan);
        System.out.println("Tiền phải trả: " + (tong - tienKM - kmThanhToan));
        System.out.println("Bạn sẽ nhận được sau: " + vanChuyen.soNgay());
    }

    public void setThanhToan(HinhThucThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setVanChuyen(DonViVanChuyen vanChuyen) {
        this.vanChuyen = vanChuyen;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }
}
