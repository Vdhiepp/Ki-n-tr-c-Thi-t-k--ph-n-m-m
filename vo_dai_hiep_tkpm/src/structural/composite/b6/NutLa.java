package structural.composite.b6;

public class NutLa implements IComponent{
    String s;

    public NutLa(String s) {
        this.s = s;
    }

    @Override
    public void duyetCay() {
        System.out.println(s);
    }

    @Override
    public void addLeft(IComponent component) {

    }

    @Override
    public void addRight(IComponent component) {

    }

    @Override
    public void remove(IComponent component) {

    }
}
