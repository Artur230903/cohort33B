package cohort33.lessons.lesson45_231104;

public class ExceptionsMain01 {

  static int i = 0;

  public static void main(String[] args) {
//    divide(10, 0);
    giveMeError();
  }

  public static void divide(int numberOne, int numberTwo) {
    int result = numberOne / numberTwo;
    System.out.println(result);
  }

  public static void giveMeError() {
    i++;
    System.out.println("ERROR! " + i);
    giveMeError();
  }

}
