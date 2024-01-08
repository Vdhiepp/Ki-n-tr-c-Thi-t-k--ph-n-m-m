package bt_java.bt3;

public class SinhVienBiz extends SinhVienPoly{
    double marketing, sales;
    public SinhVienBiz(String hoTen, String nganh, double marketing, double sales) {
        super(hoTen, nganh);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (marketing * 2 + sales) / 3;
    }
}
