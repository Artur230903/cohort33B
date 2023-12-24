package cohort33.homeworks.homework42;

import static cohort33.examples.colors.colors.ANSI_GREEN;
import static cohort33.examples.colors.colors.ANSI_RED;
import static cohort33.examples.colors.colors.ANSI_RESET;

import java.util.ArrayList;

public class SportsmanDB04 {

  public static ArrayList<Sportsman04> sportsman04ArrayList = new ArrayList<>();

  public static void addSportsman04(Sportsman04 sportsman04) {
    if (sportsman04.getAge04() >= 18 && sportsman04.getAge04() <= 59) {
      System.out.println(ANSI_GREEN + "Age for " + sportsman04.getName04() + " is passed."+ANSI_RESET);
      sportsman04ArrayList.add(sportsman04);
    } else {
      System.out.println(ANSI_RED + "Age is illegal!" + ANSI_RESET);
    }
  }

  public static void showAllSportsmans04() {
    for (Sportsman04 sportsmanDB04 : sportsman04ArrayList) {
      sportsmanDB04.showSportsman04();
    }
  }

}
