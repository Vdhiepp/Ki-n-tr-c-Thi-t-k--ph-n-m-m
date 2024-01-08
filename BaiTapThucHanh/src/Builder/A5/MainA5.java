package Builder.A5;

public class MainA5 {
    public static void main(String[] args) {
        Book book = new Book.Builder("Sách cho trẻ em", 254, "Nguyễn Văn Chương").addChapter("Chương 1").addChapter("Chương 2").build();
        book.display();
    }
}
