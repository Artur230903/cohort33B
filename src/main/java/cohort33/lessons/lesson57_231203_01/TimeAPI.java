package cohort33.lessons.lesson57_231203_01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeAPI {

  public static void main(String[] args) {

    System.out.println("-----Моё решение-----");
    LocalDateTime localDateTime = LocalDateTime.now();
    String pattern = "dd.MM.yyyy";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
    localDateTime = localDateTime.plusDays(5);
    localDateTime = localDateTime.plusMonths(3);
    System.out.println(localDateTime.format(dateTimeFormatter));

    LocalDateTime localDateTime01 = LocalDateTime.of(2023, 1, 1, 12, 0);
    System.out.println(localDateTime01);
    String pattern01 = "dd LLLL yyyy, hh:KK";
    DateTimeFormatter dateTimeFormatter01 = DateTimeFormatter.ofPattern(pattern01);
    System.out.println(localDateTime01.format(dateTimeFormatter01));
    String patternDate = "dd LLLL yyyy";
    String patternTime = "hh:KK";
    DateTimeFormatter dateTimeFormatterDate = DateTimeFormatter.ofPattern(patternDate);
    DateTimeFormatter dateTimeFormatterTime = DateTimeFormatter.ofPattern(patternTime);
    System.out.println("\"" + localDateTime01.format(dateTimeFormatterDate) + " year, " +
        localDateTime01.format(dateTimeFormatterTime) + "\"");

    ZoneId zoneId01 = ZoneId.of("America/Los_Angeles");
    ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId01);
    System.out.println(zonedDateTime);

    System.out.println("-----Решение Игоря-----");
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate.plusMonths(3).plusDays(5));

    LocalDate localDateOne = LocalDate.of(2030, 01, 01);
    LocalDate localDateTwo = LocalDate.now();

    long result = ChronoUnit.DAYS.between(localDateTwo, localDateOne);
    System.out.println(result);

    System.out.println(checkYear(LocalDate.now()));
    System.out.println(checkYear01(localDate));

  }

  //Напишите функцию, которая возвращает `true`
  //если переданная дата(`LocalDate`) являеться високосным годом.
  //решение 1
  public static boolean checkYear(LocalDate localDate) {
    if (localDate.getMonth().equals(Month.FEBRUARY) && localDate.getDayOfMonth() == 29) {
      return true;
    } else {
      if (localDate.getYear() % 4 == 0) {
        return true;

      }
      return false;
    }
  }

  //решение 2
  public static boolean checkYear01(LocalDate localDate) {
    return localDate.isLeapYear();
  }
}
