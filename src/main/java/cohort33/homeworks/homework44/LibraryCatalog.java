package cohort33.homeworks.homework44;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LibraryCatalog {

  private static final Logger LOGGER = LoggerFactory.getLogger(LibraryCatalog.class);

  private static ArrayList<Book> books = new ArrayList<>();

  //My addBook method
//  public static ArrayList<Book> addBookLibraryCatalog(Book book) {
//    LOGGER.info("В каталог добавлена новая книга {}",
//        (book.getBookAuthor() + " | " + book.getNameOfBook()));
//    bookArrayList.add(book);
//    return bookArrayList;
//  }

  //Igors addBook method
  public boolean addBook(Book bookToAdd) {
    if (bookToAdd == null) {
      LOGGER.error("Попытка добавить null");
      return false;
    } else {
      LOGGER.info("Книга {} автора {} ISBN {} успешно добавлена",
          bookToAdd.getNameOfBook(), bookToAdd.getBookAuthor(), bookToAdd.getIsbn());
      return books.add(bookToAdd);
    }
  }

  public static void showAllBooks() {
    LOGGER.debug("Был запрошен каталог всех книг");
    for (Book book : books) {
      System.out.println(book.getBookAuthor() + " | " + book.getNameOfBook());
    }
  }

  //My removeBook method
//  public static ArrayList<Book> removeBookLibraryCatalog(Book book) {
//    LOGGER.info("Из каталога была удалена книга {}",
//        (book.getBookAuthor() + " | " + book.getNameOfBook()));
//    bookArrayList.remove(book);
//    return bookArrayList;
//  }

  //Igors removeBook method
  public boolean removeBook(String isbn) {
    //Счетчик удаленных книг
    int counter = 0;
    if (isbn == null) {
      LOGGER.error("Попытка удалить по ISBN null");
      return false;
    }
    Iterator<Book> iterator = books.iterator();
    while (iterator.hasNext()) {
      Book element = iterator.next();
      if (element.getIsbn().equals(isbn)) {
        LOGGER.info("Книга с ISBN {} была удалена", isbn);
        counter++;
        iterator.remove();
      }
    }
    if (counter == 0) {
      LOGGER.warn("Книги для удаления с ISBN {} не было найдено", isbn);
      return false;
    } else {
      LOGGER.info("Было удалено {} книг с ISBN {}", counter, isbn);
      return true;
    }
  }

  //My findBook method
//  public static void findBookByTitleMyMethod(String titleForBookToFind) {
//    LOGGER.debug("Произведен поиск книги {}", titleForBookToFind);
//    int counter = 0;
//    for (Book book : bookArrayList) {
//      if (titleForBookToFind.equals(book.getNameOfBook())) {
//        System.out.println(ANSI_GREEN + "Book found." + ANSI_RESET);
//        System.out.println(
//            ANSI_BLUE + book.getBookAuthor() + " | " + book.getNameOfBook() + ANSI_RESET);
//        counter++;
//      }
//    }
//    if (counter == 0) {
//      LOGGER.error(ANSI_RED + "Книга {}" + ANSI_RED + " не найдена" + ANSI_RESET,
//          ANSI_CYAN + titleForBookToFind + ANSI_RESET);
//      System.out.println(ANSI_RED + "No Book found!" + ANSI_RESET);
//    }
//  }

  //Igors findBook method
  public List<Book> findBookByTitle(String titleBook) {

    List<Book> booksToReturn = new ArrayList<>();

    if (titleBook == null) {
      LOGGER.error("This title is NULL");
      return null;
    } else {
      for (Book book : books){
        if (book.getNameOfBook().equals(titleBook)){
          LOGGER.info("Книга с названием {} была найдена", titleBook);
          booksToReturn.add(book);
        }
      }
      LOGGER.info("Было найдено {} книг с названием {}", booksToReturn.size(), titleBook);
      return booksToReturn;
    }

  }
  public void listAllBooks() {
    if (books.isEmpty()){
      LOGGER.info("В библиотеке нет книг");
    }
    else {
      for (Book book : books) {
        book.toString();
      }
    }
  }

  public static ArrayList<Book> getBooks() {
    return new ArrayList<>(books);
  }
}
