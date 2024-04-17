package cohort33.lessons.lesson56_231202_02_TimeUtilExemples;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class DateUtil {

  public static void main(String[] args) {

    LocalDate localDateGermany = LocalDate.now();
    System.out.println("localDateGermany --> " + localDateGermany);

    ZoneId zoneId = ZoneId.of("America/Los_Angeles");
    LocalDate localDateGermanyLos_Angeles = LocalDate.now(zoneId);
    System.out.println("localDateGermanyLos_Angeles --> " + localDateGermanyLos_Angeles);

    LocalDate localDate1985 = LocalDate.of(1985, Month.APRIL, 12);
    System.out.println(localDate1985);

    LocalDate localDate1988 = LocalDate.ofYearDay(1988, 366);
    System.out.println(localDate1988);

    System.out.println(localDate1985.getDayOfYear());
    System.out.println(localDate1985.getMonth());
    System.out.println(localDate1985.getMonth().name().toLowerCase());

    LocalDate localDate = LocalDate.now();
    localDate = localDate.plusDays(15);
    System.out.println(localDate);
    localDate = LocalDate.now();
    localDate = localDate.minusDays(10);
    System.out.println(localDate);



  }

}
