package structural.composite.bt4;

public class MonHoc extends KeHoachHocTap{
//thiếu phương thức khởi tạo nên bị đỏ
    int soTC;
    int hocPhi; //học phí trên một tín chỉ

    public MonHoc(String name, int soTC, int hocPhi) {
        super(name);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void add(KeHoachHocTap hocTap) {

    }

    @Override
    public void remove(KeHoachHocTap hocTap) {

    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public float getHocPhi() {
        return soTC * hocPhi;
    }
}
