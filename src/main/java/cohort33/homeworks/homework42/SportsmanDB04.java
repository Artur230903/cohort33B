package cohort33.homeworks.homework42;

import java.util.ArrayList;

public class SportsmanDB04 {

  public static ArrayList<Sportsman04> sportsman04ArrayList = new ArrayList<>();

  public static void addSportsman04(Sportsman04 sportsman04) {
    if (sportsman04.getAge04() >= 18 && sportsman04.getAge04() <= 59) {
      System.out.println("Age for " + sportsman04.getName04() + " is passed.");
      sportsman04ArrayList.add(sportsman04);
    } else {
      System.out.println("Age is illegal!");
    }
  }

  public static void showAllSportsmans04() {
    for (Sportsman04 sportsmanDB04 : sportsman04ArrayList) {
      sportsmanDB04.showSportsman04();
    }
  }

}
