package cohort33.homeworks.homework38;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesApp {

  private static Set<String> uniqueNames;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите имя (если введете `стоп` программа закончит работу)");

    uniqueNames = new HashSet<>();

    boolean isRun = true;
    while (isRun) {
      String nameScanner = scanner.nextLine();
      if (!nameScanner.equalsIgnoreCase("стоп")){
        uniqueNames.add(nameScanner);
      } else if (nameScanner.equalsIgnoreCase("стоп")) {
        isRun = false;
      }
      else {
        System.err.println("неверный ввод");
      }
    }
    scanner.close();
    System.out.println(uniqueNames.toString());
  }

}
