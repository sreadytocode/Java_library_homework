import java.util.ArrayList;

public class Library {

    public ArrayList<Book> stock;

    private Integer capacity;

    public Library(Integer capacity) {
        this.stock = new ArrayList<> ();
        this.capacity = capacity;
    }

    public int libraryStock() {
        return this.stock.size();
    }

    public void addToLibrary(Book book) {

        if (this.capacity > this.stock.size()){
            this.stock.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void removeBook(Book book) {
        this.stock.remove(book);
    }
}
