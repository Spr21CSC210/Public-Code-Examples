package midterm2;

import java.util.Set;

public class Book {

    private String author;
    private String ISBN;
    private String title;
    private Set<String> relatedBooks;

    private static int numBooks = 0;

    public Book(Book copy) {
        this(copy.author, copy.ISBN, copy.title);
        this.relatedBooks = copy.relatedBooks;
    }

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
