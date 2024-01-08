package bt_java.bt4;

//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu
public class ChuyenXeNoiThanh extends ChuyenXe {
    String soTuyen;
    String soKM;

    public ChuyenXeNoiThanh(String maChuyen, String tenTX, String soXe, int doanhThu, String soTuyen, String soKM) {
        super(maChuyen, tenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return "Mã chuyến xe: " + this.maChuyen + "\n" +
                "Họ tên tài xế: " + this.tenTX + "\n" +
                "Số xe: " + this.soXe + "\n" +
                "Số tuyến: " + this.soTuyen + "\n" +
                "Số km đi được: " + this.soKM + "\n";
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public String getSoKM() {
        return soKM;
    }

    public void setSoKM(String soKM) {
        this.soKM = soKM;
    }
}
