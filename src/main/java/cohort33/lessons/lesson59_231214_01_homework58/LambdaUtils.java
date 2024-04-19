package cohort33.lessons.lesson59_231214_01_homework58;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaUtils {

  public static void main(String[] args) {
    List<String> cars = Arrays.asList("VW", "BMW", "Skoda", "Seat", "Audi");
    cars.stream().filter(car -> car.startsWith("S")).sorted().forEach(System.out::println);

    int counter = 1;
    System.out.println("-----" + (counter++) + "-----");
    List<String> cities = Arrays.asList("Berlin", "London", "Paris", "Madrid", "Lisboa");
    System.out.println(cities.stream().sorted().toList());
    System.out.println(cities.stream().filter(c -> c.startsWith("L")).
        map(String::toUpperCase).sorted().toList());

    System.out.println("-----" + (counter++) + "-----");
    cities.stream().filter(c -> c.startsWith("L"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

    System.out.println("-----" + (counter++) + "-----");
    Optional<String> resultSelect = cities.stream().filter(c -> c.startsWith("P"))
        .findFirst()
        .map(String::toUpperCase);
    if (resultSelect.isPresent()){
      System.out.println(resultSelect.get());
    }
    else {
      System.out.println("Nothing found");
    }

  }

}
