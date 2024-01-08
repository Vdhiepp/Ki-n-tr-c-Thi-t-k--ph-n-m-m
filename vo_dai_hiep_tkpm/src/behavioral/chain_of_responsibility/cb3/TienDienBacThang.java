package behavioral.chain_of_responsibility.cb3;

public class TienDienBacThang implements TinhTienDienBacThang{
    int min, max, gia;
    TinhTienDienBacThang bacKeTiep;

    public TienDienBacThang(int min, int max, int gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    @Override
    public TinhTienDienBacThang bacKeTiep(TinhTienDienBacThang bacKeTiep) {
        this.bacKeTiep = bacKeTiep;
        return bacKeTiep;
    }

    @Override
    public int tinhTienDien(int soKW) {
        if (soKW <= max)
            return (soKW - min)*gia;
        return (max-min)*gia + bacKeTiep.tinhTienDien(soKW);
    }
}
