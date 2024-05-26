package libapp1;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("11111");
        app.searchByIsbn("22222");
        app.searchByTitle("good");
        app.checkOutBook("22222");
        app.checkOutBook("22222");
        app.checkOutBook("22222");
        app.checkInBook("22222");
        app.checkOutBook("22222");

    }
}