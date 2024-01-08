package structural.composite.b6abstract;

public class MainCayNhiPhan {
    public static void main(String[] args) {
        Nut nutTrai = new NutLa("Nút Trái");
        Nut nutPhai = new NutLa("Nút Phải");
        Nut nutTrong = new NutTrong("Nút Trong");
        //composite.add/remove
        nutTrong.themTrai(nutTrai);
        nutTrong.themPhai(nutPhai);
        nutTrong.duyetCay();
    }
}
