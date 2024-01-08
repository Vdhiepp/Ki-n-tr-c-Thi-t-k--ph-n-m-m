package behavioral.chain_of_responsibility.cb3;

public class MainTienDien {
    public static void main(String[] args) {
        TinhTienDienBacThang bac1 = new TienDienBacThang(0,50,1806);
        TinhTienDienBacThang bac2 = new TienDienBacThang(50,100,1866);
        TinhTienDienBacThang bac3 = new TienDienBacThang(100,200,2167);
        TinhTienDienBacThang bac4 = new TienDienBacThang(200,300,2729);
        TinhTienDienBacThang bac5 = new TienDienBacThang(300,400,3050);
        TinhTienDienBacThang bac6 = new TienDienBacThang(400,Integer.MAX_VALUE,3151);

        bac1.bacKeTiep(bac2)
                .bacKeTiep(bac3)
                .bacKeTiep(bac4)
                .bacKeTiep(bac5)
                .bacKeTiep(bac6);

        System.out.println(bac1.tinhTienDien(175));
    }
}
