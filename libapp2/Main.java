package libapp2;

public class Main {
    public static void main(String[] args){
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("11111");
        app.searchByTitle("good");
    }
}
