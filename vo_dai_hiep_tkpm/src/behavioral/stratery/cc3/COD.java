package behavioral.stratery.cc3;

public class COD implements HinhThucThanhToan{
    @Override
    public float thanhToan(float tong) {
        float tienKM = 0;
        if (tong > 2000000)
            return tienKM = tong * 0.02f;
        return tienKM;
    }
}
