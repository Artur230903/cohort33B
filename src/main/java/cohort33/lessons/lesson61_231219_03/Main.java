package cohort33.lessons.lesson61_231219_03;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    Counter counter = new Counter();
    CounterTread tread01 = new CounterTread(counter);
    CounterTread tread02 = new CounterTread(counter);

    tread01.start();
    tread02.start();

    tread01.join();
    tread02.join();

    System.out.println("Counter --> " + counter.getCount());
  }
}
