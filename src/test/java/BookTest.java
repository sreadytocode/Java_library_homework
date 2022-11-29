import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void hasBookGotATitle(){
        assertEquals("Lord of the Rings", book.getTitle());
    }

    @Test
    public void hasBookGotAnAuthor(){
        assertEquals("JRR Tolkien", book.getAuthor());
    }

    @Test
    public void hasBookGotAGenre(){
        assertEquals("Fantasy", book.getGenre());
    }



}
