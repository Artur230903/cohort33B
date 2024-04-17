package cohort33.lessons.lesson57_231205_01_homework;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EventSchedulerTest {

  private EventScheduler eventScheduler;

  @BeforeEach
  public void setUp(){
    eventScheduler = new EventScheduler();

  }

  @Test
  void testAddEvent() {
    LocalDateTime eventFilmTerminatorStart = LocalDateTime.of(2023, 12, 05, 20, 00, 00);
    LocalDateTime eventFilmTerminatorEnd = LocalDateTime.of(2023, 12, 05, 22, 00, 00);
    Event eventFilmTerminator = new Event("Film Terminator", eventFilmTerminatorStart, eventFilmTerminatorEnd);
    Assertions.assertEquals(0, eventScheduler.getAllEvents().size());//мы убедились что хранилище пустое
    eventScheduler.addEvent(eventFilmTerminator);
    Assertions.assertEquals(1,eventScheduler.getAllEvents().size());//убедились что после добавления одного ивента хранилище увеличилось на одну позицию
    Event checkEvent = eventScheduler.getAllEvents().get(0);
    Assertions.assertEquals(eventFilmTerminator, checkEvent);

  }

  @Test
  void testDeleteEvent() {
    LocalDateTime eventFilmTerminatorStart = LocalDateTime.of(2023, 12, 05, 20, 00, 00);
    LocalDateTime eventFilmTerminatorEnd = LocalDateTime.of(2023, 12, 05, 22, 00, 00);
    Event eventFilmTerminator = new Event("Film Terminator", eventFilmTerminatorStart, eventFilmTerminatorEnd);
    Assertions.assertEquals(0, eventScheduler.getAllEvents().size());//мы убедились что хранилище пустое
    eventScheduler.addEvent(eventFilmTerminator);
    eventScheduler.deleteEvent(eventFilmTerminator);
    Assertions.assertEquals(0,eventScheduler.getAllEvents().size());
  }
}