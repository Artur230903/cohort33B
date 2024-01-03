package cohort33.examples.switchCase;

import java.util.Scanner;

public class exampleSwithCase {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    boolean isRun = true;

    while (isRun){
      System.out.println("1. Add Book");
      System.out.println("2. Remove Book");
      System.out.println("3. Find Book by title");
      System.out.println("4. Show all Books");
      System.out.println("0. Exit");

      int commandMenu = scanner.nextInt();

      switch (commandMenu){
        case 1:

          break;
        case 2:

          break;
        case 3:

          break;
        case 4:

          break;
        case 0:

          break;
        default:

          break;

      }
    }
  }

}
