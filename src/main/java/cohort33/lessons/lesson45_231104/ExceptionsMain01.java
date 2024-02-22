package cohort33.lessons.lesson45_231104;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionsMain01 {

  private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionsMain01.class);


  static int i = 0;

  public static void main(String[] args) throws CloneNotSupportedException {
//    divide(10, 0);

//    giveMeError();

//    divideTwo(10, 1);

    try {
      divideTree(10, 0);
    } catch (ArithmeticException exception) {
      System.out.println("Делил на 0. Простите не знал !!!");
      LOGGER.error(exception.getLocalizedMessage());
    }

    try {
      divideNew(10, 0);
    }catch (CloneNotSupportedException exception){
      System.out.println("Делил на 0. Привет от divideNew");
      LOGGER.error(exception.getLocalizedMessage());

    }
  }



  //----1----
  public static void divide(int numberOne, int numberTwo) {
    int result;
    System.out.println("Запускаем метод");
    result = numberOne / numberTwo;

    try {
      result = numberOne / numberTwo;

    } catch (ArithmeticException exception) {
      System.out.println("Зачем делишь на 0???");
      System.out.println("exception:--> " + exception.getLocalizedMessage());
      result = 0;
    }
    System.out.println(result);
    System.out.println("Завершаем метод");

  }

  //----2----
  public static void divideTwo(int numberOne, int numberTwo) {
    System.out.println("Запускаю метод");
    if (numberTwo == 0) {
      throw new ArithmeticException("Хватит делить на 0 !!!");
    }
    int result = numberOne / numberTwo;
    System.out.println(result);
    System.out.println("Завершаю метод");
  }

  //----3----
  public static void divideTree(int numberOne, int numberTwo) throws ArithmeticException{
    System.out.println("Запускаю метод");
    int result = numberOne / numberTwo;
    System.out.println(result);
    System.out.println("Завершаю метод");

  }

  //----New----
  public static void divideNew (int numberOne, int numberTwo) throws CloneNotSupportedException {
    if (numberTwo == 0){
      throw new CloneNotSupportedException();
    }
  }

  //-----giveMeError------
  public static void giveMeError() {
    i++;
    System.out.println("ERROR!!! " + i);

    try {
      giveMeError();
    } catch (StackOverflowError error) {
      System.out.println("catch");
    }
  }

}
