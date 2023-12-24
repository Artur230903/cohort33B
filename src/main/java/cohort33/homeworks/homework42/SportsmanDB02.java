package cohort33.homeworks.homework42;

import java.util.ArrayList;
import static cohort33.homeworks.homework42.Sportsman02.showThisSportsman;

public class SportsmanDB02 {

  private static ArrayList<Sportsman02> arrayListSportsmanDB02 = new ArrayList<>();

  public static ArrayList<Sportsman02> getArrayListSportsmanDB02() {
    return arrayListSportsmanDB02;
  }
  public static void showAllSportsmans(){
    for (Sportsman02 sportsman : arrayListSportsmanDB02) {
      System.out.println(showThisSportsman());
    }
  }
}
