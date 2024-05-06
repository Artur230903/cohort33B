package cohort33.lessons.lesson61_231219_02_synchronizedThread;

public class TestCounterPrinter {

  public static void main(String[] args) {
    CounterPrinter counterPrinter = new CounterPrinter();

    ThreadDemoCounter threadDemoCounter01 = new ThreadDemoCounter("Thread-1", counterPrinter);
    ThreadDemoCounter threadDemoCounter02 = new ThreadDemoCounter("Thread-2", counterPrinter);

    threadDemoCounter01.start();
    threadDemoCounter02.start();

    try {
      threadDemoCounter01.join();
      threadDemoCounter02.join();
    } catch (InterruptedException exception) {
      System.out.println("Interrupted");
    }


  }

}
