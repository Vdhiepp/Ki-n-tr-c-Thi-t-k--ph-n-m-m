package decorator_pattern;

public class Chia extends BieuThucDecorator{
    int toanHang;

    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + " / " + toanHang;
    }
}
