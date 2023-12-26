package cohort33.homeworks.homework42;

import static cohort33.examples.colors.colors.ANSI_BLUE;
import static cohort33.examples.colors.colors.ANSI_RED;
import static cohort33.examples.colors.colors.ANSI_RESET;

import java.util.ArrayList;

public class SportsmanDB05 {

  public static ArrayList<Sportsman05> sportsman05ArrayList = new ArrayList<>();

//  public static void addToSportsmanDB05(Sportsman05 sportsman05) {
//    if (sportsman05.getAge05() >= 18 && sportsman05.getAge05() <= 59) {
//      System.out.println(ANSI_BLUE + sportsman05.getName05() + " have legal age." + ANSI_RESET);
//      sportsman05ArrayList.add(sportsman05);
//    } else {
//      System.out.println(ANSI_RED + sportsman05.getName05() + " have illegal age!" + ANSI_RESET);
//    }
//  }

  public static void showAllSportsmans05() {
    for (Sportsman05 sportsman05 : sportsman05ArrayList) {
      sportsman05.showSportsman05();
    }
  }

  public static void isEligibleForCompetition05(int minAge05, int maxAge05) {
    for (Sportsman05 sportsman05 : sportsman05ArrayList) {
      if (sportsman05.getAge05() >= minAge05 && sportsman05.getAge05() < maxAge05){
        System.out.println(ANSI_BLUE + sportsman05.getName05() + " have legal ege." + ANSI_RESET);
      }
      else {
        System.out.println(ANSI_RED + sportsman05.getName05() + " have illegal age!" + ANSI_RESET);
      }
    }
  }

}
