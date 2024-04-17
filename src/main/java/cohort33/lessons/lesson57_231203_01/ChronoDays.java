package cohort33.lessons.lesson57_231203_01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoDays {

  public static void main(String[] args) {

    LocalDate localDateOne = LocalDate.of(2030,01,01);
    LocalDate localDateTwo = LocalDate.now();

    long result = ChronoUnit.DAYS.between(localDateTwo, localDateOne);
    System.out.println(result);
  }

}
