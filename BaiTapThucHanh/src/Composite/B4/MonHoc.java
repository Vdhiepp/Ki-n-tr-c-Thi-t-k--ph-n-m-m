package Composite.B4;

public class MonHoc extends KHHT{
    int soTC, hocPhi;

    public MonHoc(String name, int soTC, int hocPhi) {
        super(name);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void add(KHHT hk) {

    }

    @Override
    public void remove(KHHT hk) {

    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public float getHocPhi() {
        return soTC*hocPhi;
    }
}
