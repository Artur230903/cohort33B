package cohort33.lessons.lesson60_231216_02_Multithreading;

public class TestDemoThreadRunnable {

  public static void main(String[] args) {
    DemoThreadRunnable demo01 = new DemoThreadRunnable("Thread-1");
    demo01.start();

    DemoThreadRunnable demo02 = new DemoThreadRunnable("Thread-2");
    demo02.start();
  }

}
