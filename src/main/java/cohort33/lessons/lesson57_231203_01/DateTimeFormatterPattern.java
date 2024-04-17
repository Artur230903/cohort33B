package cohort33.lessons.lesson57_231203_01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPattern {

  public static void main(String[] args) {

    LocalDateTime localDateTime = LocalDateTime.now();

    String pattern22 = "dd-MM-yy";
    DateTimeFormatter dateTimeFormatter22 = DateTimeFormatter.ofPattern(pattern22);
    System.out.println(dateTimeFormatter22.format(localDateTime));

    String pattern4444 = "dd-MM-yyyy";
    DateTimeFormatter dateTimeFormatter4444 = DateTimeFormatter.ofPattern(pattern4444);
    System.out.println(dateTimeFormatter4444.format(localDateTime));

    String patternMMddyy = "MM.dd*YYYY-eeee-e/c-d/L-LLLL";
    DateTimeFormatter dateTimeFormatterMMddyy = DateTimeFormatter.ofPattern(patternMMddyy);
    System.out.println(dateTimeFormatterMMddyy.format(localDateTime));

    DateTimeFormatter dateTimeFormatterISO = DateTimeFormatter.ISO_DATE;
    System.out.println(localDateTime.format(dateTimeFormatterISO));
    System.out.println(LocalDate.now().format(dateTimeFormatterISO));

    String pattern = "dd.MM.yyyy";
    DateTimeFormatter dateTimeFormatter01 = DateTimeFormatter.ofPattern(pattern);
    System.out.println(dateTimeFormatter01.format(localDateTime));

    String dateToParse = "10.10.2020";
    LocalDate localDateParsed = LocalDate.parse(dateToParse, dateTimeFormatter01);
    System.out.println(localDateParsed.getYear());

  }
}
