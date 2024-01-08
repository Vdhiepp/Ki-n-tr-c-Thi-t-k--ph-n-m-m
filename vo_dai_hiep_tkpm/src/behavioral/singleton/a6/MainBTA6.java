package behavioral.singleton.a6;

public class MainBTA6 {
    public static void main(String[] args) {
        DataAccess632 data1 = DataAccess632.getInstance("tag1");
        DataAccess632 data2 = DataAccess632.getInstance("tag2");
        DataAccess632 data3 = DataAccess632.getInstance("tag2");

        data1.them(new SanPham("1", "ti vi", 3, 15000000));
        data1.them(new SanPham("2", "lo vi song", 3, 680000));
        data2.them(new SanPham("3", "may giat", 3, 1500000));
        data2.them(new SanPham("4", "may say", 2, 180000));
        System.out.println("Danh sach data1: ");
        System.out.println(data1.toString());
        System.out.println("Danh sach data2: ");
        System.out.println(data2.toString());
        System.out.println(data3.toString());
    }
}
