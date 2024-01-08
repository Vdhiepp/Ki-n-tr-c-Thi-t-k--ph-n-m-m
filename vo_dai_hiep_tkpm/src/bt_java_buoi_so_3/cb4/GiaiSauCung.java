package bt_java_buoi_so_3.cb4;

public class GiaiSauCung implements DoVeSo{
    String tenGiai;
    String[] boSoTrungThuong;
    DoVeSo giaiKeTiep;

    public GiaiSauCung(String tenGiai, String[] boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    @Override
    public DoVeSo giaiKeTiep(DoVeSo giaiKeTiep) {
        return null;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String boSo:
                boSoTrungThuong) {
            if (veSo.endsWith(boSo)) {
                return "Bạn đã trúng " + tenGiai;
            }
        }
        return "Chúc bạn may mắn lần sau.";
    }
}
