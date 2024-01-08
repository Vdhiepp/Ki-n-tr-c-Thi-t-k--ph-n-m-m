package behavioral.chain_of_responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        IXuLyKhoanVay gacCong = new NhanVienF88("ABC ", "Gac cong", 1000000);
        IXuLyKhoanVay giuXe = new NhanVienF88("DEF ", "Giu xe", 10000000);
        IXuLyKhoanVay thuKy = new NhanVienF88("GHK ", "Thu ky", 30000000);
        IXuLyKhoanVay truongPhong = new NhanVienF88("LMN ", "Truong phong", 50000000);
        IXuLyKhoanVay giamDoc = new NhanVienF88("XYZ ", "Giam doc", 100000000);

        gacCong.capCaoHon(giuXe)
                .capCaoHon(thuKy)
                .capCaoHon(truongPhong)
                .capCaoHon(giamDoc);

        System.out.println(gacCong.xuLyVay(25000000));
    }
}
