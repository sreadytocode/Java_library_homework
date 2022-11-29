import java.util.ArrayList;

public class Borrower {

    public ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addToCollection(Book book) {
        this.collection.add(book);
    }
}
