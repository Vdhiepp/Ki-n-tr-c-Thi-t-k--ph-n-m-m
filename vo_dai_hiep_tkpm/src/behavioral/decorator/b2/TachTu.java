package behavioral.decorator.b2;

public class TachTu implements ITokennize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public String[] tokenize() {
        return s.split(" ");
    }
}
