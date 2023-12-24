package cohort33.homeworks.homework42;

import java.util.ArrayList;

public class SportsmanDB03 {

  protected static ArrayList<Sportsman03> sportsman03ArrayList = new ArrayList<>();

  public static void addSportsmanDB03(Sportsman03 sportsman03){
    sportsman03ArrayList.add(sportsman03);
  }

  public static void showSportsmanDB03(){
    for (Sportsman03 sportsman : sportsman03ArrayList) {
      sportsman.showSportsman();

    }

  }

}
