package cohort33.lessons.lesson42;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class LogCountriesArrayList {

  //Создайте объект ArrayList<String> с названием countriesList
  private static List<String> countriesList = new ArrayList<>();

//  private static System LoggerFactory;
//  private static final Logger LOGGER = LoggerFactory.getLogger(LogCountriesArrayList.class);

  public static void main(String[] args) {

    String usa = "США";
    countriesList.add("США");
//    LOGGER.info("Добавлена новая страна {}", usa);

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
