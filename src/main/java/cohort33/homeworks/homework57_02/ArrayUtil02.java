package cohort33.homeworks.homework57_02;

import java.util.Random;

public class ArrayUtil02 {

  static Random random;

  public static int[][] makeMultiDimensionalArray(int lineSize, int colSize){
    random = new Random();
    int arrayInt;
    int[][] array = new int[lineSize][colSize];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        arrayInt = random.nextInt(1, 101);
        array[i][j] = arrayInt;
        System.out.println(array[i][j]);

      }

    }
    return array;
  }


  public static void main(String[] args) {

    makeMultiDimensionalArray(5,5);


  }

}
