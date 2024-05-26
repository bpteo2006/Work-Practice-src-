package libapp1;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("1 book found.\n\tTitle: %s \n\tGenre: %s \n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        else {
            System.out.println("0 book found.");
        }
        System.out.println("\n\n");
    }
    public void searchByTitle(String keyword) {
        ArrayList<Book> books = bookRepo.findByTitle(keyword.toLowerCase());
        System.out.printf("%s books found%s\n", books.size(), (books.size() > 0)? ":" : ".");
        for (Book book : books) {
            System.out.printf("\tTitle : %s \n\tGenre : %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        System.out.println();
    }

    public void checkOutBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkOut()) {
                System.out.println("Check out SUCCESSFULL");
                System.out.printf("\n\tTitle: %s \n\tGenre: %s \n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
            } else {
                System.out.println("Check out FAILED");
                System.out.printf("\n\tTitle: %s \n\tGenre: %s \n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
                System.out.printf("More books checked out than recorded quantity");
            }
            System.out.println();
        }
        else {
            System.out.println("Failed to check out book\n");
            System.out.printf("Reason: There is no book with ISBN %s on record.", isbn);
        }
        System.out.println("\n");
    }
    public void checkInBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkIn()) {
                System.out.println("Check in SUCCCESSFULL");
                System.out.printf("\n\tTitle: %s \n\tGenre: %s \n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
            }
            System.out.println("\n");
        }

    }

}
