package day4;

public class Book {
    String title;

    String author;

    int price;

    int currentPage;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void 책장을넘기다() {
        currentPage++;
    }

    public void 책장을넘기다(int page) {
        currentPage = page;
    }

    public static void main(String[] args) {
        Book book1 = new Book("한강", "강", 3000);
    }
}
