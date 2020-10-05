package midterm2;

public class Book {

    private String ISBN;
    private String title;
    private String author;
    private static int numCopies = 0;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        numCopies++;
    }

    public Book(Book other) {
        this(other.ISBN, other.title, other.author);
    }

    public Book(String title, String author) {
        this("", title, author);
    }

    public Book(String title) {
        this("", title, "");
    }

    /* Getters */
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    /* Setters */
    public void setTitle(String title) {
        if (!title.equals("")) {
            this.title = title;
        }
    }


}
