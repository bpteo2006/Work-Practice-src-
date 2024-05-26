package libapp1;

public class Book {
    private String isbn;
    private String title;
    private String genre;
    private String description;
    private String author;
    private int quantity;
    private int numOfCheckOut;

    public Book(String isbn, String title, String genre, String description, String author, int quantity, int numOfCheckOut) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
        this.quantity = quantity;
        this.numOfCheckOut = numOfCheckOut;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getNumOfCheckOut() {
        return numOfCheckOut;
    }

    public boolean checkOut() {
        if (numOfCheckOut >=  quantity) {
            return false;
        }
        else {
            numOfCheckOut++;
            return true;
        }
    }
    public boolean checkIn() {
        if (numOfCheckOut <= 0) {
            return false;
        }
        else {
            numOfCheckOut--;
            return true;
        }
    }
}
