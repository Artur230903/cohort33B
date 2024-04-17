package cohort33.examples.giveCopyOfArray;

import cohort33.lessons.lesson45_231104.homework44.Book;
import java.util.ArrayList;
import java.util.List;

public class giveCopyOfArray {

  //1
  private List<Book> books = new ArrayList<>();

  public List<Book> getBooks() {
    return new ArrayList<>(books);
  }
}
  //2
//  public List<Event> getAllEvents() {
//    return new ArrayList<>(eventList);
//  }
