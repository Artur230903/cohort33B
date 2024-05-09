package cohort33.lessons.lesson61_231219_03;

public class CounterTread extends Thread {

  private Counter counter;

  public CounterTread(Counter counter) {
    this.counter = counter;
  }

  public void run() {
    for (int i = 0; i < 100; i++) {
      counter.increment();
      System.out.println(super.getName() + " i = " + i + " counter " + counter.getCount());
    }
    try {
      Thread.sleep(100);
    } catch (InterruptedException exception) {
      System.out.println("ERROR !!!" + exception.getMessage());
    }
  }

}
