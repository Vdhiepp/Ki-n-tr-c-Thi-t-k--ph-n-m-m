package structural.composite.bt4;

public class MainBT4 {
    public static void main(String[] args) {
        //2 nam, 4 ky, 8 mon
        MonHoc mon1 = new MonHoc("Web1", 3, 880000);
        MonHoc mon2 = new MonHoc("QLDA", 3, 880000);
        MonHoc mon3 = new MonHoc("Java", 3, 880000);
        MonHoc mon4 = new MonHoc("Android", 3, 880000);
        MonHoc mon5 = new MonHoc("TKPM", 3, 880000);
        MonHoc mon6 = new MonHoc("TuTongHCM", 2, 440000);
        MonHoc mon7 = new MonHoc("LichSuDang", 2, 440000);
        MonHoc mon8 = new MonHoc("TheChat", 1, 440000);

        KeHoachChung khc1 = new KeHoachChung("Nam 1:");
        khc1.add(mon1);
        khc1.add(mon2);
        khc1.add(mon3);
        khc1.add(mon4);
        System.out.println("Nam 1: ");
        System.out.println("\tTong so TC: " + khc1.getSoTC());
        System.out.println("\tTong hoc phi: " + khc1.getHocPhi() + "\n");

        KeHoachChung khc2 = new KeHoachChung("Nam 2:");
        khc2.add(mon5);
        khc2.add(mon6);
        khc2.add(mon7);
        khc2.add(mon8);
        System.out.println("Nam 2: ");
        System.out.println("\tTong so TC: " + khc2.getSoTC());
        System.out.println("\tTong hoc phi: " + khc2.getHocPhi() + "\n");

        System.out.println("Toan khoa: ");
        System.out.println("\tTong so TC: " + (khc1.getSoTC() + khc2.getSoTC()));
        System.out.println("\tTong hoc phi: " + (khc1.getHocPhi() + khc2.getHocPhi()) + "\n");
    }
}
