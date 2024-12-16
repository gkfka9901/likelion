package day10;

public class Book {
    private String title;
    private Author author;
    public Book(String title) {
        this.title = title;
        this.author = new Author();
    }

    public Author getAuthor() {

        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void printBookDeetails() {
        System.out.println("Book TITLE : " + title);
        System.out.println("Author : " + getAuthor().getName());
    }

    public class Author{
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }


    }
}
