package cohort33.homeworks.homework56_01;

import java.time.LocalDateTime;

public class EventsMain {

  public static void main(String[] args) {

    Event eventMeetingStart = new Event("MeetingStart",
        LocalDateTime.of(2024, 04, 03, 10, 00),
        LocalDateTime.of(2024, 04, 03, 13, 30));
    Event eventLunch = new Event("Lunch",
        LocalDateTime.of(2024, 04, 03, 13, 31),
        LocalDateTime.of(2024, 04, 03, 14, 00));
    Event eventMeetingEnd = new Event("MeetingEnd",
        LocalDateTime.of(2024, 04, 03, 14, 01),
        LocalDateTime.of(2024, 04, 03, 17,00));

    EventScheduler eventScheduler = new EventScheduler();

    int counter = 1;
    System.out.println("-----" + (counter++) + "-----");
    eventScheduler.addEvent(eventMeetingStart);
    eventScheduler.addEvent(eventLunch);
    eventScheduler.addEvent(eventMeetingEnd);
    eventScheduler.showEvents();

    System.out.println("-----" + (counter++) + "-----");
    eventScheduler.removeEvent(eventLunch);
    eventScheduler.showEvents();

    System.out.println("-----" + (counter++) + "-----");
    eventScheduler.getAllEvents();

  }

}
