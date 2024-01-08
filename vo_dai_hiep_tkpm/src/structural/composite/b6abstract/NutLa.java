package structural.composite.b6abstract;

//Component
public class NutLa extends Nut{
    public NutLa(String content) {
        super(content);
    }
    @Override
    void themTrai(Nut n) {}
    @Override
    void themPhai(Nut n) {}
    @Override
    void xoa(Nut n) {}
    @Override
    void duyetCay() {
        System.out.println(content);
    }
}
