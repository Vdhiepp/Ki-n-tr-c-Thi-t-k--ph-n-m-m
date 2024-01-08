package Builder.A5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title, author;
    int pageCount;
    List<String> chapters;

    private Book(Builder builder) {
        this.title = builder.title;
        this.pageCount = builder.pageCount;
        this.author = builder.author;
        this.chapters = builder.chapters;
    }

    public void display() {
        System.out.println("Thông tin về cuốn sách:");
        System.out.println("Tựa đề: " + title);
        System.out.println("Số trang: " + pageCount);
        System.out.println("Tác giả: " + author);
        System.out.println("Danh sách các chương:");
        for (String chapter : chapters) {
            System.out.println("- " + chapter);
        }
    }

    public static class Builder {
        String title, author;
        int pageCount;
        List<String> chapters = new ArrayList<>();

        public Builder(String title, int pageCount, String author) {
            this.title = title;
            this.pageCount = pageCount;
            this.author = author;
        }

        public Builder addChapter(String chapterTitle) {
            this.chapters.add(chapterTitle);
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
