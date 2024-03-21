package cohort33.lessons.lesson55_231130_TimeUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeUtil {

  public static void main(String[] args) {

    LocalDate localDate = LocalDate.now();
    System.out.println(localDate.getYear());
    System.out.println(localDate.getYear() + " " + localDate.getMonth() +
        " " + localDate.getDayOfWeek());

      LocalDateTime localDateTime = LocalDateTime.now();
      System.out.println(localDateTime.getHour() + " " + localDateTime.getMinute() + " " +
          localDateTime.getSecond() + " " + localDateTime.getNano());

  }

}
