package cohort33.examples.exceptions;

public class ExceptionsMainTryCatch {

  static int i = 0;

  public static void main(String[] args) {
    divide(10, 0);
  }

  public static void divide(int numberOne, int numberTwo) {
    int result;
    System.out.println("Запускаем метод");

    try {
      result = numberOne / numberTwo;
    }
      catch(ArithmeticException exception){
        System.out.println("Зачем делиш на 0???");
        System.out.println("exception:--> " + exception.getLocalizedMessage());
        result = 0;
      }
    System.out.println(result);
    System.out.println("Завершаем метод");

  }

}
