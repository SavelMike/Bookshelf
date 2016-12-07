import java.awt.print.Book;
import java.util.ArrayList;

/**
 * Created by Михаил on 07.12.2016.
 */
public class Bookshelf {

    private ArrayList<Book> shelf;
    private int maxBooks;


    public Bookshelf(ArrayList<Book> s, int amnt) {
        shelf = new ArrayList<Book>();
        maxBooks = amnt;
    }

    public void add(Book b) {
        shelf.add(b);
    }

    public void remove(int i) {
        shelf.remove(i);
    }

    public void moveToBookshelf(int i, Bookshelf anotherShelf) {
        anotherShelf.add(shelf.get(i));
        shelf.remove(i);
    }

    public int getBookAmount() {
        return shelf.size();
    }

    public int getTotalPages() {
        for (int i = 0; i < shelf.size(); i++) {
            shelf.getPages(i);  
        }
    }

    public Author getOldestAuthor() {

    }

    public ArrayList<Book> getListOfDuplicates() {

    }

    public ArrayList<Book> getAuthorBooks(Author a) {

    }

}
