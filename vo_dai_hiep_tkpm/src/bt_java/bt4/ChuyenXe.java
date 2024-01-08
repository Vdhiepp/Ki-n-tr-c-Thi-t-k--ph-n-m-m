package bt_java.bt4;

//- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu
public class ChuyenXe {
    String maChuyen, tenTX, soXe;
    int doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maChuyen, String tenTX, String soXe, int doanhThu) {
        this.maChuyen = maChuyen;
        this.tenTX = tenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyen() {
        return maChuyen;
    }

    public void setMaChuyen(String maChuyen) {
        this.maChuyen = maChuyen;
    }

    public String getTenTX() {
        return tenTX;
    }

    public void setTenTX(String tenTX) {
        this.tenTX = tenTX;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
}


