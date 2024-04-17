package cohort33.homeworks.homework56_02;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EventMain {

  public static void main(String[] args) {

    Event eventMeetingStart = new Event("MeetingStart",
        LocalDateTime.of(2024, 04, 03, 10, 00),
        LocalDateTime.of(2024, 04, 03, 13, 30));
    Event eventLunch = new Event("Lunch",
        LocalDateTime.of(2024, 04, 03, 13, 30),
        LocalDateTime.of(2024, 04, 03, 14, 00));
    Event eventMeetingEnd = new Event("MeetingEnd",
        LocalDateTime.of(2024, 04, 03, 14, 00),
        LocalDateTime.of(2024, 04, 03, 17, 00));

    int counter = 1;
    EventScheduler eventScheduler02 = new EventScheduler();

    System.out.println("-----" + (counter++) + "-----");
    eventScheduler02.addEvent(eventMeetingStart);
    eventScheduler02.addEvent(eventLunch);
    eventScheduler02.addEvent(eventMeetingEnd);
    eventScheduler02.showEvents();

    System.out.println("-----" + (counter++) + "-----");
    eventScheduler02.removeEvent(eventLunch);
    eventScheduler02.showEvents();

    eventScheduler02.addEvent(eventLunch);
    eventScheduler02.showEvents();

    System.out.println("-----" + (counter++) + "-----");
    LocalDate localDate = LocalDate.of(2024, 04, 03);
    eventScheduler02.showEventToDate(localDate);

    System.out.println("-----" + (counter++) + "-----");
    LocalDateTime localDateTime = LocalDateTime.of(2024, 04, 03, 14, 00);
    eventScheduler02.findIntersectEvents(localDateTime);


  }

}
