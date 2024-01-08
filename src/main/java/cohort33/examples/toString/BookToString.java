package cohort33.examples.toString;

public class BookToString {

  private String bookAuthor;

  private String nameOfBook;

  private String isbn;

  public BookToString(String bookAuthor, String nameOfBook, String isbn) {
    this.bookAuthor = bookAuthor;
    this.nameOfBook = nameOfBook;
    this.isbn = isbn;
  }

  public String getBookAuthor() {
    return bookAuthor;
  }

  public String getNameOfBook() {
    return nameOfBook;
  }

  public String getIsbn() {
    return isbn;
  }

  @Override
  public String toString() {
    return "Book{" +
        "bookAuthor='" + bookAuthor + '\'' +
        ", nameOfBook='" + nameOfBook + '\'' +
        ", isbn='" + isbn + '\'' +
        '}';
  }
}
