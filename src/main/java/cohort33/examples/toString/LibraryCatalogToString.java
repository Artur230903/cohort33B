package cohort33.examples.toString;

import cohort33.lessons.lesson45_231104.homework44.Book;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LibraryCatalogToString {

  private static final Logger LOGGER = LoggerFactory.getLogger(LibraryCatalogToString.class);


  List<Book> books = new ArrayList<>();

  public void listAllBooks(){
    if (books.isEmpty()){
      LOGGER.info("В библиотеке нат книг");
    }else {
      for (Book book : books) {
        System.out.println(book.toString());
      }
    }
  }
}

