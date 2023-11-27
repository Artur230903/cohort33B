package cohort33.lessons.lesson39_231021;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesApp {

  private static Set<String> uniqueNames;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите элемент (если введете `стоп` программа закончит работу)");

    uniqueNames = new HashSet<>();

    while (true) {
      String nameScanner = scanner.nextLine();
      if (nameScanner.equalsIgnoreCase("СТОП")) {
        break;
      }
      boolean result = uniqueNames.add(nameScanner);
//      if(uniqueNames.add(name))
      if (result) {
        System.out.println("Элемент имя " + nameScanner + " был успешно добавлен");
      } else {
        System.out.println("Элемент имя " + nameScanner + " уже присутствует - НЕ добавлен");

      }

    }
    scanner.close();
    printNames();

  }

  private static void printNames() {
    if (uniqueNames.isEmpty()) {
      System.out.println("Список уникальных имен пуст");
    } else {
      System.out.println("Уникальные имена введенные пользователем: ");
      System.out.println(uniqueNames.toString());
//      for (String name : uniqueNames) {
//        System.out.println(name);
//      }
    }
  }
}
