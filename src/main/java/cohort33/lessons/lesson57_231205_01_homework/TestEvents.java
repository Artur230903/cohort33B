package cohort33.lessons.lesson57_231205_01_homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TestEvents {

  private static EventScheduler eventScheduler = new EventScheduler();

  public static void main(String[] args) {

    LocalDateTime eventFilmTerminatorStart = LocalDateTime.of(2023, 12, 05, 20, 00, 00);
    LocalDateTime eventFilmTerminatorEnd = LocalDateTime.of(2023, 12, 05, 22, 00, 00);
    Event eventFilmTerminator = new Event("Film Terminator", eventFilmTerminatorStart, eventFilmTerminatorEnd);

    LocalDateTime eventFilmRemboStart = LocalDateTime.of(2023, 12, 05, 21, 00, 00);
    LocalDateTime eventFilmRemboEnd = LocalDateTime.of(2023, 12, 05, 23, 00, 00);
    Event eventFilmRembo = new Event("Film Rembo", eventFilmRemboStart, eventFilmRemboEnd);

    eventScheduler.addEvent(eventFilmTerminator);
    eventScheduler.addEvent(eventFilmRembo);

//    List<Event> allEvents = eventScheduler.getAllEvents();
//    for (Event event: allEvents){
//      System.out.println(event.toString());
//    }

    LocalDate localDate = LocalDate.of(2023, 12, 05);
    List<Event> result = eventScheduler.getEventsOfDateTwo(localDate);
    for (Event event: result){
      System.out.println(event.toString());
    }

    boolean checkOverlape = eventScheduler.checkEventToOverlape(eventFilmTerminator, eventFilmRembo);
    System.out.println(checkOverlape);

    eventScheduler.deleteEvent(eventFilmRembo);

    List<Event> resultAfterDelete = eventScheduler.getAllEvents();
    System.out.println(resultAfterDelete);
  }

}
