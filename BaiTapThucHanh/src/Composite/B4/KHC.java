package Composite.B4;

import java.util.ArrayList;
import java.util.List;

public class KHC extends KHHT{
    List<KHHT> list = new ArrayList<>();

    public KHC(String name) {
        super(name);
    }

    @Override
    public void add(KHHT hk) {
        list.add(hk);
    }

    @Override
    public void remove(KHHT hk) {
        list.remove(hk);
    }

    @Override
    public int getSoTC() {
        int tong = 0;
        for (KHHT hk:list) {
            tong += hk.getSoTC();
        }
        return tong;
    }

    @Override
    public float getHocPhi() {
        int tong = 0;
        for (KHHT hk:list) {
            tong += (int) hk.getHocPhi();
        }
        return tong;
    }
}
