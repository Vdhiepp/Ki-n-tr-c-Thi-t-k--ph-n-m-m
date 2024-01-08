package bt_java.bt4;

//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;

    public ChuyenXeNgoaiThanh(String maChuyen, String tenTX, String soXe, int doanhThu, String noiDen, int soNgayDi) {
        super(maChuyen, tenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        return "Mã chuyến xe: " + this.maChuyen + "\n" +
                "Họ tên tài xế: " + this.tenTX + "\n" +
                "Số xe: " + this.soXe + "\n" +
                "Số tuyến: " + this.noiDen + "\n" +
                "Số km đi được: " + this.soNgayDi + "\n";
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
}
