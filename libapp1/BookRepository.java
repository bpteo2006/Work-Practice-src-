package libapp1;

import java.util.ArrayList;
public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("12345", "Johnny Good", "Adventure", null, "Edward JR", 5, 0));
        books.add(new Book("22222", "Good morning Alice", "Romance", null, "Nora Roberts", 3, 0));
        books.add(new Book("33333", "Good earth", "Classic", null, "Pearl S Buck", 5, 0));
        books.add(new Book("44444", "Fantastic 4", "Marvel", null, "Carl S S", 5, 0));
        books.add(new Book("55555", "JF Kennedy", "Biography", null, "Edward JR", 5, 0));
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
