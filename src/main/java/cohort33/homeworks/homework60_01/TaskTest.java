package cohort33.homeworks.homework60_01;

public class TaskTest {
  public static void main(String[] args) {

    int counter = 1;
    System.out.println("-----" + (counter++) + "-----");
    Task task01 = new Task("AAB");
    Task task02 = new Task("BBC");
    Task task03 = new Task("CCD");
    Thread thread01 = new Thread(task01);
    Thread thread02 = new Thread(task02);
    Thread thread03 = new Thread(task03);
    thread01.start();
    thread02.start();
    thread03.start();

    System.out.println("-----" + (counter++) + "-----");
    MyTask myTask01 = new MyTask();
    Thread threadMyTask01 = new Thread(myTask01);
    Thread threadMyTask02 = new Thread(myTask01);
    threadMyTask02.start();
    threadMyTask01.start();

  }
}
