package cohort33.lessons.lesson60_231216_02_Multithreading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoThreadRunnable implements Runnable {

  private static final Logger LOGGER = LoggerFactory.getLogger(DemoThreadRunnable.class);

  private Thread thread;

  private String threadName;

  public DemoThreadRunnable(String threadName) {
    this.threadName = threadName;
    LOGGER.info("Creating {}", threadName);
  }

  @Override
  public void run() {
    LOGGER.info("Running {} ", threadName);
      for (int i = 4; i > 0; i--) {
        LOGGER.info("Thread: name:{}, i={}", threadName, i);
        try {
        Thread.sleep(100);
        LOGGER.info("Thread name: {} State: {}",threadName, thread.getState().name());
      } catch (InterruptedException exception) {
          LOGGER.error("Thread {} was ended {}", threadName, exception.getMessage());
        }
    }
      LOGGER.info("Thread {} was ended", threadName);
  }
  public void start(){
    LOGGER.info("Start {}", threadName);{
      if (thread == null){
        thread = new Thread(this, threadName);
        thread.start();
      }
    }
  }
}
