package bt_java_buoi_so_3.b3;

public class Main {
    public static void main(String[] args) {
        // Tạo thư mục gốc
        Folder root = new Folder("TaiLieu", "2023-10-11");

        // Tạo thư mục và tệp tin con
        Folder designPattern = new Folder("Design Pattern", "2023-10-11");
        Folder lapTrinhJava = new Folder("Lap Trinh Java", "2023-10-11");
        Folder ngonNguLapTrinhC = new Folder("NgonNguLapTrinhC.pdf", "2023-10-11");
        Folder lapTrinhThietBiDiDong = new Folder("LapTrinhThietBiDiDong", "2023-10-11");

        File creationalPattern = new File("CreationalPattern.pptx", "2023-10-11");
        File structuralPattern = new File("StructuralPattern.pptx", "2023-10-11");
        File lapTrinhJavaCoBan = new File("LapTrinhJavaCoBan.docx", "2023-10-11");
        File lapTrinhJavaNangCao = new File("LapTrinhJavaNangCao.pdf", "2023-10-11");
        File coBan = new File("CoBan.pptx", "2023-10-11");
        File nangCao = new File("NangCao.pptx", "2023-10-11");

        // Thêm các thư mục và tệp tin vào thư mục gốc
        root.add(designPattern);
        root.add(lapTrinhJava);
        root.add(ngonNguLapTrinhC);
        root.add(lapTrinhThietBiDiDong);

        designPattern.add(creationalPattern);
        designPattern.add(structuralPattern);

        lapTrinhJava.add(lapTrinhJavaCoBan);
        lapTrinhJava.add(lapTrinhJavaNangCao);

        lapTrinhThietBiDiDong.add(coBan);
        lapTrinhThietBiDiDong.add(nangCao);

        // In ra cây thư mục
        System.out.println(root.getStringTreeFolder());
    }
}
