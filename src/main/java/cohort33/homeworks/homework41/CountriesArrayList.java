package cohort33.homeworks.homework41;

import java.util.ArrayList;
import java.util.List;

public class CountriesArrayList {

  //Создайте объект ArrayList<String> с названием countriesList
  private static List<String> countriesList = new ArrayList<>();

  public static void main(String[] args) {

    countriesList.add("США");
    countriesList.add("Великобритания");
    countriesList.add("Германия");
    countriesList.add("Чехия");
    countriesList.add("Германия");
    countriesList.add("Франция");

    System.out.println("Размеры countriesList --> " + countriesList.size());

    System.out.println("-------");
    showAllCountries();

    System.out.println("-------");
    removeDuplicates();
    showAllCountries();
  }

  private static void showAllCountries() {
    System.out.println("Элементы countriesList: ");
    for (String country : countriesList) {
      System.out.println(country);
    }
  }

  private static void removeDuplicates() {
    List<String> uniqueCountries = new ArrayList<>();
    for (String country : countriesList) {
      if (!uniqueCountries.contains(country)) {
        uniqueCountries.add(country);
      }
    }
    countriesList = new ArrayList<>(uniqueCountries);
    System.out.println("Дубликаты были удалены");

  }

}
