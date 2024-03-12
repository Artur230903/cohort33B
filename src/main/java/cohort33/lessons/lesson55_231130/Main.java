package cohort33.lessons.lesson55_231130;

import java.util.EnumMap;

public class Main {

  public static void main(String[] args) {
    DayUtil today = new DayUtil(29, Day.WEDNESDAY, Seasons.WINTER);
    DayUtil tomorrow = new DayUtil(30, Day.WEDNESDAY, Seasons.WINTER);

//    today.setDayOfWeek(Day.FRIDAY);

    System.out.println(today.getSeason().ordinal());
    System.out.println(today.getDayOfWeek().ordinal());
    System.out.println(Seasons.values()[0]);
    System.out.println(Seasons.valueOf("WINTER").getDescription());

    System.out.println(today.dayOfWeek.equals(Day.FRIDAY));

    switch (today.dayOfWeek) {
      case MONDAY -> System.out.println("NO");
      case WEDNESDAY -> System.out.println("YES");
      default -> System.out.println("I don`t know");
    }

    EnumMap<Day, String> dayStringEnumMap = new EnumMap<>(Day.class); //(Day.class)это ключь
    dayStringEnumMap.put(Day.MONDAY, "I don`t want to go to work!");
    dayStringEnumMap.put(Day.FRIDAY, "Great - it`s friday!");



  }

}
