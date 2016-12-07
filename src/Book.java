/**
 * Created by Михаил on 07.12.2016.
 */
public class Book {

    private String title;
    private int pages;
    private String ISBNnum;
    private Author author;

    public Book(String t, int p, String isbn, Author a) {
        title = t;
        pages = p;
        ISBNnum = isbn;
        author = a;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getISBNnumber() {
        return ISBNnum;
    }

    public Author getAuthor() {
        return author;
    }
}
