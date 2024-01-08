package behavioral.stratery.cc3;

public class KhuyenMai10Max100 implements KhuyenMai{
    @Override
    public float khuyenMai(float tong) {
        float tienKM = tong * 0.1f;
        return tienKM < 100 ? tienKM : 100;
    }
}
