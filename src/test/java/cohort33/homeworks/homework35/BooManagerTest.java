package cohort33.homeworks.homework35;

import cohort33.homeworks.homework35.BooManager;
import cohort33.homeworks.homework35.Book;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {

  private Book book;

  private BooManager booManager;

  private String isbn = "123456789";

  @BeforeEach
  public void setUp() {
    booManager = new BooManager();
    book = new Book(isbn, "Aab", "Baa Caa");
  }

  @Test
  void testAddBookSuccess() {
    Assertions.assertEquals(0, booManager.getBooks().size());
    booManager.addBook(book);
    Assertions.assertEquals(1, booManager.getBooks().size());
    List<Book> resultListBooks = booManager.getBooks();
    Assertions.assertEquals(book, resultListBooks.get(0));

  }

  @Test
  void testAddBookError() {
    Assertions.assertEquals(0, booManager.getBooks().size());
    booManager.addBook(book);
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      booManager.addBook(book);
    });

  }

  @Test
  void testFindBookByISBNSuccess() {
    booManager.addBook(book);
    Assertions.assertNotNull(booManager.findBookByISBN(isbn));
  }

  @Test
  void testFindBookByISBNFail() {
    booManager.addBook(book);
    Assertions.assertNull(booManager.findBookByISBN("123456789012"));
  }

  @Test
  void testRemoveBookSuccess() {
    booManager.addBook(book);
    Assertions.assertTrue(booManager.removeBook(isbn));
    List<Book> resultListBooks = booManager.getBooks();
    Assertions.assertEquals(0, resultListBooks.size());
  }

  @Test
  void testRemoveBookFail() {
    booManager.addBook(book);
    Assertions.assertFalse(booManager.removeBook("123456789012"));
    List<Book> resultListBooks = booManager.getBooks();
    Assertions.assertEquals(1, resultListBooks.size());
  }

}
