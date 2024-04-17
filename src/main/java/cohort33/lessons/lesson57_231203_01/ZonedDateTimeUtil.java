package cohort33.lessons.lesson57_231203_01;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeUtil {

  public static void main(String[] args) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);

//    for (String zoneId: ZoneId.getAvailableZoneIds()){
//      System.out.println(zoneId);
//    }
    ZoneId zoneIdUSEastern = ZoneId.of("US/Eastern");
    ZonedDateTime zoneDateTimeUSEastern = ZonedDateTime.now(zoneIdUSEastern);
    System.out.println(zoneDateTimeUSEastern);
    System.out.println(zoneDateTimeUSEastern.getZone());
    System.out.println(zoneDateTimeUSEastern.getMonthValue());
    System.out.println(zoneDateTimeUSEastern.getOffset());
    System.out.println(zoneDateTimeUSEastern.getDayOfYear());
    System.out.println(zoneDateTimeUSEastern.minusDays(800));
  }

}
