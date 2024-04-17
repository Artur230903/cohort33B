package cohort33.lessons.lesson58_231209_01_homework;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayUtil {

  private static final Logger LOGGER = LoggerFactory.getLogger(ArrayUtil.class);

  public static void main(String[] args) {

    int[][] arrayForTest = createArray(5, 5);
    System.out.println(findMaxValue(arrayForTest));
    double average = findAvarage(arrayForTest);
    System.out.println(findAvarage(arrayForTest));
    showElementsGraterAvarage(arrayForTest, average);

  }

  public static int[][] createArray(int lineSize, int colSize) {
    int[][] arrayToReturn = new int[lineSize][colSize];
    Random random = new Random();
    for (int i = 0; i < arrayToReturn.length; i++) {
      for (int j = 0; j < arrayToReturn[i].length; j++) {
        int randomInt = random.nextInt(1, 100);
        arrayToReturn[i][j] = randomInt;
        LOGGER.info("ArrayToReturn Position {} {} Value {}", i, j, randomInt);
      }
    }
    return arrayToReturn;
  }

  public static int findMaxValue(int[][] array) {
    int maxValue = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] > maxValue) {
          maxValue = array[i][j];
        }

      }
    }
    LOGGER.info("Max value {}", maxValue);
    return maxValue;
  }

  public static double findAvarage(int[][] array) {
    double sum = 0;
    int count = 0;
    double average = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        count++;
        sum = sum + array[i][j];
      }
    }
    LOGGER.info("Sum {}", sum);
    LOGGER.info("Elements {}", count);
    average = sum / count;
    LOGGER.info("Average: {}", average);
    return average;
  }

  public static void showElementsGraterAvarage(int[][] array, double number) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] > number){
          System.out.println(array[i][j]);
        }
      }
    }
  }

}
