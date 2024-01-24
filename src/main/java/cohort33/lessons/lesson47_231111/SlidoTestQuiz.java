package cohort33.lessons.lesson47_231111;

public class SlidoTestQuiz {

  public static void main(String[] args) {
//    int result = divide(10, 0);
    int result = divideTwo(10, 0);
    System.out.println(result);
  }

  public static int divide(int numberOne, int numberTwo) {
    if (numberTwo == 0) {
      throw new ArithmeticException("numberOne == 0");
    }
    return numberOne / numberTwo;
  }

  public static int divideTwo(int numberOne, int numberTwo) {
    String numberString = "20A";
    try {
      return numberOne / numberTwo;
    } catch (ArithmeticException | NumberFormatException exception){
      System.out.println("ERROR");
    }
    finally{
      int resultConvert = Integer.parseInt(numberString);
      return resultConvert;
    }
  }

}
