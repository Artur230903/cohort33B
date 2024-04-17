package cohort33.homeworks.homework56_02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

public class EventScheduler {

  HashSet<Event> eventHashSet = new HashSet<>();

  public boolean addEvent(Event eventToAdd) {
    return eventHashSet.add(eventToAdd);
  }

  public boolean removeEvent(Event eventToRemove) {
    return eventHashSet.remove(eventToRemove);
  }

  public void showEvents(){
    System.out.println(eventHashSet.toString());
  }

  public void showEventToDate(LocalDate localDate){
    for (Event event: eventHashSet){
      if (localDate.equals(event.getStartDateTime().toLocalDate())){
        showEvents();
      }
    }
  }
  public void findIntersectEvents(LocalDateTime localDateTime){
    for (Event event: eventHashSet){
      if (localDateTime.isBefore(event.getEndDateTime())){
        showEvents();
      }
    }
  }

}
