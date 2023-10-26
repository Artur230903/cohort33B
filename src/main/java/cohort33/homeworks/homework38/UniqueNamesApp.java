package cohort33.homeworks.homework38;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesApp {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Set<String> uniqueNames = new HashSet<>();

    boolean isRun = true;
    while (isRun) {
      System.out.println("Введите имя (если введете `стоп` программа закончит работу)");
      String nameScanner = scanner.next();
      if (!nameScanner.equals("стоп")){
        uniqueNames.add(nameScanner);
      } else if (nameScanner.equals("стоп")) {
        isRun = false;
      }
      else {
        System.err.println("неверный ввод");
      }
    }
    System.out.println(uniqueNames.toString());
  }

}
