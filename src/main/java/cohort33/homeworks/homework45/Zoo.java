package cohort33.homeworks.homework45;

import java.util.Scanner;

public class Zoo {

  private static String[] zooArray = {"Cat", "Dog", "Lama", "Bird", "Elephant", "Snake", "Monkey"};

  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);

    boolean isRun = true;
    while (isRun == true) {
      System.out.print("Input number to choose animal or 7 to exit: ");
      int choiceNumber = inputScanner.nextInt();

      for (int i = 0; i < zooArray.length; i++) {
        if (choiceNumber == 7) {
          System.out.println("I am exiting");
          isRun = false;
          break;
        } else if (choiceNumber == i) {
          System.out.println(zooArray[i]);
        } else if (choiceNumber > zooArray.length + 1) {
//TODO
//          try {
//
//        }
        }
      }
    }

  }
}
