package cohort33.homeworks.homework42;

import static cohort33.homeworks.homework42.SportsmanDB05.isEligibleForCompetition05;
import static cohort33.homeworks.homework42.SportsmanDB05.showAllSportsmans05;
import static cohort33.homeworks.homework42.SportsmanDB05.sportsman05ArrayList;

public class Main05 {

  public static void main(String[] args) {

    int counterToSeparate = 1;

    System.out.println("-----" + (counterToSeparate++) + "-----");
    Sportsman05 sportsmanJulia = new Sportsman05("Julia", 19, "Monotlon", 38);
    Sportsman05 sportsmanNikolai = new Sportsman05("Nikolai", 22, "Duotlon", 52);
    Sportsman05 sportsmanAnita = new Sportsman05("Anita", 18, "Triatlon", 22);

    System.out.println("-----" + (counterToSeparate++) + "-----");
    sportsman05ArrayList.add(sportsmanJulia);
    sportsman05ArrayList.add(sportsmanNikolai);
    sportsman05ArrayList.add(sportsmanAnita);
    showAllSportsmans05();

    System.out.println("-----" + (counterToSeparate++) + "-----");
    sportsmanAnita.updateRecord05(21);
    showAllSportsmans05();

    System.out.println("-----" + (counterToSeparate++) + "-----");
    sportsmanAnita.updateRecord05(24);
    showAllSportsmans05();

    System.out.println("-----" + (counterToSeparate++) + "-----");
    isEligibleForCompetition05(18,60);
  }

}
