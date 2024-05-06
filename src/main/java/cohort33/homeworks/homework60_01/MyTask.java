package cohort33.homeworks.homework60_01;

public class MyTask implements Runnable{

  @Override
  public void run(){
    for (int i = 0; i <= 5; i++) {
      System.out.println(i);
      try {
        Thread.sleep(1500);
      } catch (IllegalArgumentException exception01){
        System.out.println("ERROR --> " + exception01.getMessage());
    }
      catch (InterruptedException exception02) {
        System.out.println("ERROR --> " + exception02.getMessage());
      }
      catch (Exception exception03){
        System.out.println("ERROR --> " + exception03.getMessage());
      }
    }
  }

}
