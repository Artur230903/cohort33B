package cohort33.homeworks.homework60_01;

public class Task implements Runnable {

  private String line;

  public Task(String line) {
    this.line = line;
  }

  @Override
  public void run() {
    System.out.println(line);
  }



}
