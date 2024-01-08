package bt_java_buoi_so_3.cb4;

public class GiaiThuong implements DoVeSo{
    String tenGiai;
    String[] boSoTrungThuong;
    DoVeSo giaiKeTiep;

    public GiaiThuong(String tenGiai, String[] boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    @Override
    public DoVeSo giaiKeTiep(DoVeSo giaiKeTiep) {
        this.giaiKeTiep = giaiKeTiep;
        return giaiKeTiep;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String boSo:
             boSoTrungThuong) {
            if (veSo.endsWith(boSo)) {
                return "Bạn đã trúng " + tenGiai;
            }
        }
        return giaiKeTiep.doVeSo(veSo);
    }
}
