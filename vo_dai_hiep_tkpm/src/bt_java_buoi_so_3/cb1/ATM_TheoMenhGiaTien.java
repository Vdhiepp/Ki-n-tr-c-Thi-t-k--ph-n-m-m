package bt_java_buoi_so_3.cb1;

public class ATM_TheoMenhGiaTien implements ATM{
    ATM menhGiaKeTiep;
    int menhGiaTien;

    public ATM_TheoMenhGiaTien(int menhGiaTien) {
        this.menhGiaTien = menhGiaTien;
    }

    @Override
    public ATM menhGiaKeTiep(ATM atm) {
        menhGiaKeTiep = atm;
        return menhGiaKeTiep;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGiaTien;
        int soDu = soTien % menhGiaTien;
        if (soTo > 0)
            System.out.println(soTo + " to " + menhGiaTien);
        if (soDu > 0 && menhGiaKeTiep != null)
            menhGiaKeTiep.rutTien(soDu);
    }
}
