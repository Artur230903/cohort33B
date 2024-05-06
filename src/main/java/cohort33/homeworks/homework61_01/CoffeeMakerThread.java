package cohort33.homeworks.homework61_01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeMakerThread extends Thread{

  private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeMakerThread.class);

  public void run(){

    try {
      Thread.sleep(2000);
      LOGGER.info("Кофе мелется");
      Thread.sleep(5000);
      LOGGER.info("Кофе заваривается");
      Thread.sleep(1000);
      LOGGER.info("Кофе готов");

    } catch (InterruptedException exception) {
      LOGGER.error("ERROR !!! {}", exception.getMessage());
    }
  }

//  public void run(){
//    Thread threadCoffeeMaker = null;
//    try {
//      threadCoffeeMaker.wait(2000);
//      System.out.println("Кофе мелется");
//      threadCoffeeMaker.wait(5000);
//      System.out.println("Кофе заваривается");
//      threadCoffeeMaker.wait(1000);
//      System.out.println("Кофе готов");
//    } catch (InterruptedException exception) {
//      System.out.println("There is " + exception.getMessage());
//    }
//
//  }

}
