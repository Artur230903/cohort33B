package cohort33.homeworks.homework45;

import java.util.Scanner;

public class Garden {

  public static String[] gardenString =
      new String[]{"Apple", "Banana", "Potato", "Kirsch", "Cucumber", "Birne"};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean isRun = true;
    while (isRun == true) {
      System.out.println("input number, or 6 for exit");
      int scannerNumber = scanner.nextInt();
      if (scannerNumber == 6) {
        isRun = false;
      } else {
        takingFromArray(scannerNumber);
      }

    }

  }

  public static void takingFromArray(int scannerNumber) {
    for (int i = 0; i < gardenString.length; i++) {
      if (i == scannerNumber) {
        System.out.println(gardenString[i]);
      } else if (scannerNumber > gardenString.length || scannerNumber < 0) {

      }
      else {
        //TODO
//        try {
//
//        }
      }
    }
  }
}
