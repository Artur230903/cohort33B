package cohort33.lessons.lesson61_231219_03;

public class Counter {

  private int count;

  public synchronized void increment() {
    count++;
  }

  public synchronized int getCount() {
    return count;
  }
}
