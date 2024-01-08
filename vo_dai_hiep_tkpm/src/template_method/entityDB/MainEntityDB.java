package template_method.entityDB;

public class MainEntityDB {
    public static void main(String[] args) {
        EntityDB63<SinhVien> qlsv = new SinhVienDB();
        qlsv.add(new SinhVien(1,"Minh Thư","20/10/2003","Huế"));
        qlsv.add(new SinhVien(2,"Minh Hằng","20/10/2003","Quảng Nam"));
        qlsv.add(new SinhVien(3,"Nhất Duy","08/03/2003","Quảng Ngãi"));
        qlsv.printInfo();
        qlsv.update(new SinhVien(3,"Duy Nhất","03/08/2003", "Huế"));
        qlsv.printInfo();
    }
}
