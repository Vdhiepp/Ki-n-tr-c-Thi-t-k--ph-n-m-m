package bt_java.bt4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe xe = new QuanLyChuyenXe();
        xe.them(new ChuyenXeNoiThanh("123", "Minh", "123", 250000, "123", "35"));
        xe.them(new ChuyenXeNoiThanh("124", "My", "124", 290000, "124", "40"));
        xe.them(new ChuyenXeNoiThanh("125", "Mai", "125", 150000, "125", "30"));
        xe.them(new ChuyenXeNgoaiThanh("113", "Dung", "113", 230000, "123", 7));
        xe.them(new ChuyenXeNgoaiThanh("114", "Huy", "114", 200000, "123", 5));
        xe.them(new ChuyenXeNgoaiThanh("115", "Duy", "115", 500000, "123", 10));

        xe.inDS();
        System.out.println("Doanh thu xe ngoại thành: " + xe.doanhThuXeNgoaiThanh());
        System.out.println("Doanh thu xe nội thành: " + xe.doanhThuXeNoiThanh());
        System.out.println("Tổng doanh thu: " + xe.tongDoanhThu());
    }
}
