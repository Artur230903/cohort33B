package cohort33.lessons.lesson61_231219_02_synchronizedThread;

public class ThreadDemoCounter extends Thread{

  private Thread thread;

  private String threadName;

  CounterPrinter counterPrinter;

  public ThreadDemoCounter(String threadName, CounterPrinter counterPrinter) {
    this.threadName = threadName;
    this.counterPrinter = counterPrinter;
  }

  public void run(){
    synchronized (counterPrinter) {
      System.out.println(threadName + " >>>>>>> ");
      counterPrinter.print();
    }
    System.out.println("Thread --> " + threadName + " is done");
  }

  public void start(){
    System.out.println("Start --> " + threadName);
    if (thread == null){
      thread = new Thread(this, threadName);
      thread.start();
    }
  }
}
