package cohort33.homeworks.homework41;

import java.util.HashSet;
import java.util.Set;

public class CountriesHashSet {

  private static Set<String> countriesSet = new HashSet<>();

  public static void main(String[] args) {

    countriesSet.add("США");
    countriesSet.add("Великобритания");
    countriesSet.add("Германия");
    countriesSet.add("Чехия");
    countriesSet.add("Германия");
    countriesSet.add("Франция");

    System.out.println("Размеры countriesList --> " + countriesSet.size());

    showAllCountries();

  }

  private static void showAllCountries() {
    System.out.println("Элементы countriesList: ");
    for (String country : countriesSet) {
      System.out.println(country);
    }
  }

}
