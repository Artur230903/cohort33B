package cohort33.lessons.lesson55_231130_examplesENUM;

import java.util.EnumSet;

public class Main {

  public static void main(String[] args) {
//    DayUtil today = new DayUtil(29, Day.WEDNESDAY, Seasons.WINTER);
//    DayUtil tomorrow = new DayUtil(30, Day.WEDNESDAY, Seasons.WINTER);
//
////    today.setDayOfWeek(Day.FRIDAY);
//
//    System.out.println(today.getSeason().ordinal());
//    System.out.println(today.getDayOfWeek().ordinal());
//    System.out.println(Seasons.values()[0]);
//    System.out.println(Seasons.valueOf("WINTER").getDescription());
//
//    System.out.println(today.dayOfWeek.equals(Day.FRIDAY));
//
//    switch (today.dayOfWeek) {
//      case MONDAY -> System.out.println("NO");
//      case WEDNESDAY -> System.out.println("YES");
//      default -> System.out.println("I don`t know");
//    }

//    EnumMap<Day, String> dayStringEnumMap = new EnumMap<>(Day.class); //(Day.class)это ключь
//
//    dayStringEnumMap.put(Day.SATURDAY, "It`s weekend");
//    dayStringEnumMap.put(Day.TUESDAY, "It`s not Monday anymore");
//    dayStringEnumMap.put(Day.MONDAY, "I don`t want to go to work!");
//    dayStringEnumMap.put(Day.FRIDAY, "Great - it`s friday!");
//    try {
//      dayStringEnumMap.put(null, "Great - it`s friday!");
//    } catch (NullPointerException exception){
//      System.out.println("NullPointerException " + exception.getMessage());
//    }
//
//    System.out.println(dayStringEnumMap.size());
//    System.out.println(dayStringEnumMap.get(null));
//    System.out.println(dayStringEnumMap.get(Day.FRIDAY));
//    System.out.println(dayStringEnumMap.get(Seasons.AUTUMN));
//    System.out.println(dayStringEnumMap.containsKey(Day.MONDAY));
//    System.out.println(dayStringEnumMap.containsValue("I don`t want to go to work!"));
//    System.out.println(dayStringEnumMap.get(Day.FRIDAY).equals(dayStringEnumMap.get(Day.MONDAY)));
//    System.out.println(dayStringEnumMap.values());
//    System.out.println(dayStringEnumMap.remove(Day.MONDAY));
//    System.out.println(dayStringEnumMap.values());

    EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
    EnumSet<Day> weekendTwo = EnumSet.of(Day.SATURDAY, Day.SUNDAY, Day.MONDAY);
    EnumSet<Day> weekendCopy = EnumSet.copyOf(weekend);
    EnumSet<Day> workingDays = EnumSet.complementOf(weekend);

    boolean week = weekend.addAll(workingDays);

    System.out.println(weekend);
    System.out.println(weekendCopy);
    System.out.println(workingDays);
    System.out.println(week);

    EnumSet<Day> overlap = EnumSet.copyOf(workingDays);
    boolean resultOverlap = overlap.retainAll(weekendTwo);

    System.out.println(resultOverlap);

  }

}
