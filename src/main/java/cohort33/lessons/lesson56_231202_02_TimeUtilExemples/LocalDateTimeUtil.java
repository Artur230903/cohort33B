package cohort33.lessons.lesson56_231202_02_TimeUtilExemples;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeUtil {

  public static void main(String[] args) {

    LocalDateTime localDateTime = LocalDateTime.now();
//    System.out.println(localDateTime);
    ZoneId zoneId = ZoneId.of("America/Los_Angeles");
    LocalDateTime localDateTime1 = LocalDateTime.now(zoneId);
//    System.out.println(localDateTime1);

    LocalDateTime localDateTimeFromUnits = LocalDateTime.of(1986,
        01,01, 12, 30, 12);
    System.out.println(localDateTimeFromUnits);
//    localDateTimeFromUnits = localDateTimeFromUnits.plusHours(3);
//    System.out.println(localDateTimeFromUnits);
//    System.out.println(LocalDateTime.now().isEqual(localDateTimeFromUnits));
//    System.out.println(LocalDateTime.now().isAfter(localDateTimeFromUnits));
//    System.out.println(LocalDateTime.now().isBefore(localDateTimeFromUnits));
//    System.out.println(localDateTimeFromUnits.getHour());
//    System.out.println(localDateTimeFromUnits.getMinute());
//    System.out.println(localDateTimeFromUnits.getSecond());




  }

}
