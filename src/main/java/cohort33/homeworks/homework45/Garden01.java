package cohort33.homeworks.homework45;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Garden01 {

  public static String[] gardenArray01 =
      new String[]{"cherry", "melon", "apple", "pear", "mango", "banana"};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean isRun = true;
    while (isRun == true) {
      System.out.println("----------");
      System.out.println("Made your chooice: ");
      System.out.println("1.Show choosen element");
      System.out.println("2.Exit");

      int menuChoice = scanner.nextInt();
      switch (menuChoice) {
        case 1:
          showElementByChoice();
          break;
        case 2:
          System.out.println("I am Exiting");
          isRun = false;
          break;
        default:
          System.out.println("Something wrong");
          break;
      }

    }
  }

  public static void showElementByChoice() {
    int choosenElement = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number");
    try {
      choosenElement = scanner.nextInt();
    } catch (InputMismatchException exception) {
      System.out.println("Input must be digit");
      System.out.println("exception:--> " + exception.getLocalizedMessage());
    }
      for (int i = 0; i < gardenArray01.length; i++) {
        if (i == choosenElement) {
          System.out.println(gardenArray01[i]);

        }
      }
    }
  }
