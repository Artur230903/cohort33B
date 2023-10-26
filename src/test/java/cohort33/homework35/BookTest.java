package cohort33.homework35;

import static org.junit.jupiter.api.Assertions.*;

import cohort33.homeworks.homework35.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

  private Book book;

  private String isbn = "123456789";

  @BeforeEach
  public void setUp() {
    book = new Book(isbn, "Aab", "Baa Caa");
  }

  @Test
  void testCreateBook() {
    Book testBook = new Book(isbn, "Aab", "Baa Caa");
    assertNotNull(testBook);
  }

  @Test
  void testGetIsbnOk() {
    Assertions.assertEquals(isbn, book.getIsbn());
  }

  @Test
  void testSetIsbnOk() {
    book.setIsbn("12345678962");
    Assertions.assertEquals("12345678962",book.getIsbn());
    Assertions.assertNotEquals(isbn, book.getIsbn());
  }


}