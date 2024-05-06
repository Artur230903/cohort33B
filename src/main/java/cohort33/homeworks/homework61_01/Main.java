package cohort33.homeworks.homework61_01;

public class Main {

  public static void main(String[] args) {
//    BartenderThread bartenderTee = new BartenderThread("Bartender Tee");
//    BartenderThread bartenderCofee = new BartenderThread("Bartender Cofee");
//    BartenderThread bartenderCoctail = new BartenderThread("Bartender Coctail");
//    bartenderTee.run();
//    bartenderCofee.run();
//    bartenderCoctail.run();

    BartenderThread threadTee = new BartenderThread();
    BartenderThread threadCofee = new BartenderThread();
    BartenderThread threadCoctail = new BartenderThread();
    CoffeeMakerThread coffeeMakerThread = new CoffeeMakerThread();
    threadTee.start();
    threadCofee.start();
    threadCoctail.start();
    coffeeMakerThread.start();

    SommelierThread wineBurgundi = new SommelierThread("Burgundi");

    wineBurgundi.start();

  }

}
