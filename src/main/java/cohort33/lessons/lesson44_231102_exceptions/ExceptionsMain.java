package cohort33.lessons.lesson44_231102_exceptions;

public class ExceptionsMain {
  static int i =0;

  public static void main(String[] args) {
//    divide(10,0);
    giveMeError();
  }

  public static void divide(int numberOne, int numberTwo){
    int result = numberOne / numberTwo;
    System.out.println(result);
  }
  public static void giveMeError(){
    i++;
    System.out.println("ERROR! " + i);
    giveMeError();
  }

}
