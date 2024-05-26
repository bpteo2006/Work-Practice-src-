package libapp2;

import java.util.ArrayList;
import java.util.Objects;

public class BookRepository {

    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("11111", "Happy Days", "Comedy", "", "Sam Bolton", 10, 5));
        books.add(new Book("22222", "Tom Saywer", "Adventure", "", "Mark Twain", 4, 2));
        books.add(new Book("33333", "Good earth", "Classic", null, "Pearl S Buck", 5, 0));
        books.add(new Book("44444", "Fantastic 4", "Marvel", null, "Carl S S", 5, 0));
        books.add(new Book("55555", "JF Kennedy", "Biography", null, "Edward JR", 5, 0));
        books.add(new Book("66666", "Johnny Good", "Adventure", null, "Edward JR", 5, 0));
        books.add(new Book("77777", "Good morning Alice", "Romance", null, "Nora Roberts", 5, 0));

    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword)) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

}
