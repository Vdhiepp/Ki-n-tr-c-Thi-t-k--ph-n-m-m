package structural.composite.bt4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();
    public KeHoachChung(String name) {
        super(name);
    }

    @Override
    public void add(KeHoachHocTap hocTap) {
        list.add(hocTap);
    }

    @Override
    public void remove(KeHoachHocTap hocTap) {
        list.remove(hocTap);
    }

    @Override
    public int getSoTC() {
        int tong = 0;
        for (KeHoachHocTap hocTap : list){
            tong += hocTap.getSoTC();
        }
        return tong;
    }

    @Override
    public float getHocPhi() {
        int tong = 0;
        for (KeHoachHocTap hocTap : list){
            tong += hocTap.getHocPhi();
        }
        return tong;
    }
}
