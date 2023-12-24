package cohort33.homeworks.homework42;

import static cohort33.homeworks.homework42.SportsmanDB04.showAllSportsmans04;

public class Main04 {

  public static void main(String[] args) {

    int counterForSeporator = 1;

    System.out.println("-----" + (counterForSeporator++) + "-----");
    Sportsman04 sportsmanViktor04 = new Sportsman04("Viktor04", 19, "Quatrotlon", 118);
    SportsmanDB04.addSportsman04(sportsmanViktor04);
    showAllSportsmans04();

    System.out.println("-----" + (counterForSeporator++) + "-----");
    Sportsman04 sportsmanRita04 = new Sportsman04("Rita04", 18, "Triatlon", 74);
    SportsmanDB04.addSportsman04(sportsmanRita04);
    showAllSportsmans04();

    System.out.println("-----" + (counterForSeporator++) + "-----");
    Sportsman04 sportsmanMargo04 = new Sportsman04("Margo04", 21, "Duatlon", 95);
    SportsmanDB04.addSportsman04(sportsmanMargo04);
    showAllSportsmans04();

    System.out.println("-----" + (counterForSeporator++) + "-----");
    sportsmanMargo04.setNewRecord04(94);
    showAllSportsmans04();

    System.out.println("-----" + (counterForSeporator++) + "-----");
    sportsmanMargo04.setNewRecord04(96);
    showAllSportsmans04();
  }

}
