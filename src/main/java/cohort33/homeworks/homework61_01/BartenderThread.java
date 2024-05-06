package cohort33.homeworks.homework61_01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BartenderThread extends Thread {

  private static final Logger LOGGER = LoggerFactory.getLogger(BartenderThread.class);

//  private String name;
//
//  public BartenderThread(String name) {
//    this.name = name;
//  }

  public void run() {
    try {
      LOGGER.info("Готовлю напиток");
      Thread.sleep(8500);
      LOGGER.info("Напиток готов");
    } catch (InterruptedException exception) {
      LOGGER.error("ERROR !!! {}", exception.getMessage());
    }

  }

}
