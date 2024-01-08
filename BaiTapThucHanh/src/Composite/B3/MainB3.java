package Composite.B3;

public class MainB3 {
    public static void main(String[] args) {
        Folder root = new Folder("D:");
        Folder taiLieu = new Folder("TaiLieu");
        Folder designPattern = new Folder("Design Pattern");
        File creationalPattern = new File("CreationalPattern.pptx");
        File structuralPattern = new File("StructuralPattern.pptx");
        Folder lapTrinhJava = new Folder("Lap Trinh Java");
        File lapTrinhJavaCoBan = new File("LapTrinhJavaCoBan.docx");
        File lapTrinhJavaNangCao = new File("LapTrinhJavaNangCao.pdf");
        File ngonNguLapTrinhC = new File("NgonNguLapTrinhC.pdf");
        Folder lapTrinhThietBiDiDong = new Folder("LapTrinhThietBiDiDong");
        File coBan = new File("CoBan.pptx");
        File nangCao = new File("NangCao.pptx");

        designPattern.addItem(creationalPattern);
        designPattern.addItem(structuralPattern);
        lapTrinhJava.addItem(lapTrinhJavaCoBan);
        lapTrinhJava.addItem(lapTrinhJavaNangCao);
        lapTrinhJava.addItem(ngonNguLapTrinhC);
        lapTrinhThietBiDiDong.addItem(coBan);
        lapTrinhThietBiDiDong.addItem(nangCao);

        taiLieu.addItem(designPattern);
        taiLieu.addItem(lapTrinhJava);
        taiLieu.addItem(lapTrinhThietBiDiDong);

        root.addItem(taiLieu);

        // Hiển thị toàn bộ thông tin
        System.out.println(root.getStringTreeFolder());
    }
}
