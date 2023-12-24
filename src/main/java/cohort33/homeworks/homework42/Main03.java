package cohort33.homeworks.homework42;

import static cohort33.homeworks.homework42.SportsmanDB03.addSportsmanDB03;
import static cohort33.homeworks.homework42.SportsmanDB03.showSportsmanDB03;

public class Main03 {

  public static void main(String[] args) {
    int counterForSeparation = 1;
    System.out.println("----" + (counterForSeparation++) + "----");

    Sportsman03 sportsmanViktoria = new Sportsman03("Viktoria", 18, "Biatlon", 112);
    Sportsman03 sportsmanDenis = new Sportsman03("Denis", 59, "Monotlon", 84);

    addSportsmanDB03(sportsmanViktoria);
    addSportsmanDB03(sportsmanDenis);



    System.out.println("----" + (counterForSeparation++) + "----");
    showSportsmanDB03();

    System.out.println("----" + (counterForSeparation++) + "----");
    sportsmanViktoria.setNewRecord(111);
    showSportsmanDB03();

    System.out.println("----" + (counterForSeparation++) + "----");
    sportsmanViktoria.setNewRecord(115);
    showSportsmanDB03();

    System.out.println("----" + (counterForSeparation++) + "----");
    sportsmanDenis.setNewRecord(78);
    showSportsmanDB03();

    System.out.println("----" + (counterForSeparation++) + "----");
    sportsmanDenis.setNewRecord(85);
    showSportsmanDB03();

  }

}
