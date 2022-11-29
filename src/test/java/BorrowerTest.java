import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        library = new Library(2);
        borrower = new Borrower();
    }

    @Test
    public void borrowerStartsEmpty(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void borrowBookFromLibrary(){
        borrower.addToCollection(book);
        library.removeBook(book);
        assertEquals(1, borrower.collectionCount());
        assertEquals(0, library.libraryStock());
    }



}
