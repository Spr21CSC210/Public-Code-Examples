package midterm2;

public class Book {

    private String author;
    private String ISBN;
    private String title;

    private static int numBooks = 0;

    public Book(String author, String ISBN, String title) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
        numBooks++;
    }

    public Book(String title) {
        this("", "", title);
    }

    public int getTotalNumBooks() {
        return numBooks;
    }

}
