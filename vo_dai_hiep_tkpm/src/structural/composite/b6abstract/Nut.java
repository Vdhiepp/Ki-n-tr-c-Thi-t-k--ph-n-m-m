package structural.composite.b6abstract;

public abstract class Nut {
    String content;

    public Nut(String content) {
        this.content = content;
    }

    abstract void themTrai(Nut n);
    abstract void themPhai(Nut n);
    abstract void xoa(Nut n);
    abstract void duyetCay();
}
