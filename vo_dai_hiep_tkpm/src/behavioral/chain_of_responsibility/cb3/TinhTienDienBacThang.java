package behavioral.chain_of_responsibility.cb3;

public interface TinhTienDienBacThang {
    TinhTienDienBacThang bacKeTiep(TinhTienDienBacThang bacKeTiep);
    int tinhTienDien(int soKW);
}
