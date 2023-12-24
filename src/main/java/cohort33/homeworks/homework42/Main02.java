package cohort33.homeworks.homework42;

import static cohort33.homeworks.homework42.Sportsman02.updateRecord;
import static cohort33.homeworks.homework42.SportsmanDB02.showAllSportsmans;

public class Main02 {

  public static void main(String[] args) {

    System.out.println("-----1-----");
    Sportsman02 sportsmanIrina = new Sportsman02("Irina", 22, "Fencing", 54);
    SportsmanDB02.getArrayListSportsmanDB02().add(sportsmanIrina);
    showAllSportsmans();

    System.out.println("-----2-----");
    updateRecord("Irina", 55);
    showAllSportsmans();


    System.out.println("-----3-----");
    Sportsman02 sportsmanViktor = new Sportsman02("Viktor", 23, "Tennis", 28);
    SportsmanDB02.getArrayListSportsmanDB02().add(sportsmanViktor);
    showAllSportsmans();


    System.out.println("-----4-----");
    updateRecord("Irina", 55);
    showAllSportsmans();


    System.out.println("-----5-----");
    showAllSportsmans();
  }

}
