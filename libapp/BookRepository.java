package libapp;

import java.util.ArrayList;
public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        //Book book1 = new Book(isbn "83471", title "The Dead of Night", genre "Horror", description null, author "S.K. Eleton");

       /* books.add(new Book(isbn "83471", title "The Dead of Night", genre "Horror", description null, author "S.K. Eleton"));
        books.add(new Book(isbn "25274", title "Castle and Cremellation", genre "Historical", description null, author "H.P. Andeson"));
        books.add(new Book(isbn "51573", title "The Knight's Sword", genre "Fantsy", description null, author "F.E. Anvil"));
        */
        books.add(new Book("83471", "The Dead of Night", "Horror", null, "S.K. Eleton", 10, 7));
        books.add(new Book("25274", "Castle and Cremellation", "Historical", null, "H.P. Andeson", 5, 1));
        books.add(new Book("51573", "The Knight's Sword", "Fantsy", null, "F.E. Anvil", 4, 9));
        books.add(new Book("25274", "King's Castle", "Fantasy", null, "Enid Blyton", 8, 2));

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
