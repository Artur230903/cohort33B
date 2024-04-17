package cohort33.lessons.lesson56_231202_02_TimeUtilExemples;

import java.time.LocalTime;

public class LocalTimeUtil {

  public static void main(String[] args) {

    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);

    LocalTime time = LocalTime.of(20, 00, 00);
    System.out.println(time);
    time = time.plusHours(2);
    System.out.println(time);
    time = time.minusHours(4);
    System.out.println(time);

    LocalTime timeFromSeconds = LocalTime.ofSecondOfDay(300); //"количество дней в указанных секундах"
    System.out.println(timeFromSeconds);

    LocalTime timeFromSeconds01 = LocalTime.ofSecondOfDay(3000);
    System.out.println(timeFromSeconds01);


  }

}
