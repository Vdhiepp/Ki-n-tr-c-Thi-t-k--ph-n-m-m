package bt_java_buoi_so_3.cb4;

public class Main {
    public static void main(String[] args) {
        DoVeSo giaiDB = new GiaiThuong("Giải đặc biệt", new String[]{"84521"});
        DoVeSo giaiNhat = new GiaiThuong("Giải nhất", new String[]{"59398"});
        DoVeSo giaiNhi = new GiaiThuong("Giải nhì", new String[]{"06955", "97174"});
        DoVeSo giaiBa = new GiaiThuong("Giải ba", new String[]{"76861", "06578", "38679", "53625", "96018", "81976"});
        DoVeSo giaiTu = new GiaiThuong("Giải tư", new String[]{"9277", "4822", "0696", "3467"});
        DoVeSo giaiNam = new GiaiThuong("Giải năm", new String[]{"5349", "9623", "4865", "2213", "9875", "7340"});
        DoVeSo giaiSau = new GiaiThuong("Giải sáu", new String[]{"604", "563", "431"});
        DoVeSo giaiSauCung = new GiaiSauCung("Giải bảy", new String[]{"93", "92", "27", "19"});

        giaiDB.giaiKeTiep(giaiNhat).
                giaiKeTiep(giaiNhi).
                giaiKeTiep(giaiBa).
                giaiKeTiep(giaiTu).
                giaiKeTiep(giaiNam).
                giaiKeTiep(giaiSau).
                giaiKeTiep(giaiSauCung);

        System.out.println(giaiDB.doVeSo("84521"));
    }
}
