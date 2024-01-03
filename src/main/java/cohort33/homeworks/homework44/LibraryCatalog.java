package cohort33.homeworks.homework44;

import static cohort33.examples.colors.colors.ANSI_BLUE;
import static cohort33.examples.colors.colors.ANSI_CYAN;
import static cohort33.examples.colors.colors.ANSI_GREEN;
import static cohort33.examples.colors.colors.ANSI_RED;
import static cohort33.examples.colors.colors.ANSI_RESET;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LibraryCatalog {

  private static final Logger LOGGER = LoggerFactory.getLogger(LibraryCatalog.class);


  private static ArrayList<Book> bookArrayList = new ArrayList<>();

  public static ArrayList<Book> addBookLibraryCatalog(Book book) {
    LOGGER.info("В каталог добавлена новая книга {}",
        (book.getBookAuthor() + " | " + book.getNameOfBook()));
    bookArrayList.add(book);
    return bookArrayList;
  }

  public static void showAllBooks() {
    LOGGER.debug("Был запрошен каталог всех книг");
    for (Book book : bookArrayList) {
      System.out.println(book.getBookAuthor() + " | " + book.getNameOfBook());
    }
  }

  public static ArrayList<Book> removeBookLibraryCatalog(Book book) {
    LOGGER.info("Из каталога была удалена книга {}",
        (book.getBookAuthor() + " | " + book.getNameOfBook()));
    bookArrayList.remove(book);
    return bookArrayList;
  }

  public static void findBookByTitle(String titleForBookToFind) {
    LOGGER.debug("Произведен поиск книги {}", titleForBookToFind);
    int counter = 0;
    for (Book book : bookArrayList) {
      if (titleForBookToFind.equals(book.getNameOfBook())) {
        System.out.println(ANSI_GREEN + "Book found." + ANSI_RESET);
        System.out.println(
            ANSI_BLUE + book.getBookAuthor() + " | " + book.getNameOfBook() + ANSI_RESET);
        counter++;
      }
    }
    if (counter == 0) {
      LOGGER.error(ANSI_RED + "Книга {}" + ANSI_RED + " не найдена" + ANSI_RESET, ANSI_CYAN + titleForBookToFind + ANSI_RESET);
      System.out.println(ANSI_RED + "No Book found!" + ANSI_RESET);
    }

  }
}
