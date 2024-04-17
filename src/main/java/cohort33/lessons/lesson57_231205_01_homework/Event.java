package cohort33.lessons.lesson57_231205_01_homework;

import java.time.LocalDateTime;

public class Event {

  private String name;

  private LocalDateTime startDateTime;

  private LocalDateTime endDateTime;

  public Event(String name, LocalDateTime startDateTime, LocalDateTime endDateTime) {
    this.name = name;
    this.startDateTime = startDateTime;
    this.endDateTime = endDateTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(LocalDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public LocalDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(LocalDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  @Override
  public String toString() {
    return "Eventname: " + name +
        ", startDateTime: " + startDateTime +
        ", endDateTime: " + endDateTime;
  }

}
