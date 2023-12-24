package cohort33.homeworks.homework42;

import java.util.ArrayList;

public class SportsmanDB01 {

  private static ArrayList<Sportsman01> sportsman01ArrayList = new ArrayList<>();

  public static void showSportsmanArrayList() {
    for (Sportsman01 sportman : sportsman01ArrayList) {
      System.out.println(sportman);
    }
  }

  public static ArrayList<Sportsman01> getSportsmanArrayList() {
    return sportsman01ArrayList;
  }
  public static ArrayList<Sportsman01> clearSportsmanArrayList(){
    sportsman01ArrayList.clear();
    return sportsman01ArrayList;
  }
}
