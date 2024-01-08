package Composite.B4;

public abstract class KHHT {
    String name;

    public KHHT(String name) {
        this.name = name;
    }
    public abstract void add(KHHT hk);
    public abstract void remove(KHHT hk);
    public abstract int getSoTC();
    public abstract float getHocPhi();
}
