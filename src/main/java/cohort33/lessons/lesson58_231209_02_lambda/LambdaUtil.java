package cohort33.lessons.lesson58_231209_02_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class LambdaUtil {


  //(arguments) -> (body)
  public static void main(String[] args) {
    //Напишите lambda-выражение для перебора всех элементов списка строк и их печати.
    List<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("JavaScript");
    list.forEach(element -> System.out.println(element));

    //Используйте lambda-выражения и Stream API для фильтрации списка целых чисел,
    // оставляя только числа больше 10, и соберите их в новый список.
    List<Integer> numbers = Arrays.asList(4, 12, 54, 9, 7, 22, 76, 34, 5, 3, 9);
    List<Integer> numbersSelected = numbers.stream().filter(number -> number > 10)
        .collect(Collectors.toList());
    System.out.println(numbersSelected);

    List<Integer> numbersSelected01 = numbers.stream().filter(number -> number > 10)
        .toList();
    System.out.println(numbersSelected01);

    //Используйте lambda-выражения для вычисления суммы всех чисел в списке.
    List<Integer> integerList = Arrays.asList(4,6,3,6,8,9,34,56,87,77,21,43);
    int sum = integerList.stream().reduce(0, (a, b) -> a + b);
    System.out.println("Sum: " + sum);

    //Используйте lambda-выражения для преобразования списка строк в список их длин.
    List<String> stringList = Arrays.asList("Hallo", "Java", "Deutschland");
    List<Integer> wordsLength = stringList.stream().map(String::length).toList();
    System.out.println(wordsLength);

    //Используйте lambda-выражения и метод `removeIf`
    // для удаления всех строк из списка, которые начинаются с буквы "J".
    List<String> listWords = new ArrayList<>();
    listWords.add("Hallo");
    listWords.add("Java");
    listWords.add("hello");
    listWords.add("Python");
    boolean result = listWords.removeIf(word -> word.startsWith("Ja"));
    System.out.println(result);
    System.out.println(listWords);

    //Используйте lambda-выражения и `Collections.max()`
    // для поиска максимального числа в списке.
    List<Integer> integerListNumbers = Arrays.asList(4,6,3,6,8,9,34,56,87,77,21,43);
    int maxNumber = Collections.max(integerListNumbers, Integer::compare);
    int minNumber = Collections.min(integerListNumbers, Integer::compare);
    System.out.println(maxNumber);
    System.out.println(minNumber);

    //Используйте lambda-выражения для удвоения каждого числа в массиве целых чисел.
    integerListNumbers.replaceAll(element -> element * 2);
    System.out.println(integerListNumbers);

    //Найдите первый элемент в списке строк, который начинается с буквы "C"
    // и длиннее трёх символов.
    List<String> cities = Arrays.asList("New York", "Chicago", "Berlin", "China-Town");
    String foundCity = cities.stream().filter(city -> city.startsWith
        ("C") && city.length() > 3).findFirst().orElse("Not found");
    System.out.println(foundCity);

  }

}
