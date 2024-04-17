package cohort33.homeworks.homework56_01;

import java.util.HashSet;
import java.util.Set;

public class EventScheduler {

  Set<Event> eventsSet = new HashSet<>();

//  TODO constructor for Collection

  public void addEvent(Event eventToAdd) {
    eventsSet.add(eventToAdd);
  }

  public void removeEvent(Event eventToRemove) {
    eventsSet.remove(eventToRemove);
  }

  public void showEvents() {
    for (Event event : eventsSet) {
      System.out.println(event.toString());
    }
  }

  public Set<Event> getAllEvents(){
    return eventsSet;
  }

//  public Set<Event> showEventByDate(LocalDate date) {
//    for (Event event : eventsSet){
//      if (dates(event.getStartDateTime() || event.getEndDateTime()){
//
//      }
//    }
//  }

}
