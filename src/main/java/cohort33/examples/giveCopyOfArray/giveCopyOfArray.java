package cohort33.examples.giveCopyOfArray;

import cohort33.lessons.lesson45_231104.homework44.Book;
import java.util.ArrayList;
import java.util.List;

public class giveCopyOfArray {

  private List<Book> books = new ArrayList<>();

  public List<Book> getBooks() {
    return new ArrayList<>(books);
  }
}
