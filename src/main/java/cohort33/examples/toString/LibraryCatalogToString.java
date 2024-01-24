package cohort33.examples.toString;

import cohort33.lessons.lesson45_231104.homework44.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryCatalogToString {

  List<Book> books = new ArrayList<>();

  public void listAllBooks(){
      for (Book book : books) {
        System.out.println(book.toString());
      }
    }
  }
