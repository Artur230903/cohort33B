package cohort33.homeworks.homework42;

public class Main01 {

  public static void main(String[] args) {
    SportsmanDB01 sportsmanDB01 = new SportsmanDB01();

    Sportsman01 sportsman01Petr = new Sportsman01("Petr", 24, "Biatlon", 24);
    Sportsman01 sportsman01Viktor = new Sportsman01("Viktor", 22, "Triatlon", 55);

    System.out.println("-----1------");
//    SportsmanDB.clearSportsmanArrayList();
    SportsmanDB01.showSportsmanArrayList();

//    ArrayList<Sportsman> sportsmanArrayListMain = new ArrayList<>();
//    sportsmanArrayListMain.add(sportsmanPetr);
//    System.out.println(sportsmanArrayListMain);

    System.out.println("-----2------");
    SportsmanDB01.getSportsmanArrayList().add(sportsman01Petr);
    SportsmanDB01.getSportsmanArrayList().add(sportsman01Viktor);
    SportsmanDB01.showSportsmanArrayList();

    System.out.println("-----3------");
    Sportsman01.updateRecord("Petr", 25);
    SportsmanDB01.showSportsmanArrayList();

  }

}
