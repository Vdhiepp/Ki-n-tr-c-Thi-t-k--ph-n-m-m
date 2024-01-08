package creational.singleton.a6;

public class MainA6 {
    public static void main(String[] args) {
        DataAccess data = DataAccess.getInstance();
        SanPham sanPham1 = new SanPham("A1", "May lanh", 2, 10000);
        SanPham sanPham2 = new SanPham("B1", "Tu lanh", 1, 15000);
        data.them(sanPham1);
        data.them(sanPham2);

        DataAccessUpgrade upgrade1 = DataAccessUpgrade.getInstance("tag1");
        DataAccessUpgrade upgrade2 = DataAccessUpgrade.getInstance("tag2");
        upgrade1.add("Ti Vi");
        upgrade2.add("Tu Lanh");
        upgrade2.add("May tinh");
        System.out.println("D1: ");
        System.out.println(upgrade1.toString());
        System.out.println("D2: ");
        System.out.println(upgrade2.toString());

        DataAccessUpgrade upgrade3 = DataAccessUpgrade.getInstance("tag2");
        System.out.println("D3: ");
        System.out.println(upgrade3.toString());
    }
}
