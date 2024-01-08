package structural.composite.bt4;

public abstract class KeHoachHocTap {
    String name;
    public KeHoachHocTap(String name){
        this.name = name;
    }
    public abstract void add(KeHoachHocTap hocTap);
    public abstract void remove(KeHoachHocTap hocTap);
    public abstract int getSoTC();
    public abstract float getHocPhi();
}
