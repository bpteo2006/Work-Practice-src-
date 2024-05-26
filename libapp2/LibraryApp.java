package libapp2;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("1 book found. \n\tTitle : %s \n\tGenre: %s \n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        else {
            System.out.println("0 Book found.");
        }
        System.out.println("\n\n");
    }
    public void searchByTitle(String keyword) {
        ArrayList<Book> books = bookRepo.findByTitle(keyword.toLowerCase());
        System.out.printf("%s books found %s", books.size(), (books.size()>0)? ":" : ".");
        for (Book book : books) {
            System.out.printf("\n\tTitle: %s \n\tGenre: %s \n\tAuthor: %s\n", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        System.out.println();
    }
}
