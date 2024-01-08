package template_method.cd1;

import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon {
    List<HangHoa> list = new ArrayList<>();
    protected abstract float tinhChietKhau(float tong);
    public void tinhTien(){
        int tong = 0;
        for (HangHoa hangHoa : list)
            tong += hangHoa.gia* hangHoa.soLuong;
        System.out.println("Tổng tiền hóa đơn: " + tong);
    }
    public void hienThi(){

    }
}
