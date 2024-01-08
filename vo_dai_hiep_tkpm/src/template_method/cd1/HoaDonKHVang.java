package template_method.cd1;

public class HoaDonKHVang extends HoaDon{
    @Override
    protected float tinhChietKhau(float tong) {
        if(tong >= 1000000)
            return tong * 0.05f;
        else if(tong >= 500000)
            return tong * 0.03f;
        else return tong;
    }
}