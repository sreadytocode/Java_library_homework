import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        library = new Library(2);
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.libraryStock());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addToLibrary(book);
        assertEquals(1, library.libraryStock());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.removeBook(book);
        assertEquals(0, library.libraryStock());
    }

    @Test
    public void hasNumberOfCapacity(){
        assertEquals(2,library.getCapacity());
    }

    @Test
    public void willCheckStockIsFullBeforeAddingABook(){
        Book book1 = new Book("Dune", "Frank Herbert", "Sci-fi");
        Book book2 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        Book book3 = new Book("The Last Wish", "Andrzej Sapkowski", "Fantasy");
        library.addToLibrary(book1);
        library.addToLibrary(book2);
        library.addToLibrary(book3);
        assertEquals(2, library.libraryStock());

    }

}
