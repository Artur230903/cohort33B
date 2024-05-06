package cohort33.homeworks.homework61_01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SommelierThread extends Thread {

  private static final Logger LOGGER = LoggerFactory.getLogger(SommelierThread.class);


  private String wineName;

  public SommelierThread(String wineName) {
    this.wineName = wineName;
  }

  public void run() {
    try {
      LOGGER.info("Выбираю вино");
      Thread.sleep(2000);
      LOGGER.info("Вино выбрано: {}", wineName);
    } catch (InterruptedException exception) {
      LOGGER.info("ERROR !!! {}", exception.getMessage());
    }
  }
}
