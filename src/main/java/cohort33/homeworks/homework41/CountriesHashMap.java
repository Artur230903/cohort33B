package cohort33.homeworks.homework41;

import java.util.HashMap;
import java.util.Map;

public class CountriesHashMap {

  private static Map<String, String> capitalMap = new HashMap<>();

  public static void main(String[] args) {

    capitalMap.put("Чехия", "Прага");
    capitalMap.put("США", "Вашингтон");
    capitalMap.put("Великобритания", "Лондон");
    capitalMap.put("Франция", "Париж");
    capitalMap.put("Германия", "Берлин");

    System.out.println("Размеры capitalMap --> " + capitalMap.size());

    showCapitalMap();

    System.out.println("---------");
    capitalMap.replace("США", "Сан-Франциско");
    showCapitalMap();

    System.out.println("---------");
    if (!checkCountry("Испания")) {
      addNewCountry("Испания", "Мадрид");
    }
    showCapitalMap();

    addNewCountry("Испания", "Мадрид");


  }

  private static void showCapitalMap() {
    System.out.println("Элементы capitalMap: ");
    capitalMap.forEach((key, value) -> System.out.println(key + " " + value));
  }

  private static boolean checkCountry(String countryNameKey) {
    return capitalMap.containsKey(countryNameKey);
  }

  private static boolean addNewCountry(String countryNameKey, String countryNameNewValue) {
    if (!checkCountry(countryNameKey)) {
      capitalMap.put(countryNameKey, countryNameNewValue);
      System.out.println("Страна " + countryNameKey + " со столицей" + countryNameNewValue
          + " была успешно добавлена");
      return true;
    } else {
      System.out.println("Страна " + countryNameKey + " найдена");
      return false;
    }
  }

}
