package libapp;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        /*app.searchByIsbn("25274");
        app.searchByIsbn("29716");
        app.searchByIsbn("83471");*/

        app.searchByTitle("night");
        app.checkOutBook("25274");
        app.checkOutBook("29716");
        app.checkOutBook("83471");
        app.checkOutBook("83471");
        app.checkOutBook("83471");
        app.checkOutBook("83471");
    }
}
