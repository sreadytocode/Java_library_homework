import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookGenreTest {
    Library library;
    Book book;
    Borrower borrower;
    BookGenre genre;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        library = new Library(2);
        borrower = new Borrower();
        genre = new BookGenre();
    }


}
