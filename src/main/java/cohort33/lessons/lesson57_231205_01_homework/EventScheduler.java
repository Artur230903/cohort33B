package cohort33.lessons.lesson57_231205_01_homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventScheduler {

  private List<Event> eventList;

  public EventScheduler() {
    this.eventList = new ArrayList<>();
  }

  public void addEvent(Event eventToAdd) {
    eventList.add(eventToAdd);
  }

  public void deleteEvent(Event eventToDelete) {
    eventList.remove(eventToDelete);
  }

  public List<Event> getAllEvents() {
    return new ArrayList<>(eventList);
  }

  public List<Event> getEventsOfDate(LocalDate localDate) {
    List<Event> findEvents = new ArrayList<>();
    for (Event event : eventList) {
      if (event.getStartDateTime().toLocalDate().equals(localDate)) {
        findEvents.add(event);
      }
    }
    return findEvents;
  }

  public List<Event> getEventsOfDateTwo(LocalDate localDate) {
    List<Event> findEvents = new ArrayList<>();
    for (Event event : eventList) {
//      if(event.getStartDateTime().getDayOfYear()......)
      if ((event.getStartDateTime().getDayOfMonth()) == localDate.getDayOfMonth() &&
          event.getStartDateTime().getMonth() == localDate.getMonth() &&
          event.getStartDateTime().getYear() == localDate.getYear()) {
        findEvents.add(event);
      }
    }
    return findEvents;
  }
  public boolean checkEventToOverlape(Event eventOne, Event eventTwo){
    if (eventOne.getStartDateTime().isBefore(eventTwo.getEndDateTime()) &&
        eventTwo.getStartDateTime().isBefore(eventOne.getEndDateTime())){
      return true;
    }
    return false;
  }
}
