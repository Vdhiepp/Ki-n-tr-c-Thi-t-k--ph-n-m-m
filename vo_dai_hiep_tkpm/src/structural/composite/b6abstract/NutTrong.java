package structural.composite.b6abstract;

//Composite
public class NutTrong extends Nut{
    Nut trai = null;
    Nut phai = null;
    public NutTrong(String content) {
        super(content);
    }
    @Override
    void themTrai(Nut n) {
        trai = n;
    }
    @Override
    void themPhai(Nut n) {
        phai = n;
    }
    @Override
    void xoa(Nut n) {
        if (trai == n)
            trai = null;
        else
            if (phai == n)
                phai = null;
    }
    @Override
    //Duyet LNR
    void duyetCay() {
        if (trai != null)
            trai.duyetCay();
        System.out.println(content);
        if (phai != null)
            phai.duyetCay();
    }
}
