package cohort33.homeworks.homework50;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    boolean isRun = true;
    int counter = 1;
    File myDir = null;
    File myFile = null;

    while (isRun == true) {

      System.out.println("input your choice");
      System.out.println("1.create dir");
      System.out.println("2.create file");
      System.out.println("3.rename dir");
      System.out.println("4.rename file");
      System.out.println("9.exit");

      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("-----" + (counter++) + "-----");
          myDir = new File("D:\\MyDirectory");
          myDir.mkdir();
          break;

        case 2:
          System.out.println("-----" + (counter++) + "-----");
          myFile = new File(myDir + "\\myFile.txt");
          myFile.createNewFile();
          break;
        case 3:
          System.out.println("-----" + (counter++) + "-----");
          myDir.renameTo(new File("D:\\MyDirToDelete"));
          break;
        case 4:
          System.out.println("-----" + (counter++) + "-----");
          myFile.renameTo(new File("D:\\MyDirectory\\myFileToDelete.txt"));
          break;

        case 9:
          System.out.println("i am exiting");
          isRun = false;
          break;
      }
    }
  }

}
